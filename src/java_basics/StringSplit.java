package java_basics;

public class StringSplit {

	public static void main(String[] args) {
       String s = "Donald Trump";
	String[] names = s.split(" ");
      System.out.println(names[1] + " " + names[0]);
	}

}
