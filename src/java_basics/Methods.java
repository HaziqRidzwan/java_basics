package java_basics;

public class Methods {

	public static void main(String[] args) {
		
		Welcome();
		Multiplication(2,3);
		Division(6,2);

	}
	
	public static void Multiplication(int a, int b) {
		System.out.println(a * b);
	}
	
	public static void Division(int a, int b) {
		System.out.println(a / b);
	}
	
	public static void Welcome() {
		System.out.println("Welcome to my calculation");
	}

}
