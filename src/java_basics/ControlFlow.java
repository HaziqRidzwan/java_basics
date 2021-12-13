package java_basics;

public class ControlFlow {

	public static void main(String[] args) {

		boolean hungry = true;

		if (!hungry) {
			System.out.println("I'm starving ....");
		} else {
			System.out.println("I'm not hungry ... line 12");
		}

		int hungerRating = 5;

		if (!(hungerRating < 6)) {
			System.out.println("Not hungry");
		} else {
			System.out.println("I'm starving.");
		}

		int favouriteNumber = 69;
		int currentNumber = 23;
		String choices;

		if (!(currentNumber == favouriteNumber)) {
			choices = "This is not my favourite number.";
		} else {
			choices = "HECK YEAH";
		}
		System.out.println(choices);
		
		// Added by Nisa on 13/12/2021
		// beza antara if, else dengan
		
		//1: if, else
		if (!(currentNumber == favouriteNumber)) {
			choices = "This is not my favourite number.";
		} else {
			choices = "HECK YEAH";
		}
		
		//2:
		System.out.println("********* Nisa's Code *********");
		boolean isActive = false;
		
		if (isActive) {
			System.out.println("Print line 49: isActive: " + isActive);
		} else if (isActive) {
			System.out.println("Print line 51: isActive" + isActive);
		} else if (isActive) {
			System.out.println("Print line 53: : isActive" + isActive);
		}
		System.out.println("********* Nisa's Code *********");
		
		// End added by Nisa on 13/12/2021

		int month = 4;
		String monthString;

		switch (month) {
		case 1:
			monthString = "January";
			System.out.println(monthString);
			break;
		case 2:
			monthString = "February";
			System.out.println(monthString);
			break;
		case 3:
			monthString = "March";
			System.out.println(monthString);
			break;
		case 4:
			monthString = "April";
			System.out.println(monthString);
			//break;
		case 5:
			monthString = "May";
			System.out.println(monthString);
			break;
		case 6:
			monthString = "June";
			System.out.println(monthString);
			break;
		default:
			monthString = "Unknown month";
		}

		//System.out.println(monthString);
	}

}
