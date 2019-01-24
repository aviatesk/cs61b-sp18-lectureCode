public class SLListLauncher {
	public static void main(String[] args) {
		SLList<String> s1 = new SLList<String>("bone");
		s1.addFirst("thugs");
		System.out.println(s1.getFirst());
	}
}
