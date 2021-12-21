package java_basics;

class Calc {
	int num1;
	int num2;
	int result;

	public void operation() {
		result = num1 + num2;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Calc obj = new Calc(); // knows something and does something
		obj.num1 = 3;
		obj.num2 = 5;
		obj.operation();
		System.out.println(obj.result);
	}
}
