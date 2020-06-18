package javabasics;

public class SwitchTrials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 6;
		String monthName;
		
		switch(month) {
		case 1: monthName = "Jan";
		break;
		case 2: monthName = "Feb";
		break;
		case 3: monthName = "Mar";
		break;
		case 4: monthName = "Apr";
		break;
		default: monthName= "Not available";
		break;
		}
		System.out.println(monthName);
	}

}
