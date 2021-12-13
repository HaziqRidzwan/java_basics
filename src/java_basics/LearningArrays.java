package java_basics;

public class LearningArrays {

	public static void main(String[] args) {

		int [] values = new int[100];
		values[0] = 1000;
		values[99] = 768523;
		System.out.println(values[99]);
		
		double [] decimal = new double[20];
		decimal[3] = 54.12312;
		System.out.println(decimal[3]);
		
		String [] words = new String[] {"My", "name", "is"};
		System.out.println(words[2]);
		words = new String[32];
		System.out.println(words[21]);
		
		int [] number = new int[] {0,1,2,3,4,5,6,7,8,9};
		System.out.println(number[4]);
		number = new int[5];
		number [3] = 5000;
		System.out.println(number[3]);
		
	}

}
