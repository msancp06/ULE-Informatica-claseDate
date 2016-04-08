package es.unileon.prg.date;

/*
 Class check
 @author Manuel Sanchez Paniagua
 @version 1.0
*/

public class Check {

/*
******** I've tried this at 1st practice lesson, but at the 2nd one, I gotta fall back and
******** try something new.
	// To ckech Date
	public void checkDate(int day, int month, int year) throws DateException{

		StringBuffer mens = new StringBuffer();
		if (day <= 0){

			mens.append("Negative days are not accepted. Set Day again. ");

		} else {

			if (day > 31){

				mens.append("Error at Day value. Day is up to 31.");
			} else {

				if (day.dayAndMonth(day, month) == false){

					mens.append("Day and month combination doesn't exist.");
				}
			}
			if (month <= 0){

				mens.append("Negative days are not accepted. Set Month again.");
			} else {

				if (month > 12){

					mens.append("Error at Month value. Month is up to 12.");
				}
			}

			if (year < 0){

				mens.append("Negative year is not accepted. Set Year again.");
			}	
		}

		if (mens.length() != 0){
			throw new DateException(mens.toString());
		} /*
		*1) I was trying, but three errors, like this one, appeared:
	[javac] /home/kashmir/Desktop/Date/src/Check.java:51: error: cannot find symbol
    [javac] 			this.day = day;
    [javac] 			    ^
    [javac]   symbol: variable day

		else {
			this.day = day;
			this.month = month;
			this.year = year;
		}*

	}
	*/

		//To ckeck Dates v2.0
		//Notes: As Fancisco said, I've tried to make other methods count so I 
		// can use them in a sum to get the whole ckechDate method.

	public void checkDate (int day, int month, int year) throws DateException {
		StringBuffer errorDate = new StringBuffer();
		try{
			//By the time I changed the method arguments, I've got to change the error all the way around.
			checkDay(day, month);
		}catch (DateException mens){
			errorDate.append(mens);
		}

		try{
			checkMonth(month);
		}catch (DateException mens){
			errorDate.append(mens);
		}

		try{
			checkYear(year);
		}catch (DateException mens){
			errorDate.append(mens);
		}
		/*I've tried to check this, but when errors appeared, I realized that with:
		try{
		checkDay(day, month);
		}catch (DateException mens){
			errorDate.append(mens);
		}
		I'm already checking if the day is correct according to the month, so :)
		I didn't realized that dayAndMonth doesn't throw any exception.
		*/
		/*
		try{
			dayAndMonth(day, month);
		}catch (DateException mens){
			errorDate.append(mens);
		}
		*/
		if (errorDate.length() != 0) throw new DateException(errorDate.toString());

	}

	//To check if the day fits on an specific month. e.g. The date 30th of Feb doesn't exist.

	public boolean dayAndMonth (int day, int month){

		boolean daynmonth = true;

		switch(month){

			case 2:

			if (day > 29 ) daynmonth = false;
			break;

			case 4:
			case 6:
			case 9:
			case 11:

			if (day > 30) daynmonth = false;
			break;

		}
		return daynmonth;
	}

	//To check if day value is posible.
	//I've got to introduce int month tho check if day value is correct according to the month.
	public void checkDay(int day, int month) throws DateException {

		StringBuffer mens = new StringBuffer();
		if (day <= 0){

			mens.append("Negative days are not accepted. Set Day again.\n ");

		} else {

			if (day > 31){

				mens.append("Error at Day value. Day is up to 31.\n");
			} else {

				if (dayAndMonth(day,month) == false){

					mens.append("Day and month combination doesn't exist.\n");
				} 
				/* Same error happened, cannot set day to this.day here, gotta do it at Date.java file
				else{
					this.day = day;
				}
				nt
				*/
			}
		}
		if (mens.length() != 0) throw new DateException(mens.toString());
		
	}
	//To ckech if month value is correct.

	public void checkMonth(int month) throws DateException {

		StringBuffer mens = new StringBuffer();
		if (month <= 0){

				mens.append("Negative month are not accepted. Set Month again.\n");
			} else {

				if (month > 12){

					mens.append("Error at Month value. Month is up to 12.\n");
				} 
				/*Same here. nt.
				else {
					this.month = month;
				}
				*/
			}
		if (mens.length() != 0) throw new DateException(mens.toString());
	}
	//To check if year value is correct.

	public void checkYear(int year) throws DateException {

		StringBuffer mens = new StringBuffer();
		if (year < 0){

				mens.append("Negative years are not accepted. Set Year again.\n");
		} 
		/*Saaaaame here too...
		else {
			this.year = year;
		}
		*/
		if (mens.length() != 0) throw new DateException(mens.toString());
	}

	public int getDaysInMonth (int month){
		int daysOfMonth = 0;
		switch(month){

			case 2:
			daysOfMonth = 29;
			break;

			case 4:
			case 6:
			case 9:
			case 11:

			daysOfMonth = 30;
			break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:

			daysOfMonth = 31;
			break;

		}
		return daysOfMonth;
		
	}



/*
*	Wrong.
*	public boolean checkDate (int day, int month, int year){
*
*		return (day.checkDay(day) && month.checkMonth(month) && year.checkYear(year));
*
*	}
*
*/
}