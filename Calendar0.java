/*
 * Checks if a given year is a leap year or a common year,
 * and computes the number of days in a given month and a given year. 
 */
public class Calendar0 {	
	
	// Gets a year (command-line argument), and tests the functions isLeapYear and nDaysInMonth.
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}

	// Tests the isLeapYear function.
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}


	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
			System.out.println("Month 1 has 31 days");
			if (isLeapYear(year) == true){
				System.out.println("Month 2 has 29 days");
			} else {
				System.out.println("Month 2 has 28 days");
			}
			break;
			System.out.println("Month 3 has 31 days");
			System.out.println("Month 4 has 30 days");
			System.out.println("Month 5 has 31 days");
			System.out.println("Month 6 has 30 days");
			System.out.println("Month 7 has 31 days");
			System.out.println("Month 8 has 31 days");
			System.out.println("Month 9 has 30 days");
			System.out.println("Month 10 has 31 days");
			System.out.println("Month 11 has 30 days");
			System.out.println("Month 12 has 31 days");
		
	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
	    if (((year % 400) == 0) || (((year % 4) == 0) &&((year % 100) != 0))) {
			return true;
		}
		return false;
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		switch (days_month){
		case 1:
			int = 31;
			return;
		case 2:
			int = 28;
			return;
		case 3:
			int = 31;
			return;
		case 4:
			int = 30;
			return;
		case 5:
			int 31;
			return;
		case 6:
			int = 30;
			return;
		case 7:
			int = 31;
			return;
		case 8:
			int = 31;
			return;
		case 9:
			int = 30;
			return;
		case 10:
			int = 31;
			return;
		case 11:
			int = 30;
			return;
		case 12:
			int = 31;
			
	}
}

