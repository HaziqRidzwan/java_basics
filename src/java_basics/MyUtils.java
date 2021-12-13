package java_basics;

public class MyUtils {
	public static void printsomeJunk(String argument) {
		System.out.println("lol " + argument);
	}
	
	public static void printsomeJunk(int argument) {
		System.out.println("Number: " + argument);
	}
	
	public static void sum2Numbers(int N1, int N2) {
		System.out.println(N1+N2);
	}
	
	public static int add10(int A10) {
		int result = A10+10;
		return result;
	}
	
	public static String print(String arg) {
		String sentence = "Ayam " + arg;
		return sentence;
	}
	
}
