package java_basics;

public class NisaCode {
	public static void main(String[] args) {
		String order = getMcDMenu("burger"); // 1: 
		System.out.println(order);
	}
	
	public static String getMcDMenu(String menu) { //2:
		String fullMenuInSentence = "You have order: " + menu;
		return fullMenuInSentence;
	}
}
