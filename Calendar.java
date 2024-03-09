/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {	
			// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    int debugDaysCounter = 0; 
		int yearToPrint = Integer.parseInt(args[0]);

	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition
	 	while (year < yearToPrint + 1) {
	 		//// Write the body of the while 		
	 		
			// prints the new date
			if (yearToPrint == year) {
				System.out.print(dayOfMonth + "/" + month + "/" + year);
				if (dayOfWeek == 1) {
					System.out.print(" Sunday");
				}
				System.out.println();
			}

			advance(); // increase to the new date
	 		debugDaysCounter++;

	 		//// If you want to stop the loop after n days, replace the condition of the
	 		//// if statement with the condition (debugDaysCounter == n)
	 		// if (debugDaysCounter == 5000) { 
	 		// 	break;
	 		// }
        }	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (dayOfMonth == nDaysInMonth) { // if last day of month
			dayOfMonth = 1; // then reset the dayOfMonth

			if (month == 12) { // if was the last month
				month = 1; // then reset month

				year++; // and also increase the year
			} else {
				month++; // increase the month
			}
			nDaysInMonth = nDaysInMonth(month, year); // then get the new month number of days
		} else {
			dayOfMonth++; // for every normal day, increase the day
		}

		// checks if the last day of week
		if (dayOfWeek == 7) {
			dayOfWeek = 1; // then reset the dayOfWeek
		} else {
			dayOfWeek++; // else just increase the dayOfWeek
		}
	}
	 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
	    if (((year % 400) == 0) || (((year % 4) == 0) &&((year % 100) != 0))) {
			return true;
		}
		return false;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		switch (month) {
			case 1:
				return 31;
			case 2:
				if (isLeapYear(year) == true){
					return 29; 
				} else {
					return 28;
				}
			case 3:
				return 31;
			case 4:
				return 30;
			case 5:
				return 31;
			case 6:
				return 30;
			case 7:
				return 31;
			case 8:
				return 31;
			case 9:
				return 30;
			case 10:
				return 31;
			case 11:
				return 30;
			case 12:
				return 31;
			}
		return 0;
	}
}