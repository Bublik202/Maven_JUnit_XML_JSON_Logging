

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

public class SuffixingAppImpl {	
	private static final Logger LOGGER = Logger.getLogger(SuffixingAppImpl.class.getName()); 
	private String mode;
	private String suffix;
	private List<String> files;
	
	public void execution(String path) {
		Properties properties = new Properties();
		
		try (FileReader reader = new FileReader(path)) {			
			 properties.load(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mode = properties.getProperty("mode");
		suffix = properties.getProperty("suffix");
		String strFile = properties.getProperty("files");

		if(!badModel(mode)) {
			LOGGER.severe("Mode is not recognized: " + mode);
			return;
		}
		if(suffix == null || suffix.trim().isEmpty()) {
			LOGGER.severe("No suffix is configured");
			return;
		}
		if(strFile == null || strFile.isEmpty()) {
			LOGGER.warning("No files are configured to be copied/moved");
			return;
		}				
		files = List.of(strFile.split(":"));
		for (String file : files) {
			Path pathFile = Path.of(file); 
			if(Files.notExists(pathFile)) {
				LOGGER.severe("No such file: " + file);
			}
			
			String fileSuffix = addSuffix(file, suffix);
			Path pathSuffix = Path.of(fileSuffix);
			if(mode.equalsIgnoreCase("copy")) {
				try {
					Files.copy(pathFile, pathSuffix, StandardCopyOption.REPLACE_EXISTING);
					LOGGER.info(file + " -> " +fileSuffix);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(mode.equalsIgnoreCase("move")) {
				try {
					Files.move(pathFile, pathSuffix, StandardCopyOption.REPLACE_EXISTING);
					LOGGER.info(file + " => " +fileSuffix);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}				
	}
	
	private String addSuffix(String file, String suffix) {
		if(!file.contains(".")) {
			return file + suffix;
		}
		int index = file.indexOf(".");		
		return file.substring(0, index) + suffix + file.substring(index, file.length());
	}

	private boolean badModel(String mode) {
		return mode != null && (mode.equalsIgnoreCase("copy") || mode.equalsIgnoreCase("move"));
	}
	
}
