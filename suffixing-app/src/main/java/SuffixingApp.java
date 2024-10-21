public class SuffixingApp {

	public static void main(String[] args) {
		String path = args[0];
		SuffixingAppImpl exampleImpl = new SuffixingAppImpl();
		exampleImpl.execution(path);

		
	}

}
