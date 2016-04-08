package es.unileon.prg.date;

/*
 Class MainDate
 @author Manuel Sanchez Paniagua
 @version 1.0
*/

public class MainDate{

	public static void main (String[] args){

		//Copiado en clase teoria
		//I use println to ckeck program is ok. 
		Date date, date2;

		date = new Date (22,8,2017);
		date2 = new Date (22,8,2017);

		System.out.println(date.toString());
		System.out.println(date2.toString());

		if(date.isSameYear(date2)){
			System.out.println("Same Year");
		}else{
			System.out.println("Not the same year");
		}
		if(date.isSameMonth(date2)){
			System.out.println("Same Month");
		}else{
			System.out.println("Not the same month");
		}
		if(date.isSameDay(date2)){
			System.out.println("Same day");
		}else{
			System.out.println("Not the same day");
		}
		if(date.isSame(date2)){
			System.out.println("Same date");
		}else {
			System.out.println("Not same date");
		}
		//Up to here, program compiles and works perfectly ^^

		System.out.println("");

		//

		System.out.println("When I try to set wrong day, month, year and bad day/month combination...\n");
		Date checkDateSet, checkDateMonthSeason;

		checkDateSet = new Date (-10, 0, -5);
		checkDateSet.setYear(5);
		checkDateSet.setMonth(2);
		checkDateSet.setDay(23);
		System.out.println(checkDateSet.toString()+"\n");
		/*    
	 [java] es.unileon.prg.date.DateException: es.unileon.prg.date.DateException: Negative days are not accepted. Set Day again.
     [java]  es.unileon.prg.date.DateException: Negative month are not accepted. Set Month again.
     [java] es.unileon.prg.date.DateException: Negative years are not accepted. Set Year again.
	 [java] Day 23 Month 2 Year 5
		*/
	 //Will it work for wrong day of a month?
	 	checkDateSet.setDate(30,2,2016);
	 	System.out.println(checkDateSet.toString());
	/*
	 [java] es.unileon.prg.date.DateException: es.unileon.prg.date.DateException: Day and month combination doesn't exist.
	 Working, but I don't know why two DateExceptions are thrown.
	*/
     	checkDateMonthSeason = new Date (1,1,1);
     	checkDateMonthSeason.setDate(1,1,2013);
     	int aux = 0;
     	System.out.println(checkDateMonthSeason.toString()+"\n");
     	System.out.println(checkDateMonthSeason.getMonthName());
     	System.out.println(checkDateMonthSeason.getSeason()+"\n");
     	checkDateMonthSeason.setMonth(6);
     	System.out.println(checkDateMonthSeason.toString());
     	System.out.println(checkDateMonthSeason.getMonthName());
     	System.out.println(checkDateMonthSeason.getSeason());
     /*
     [java] Day 23 Month 2 Year 5
     [java] Day 1 Month 1 Year 2013
     [java] 
     [java] January
     [java] Winter
     [java] Day 1 Month 6 Year 2013
     [java] 
     [java] June
     [java] Spring
     */
     //Working perfect

     // Checking Random attempts with while statements:

     	System.out.println("Tries until I find the correct day (While) = " + checkDateMonthSeason.randomAttemptsWhile());
     /*
     [java] Tries until I find the correct day (While) = 1563
     (This time luck is not with me)
     */
     //Working perfect

     //Checking Random attempts with do while:

     	System.out.println("Tries until I find the correct day (Do-While) = " + checkDateMonthSeason.randomAttemptsDoWhile() + "\n");
     
     /*
     [java] Tries until I find the correct day (While) = 21
     [java] Tries until I find the correct day (Do-While) = 466
	 */
	 // Working.

	 //Finding tomorrow method at class, I've tried to make it work. Attempt:

	 System.out.println("The next day of " + checkDateMonthSeason.toString() + " is:");

     System.out.println(checkDateMonthSeason.tomorrow());

     /*
     [java] The next day of Day 1 Month 6 Year 2013 is:
     [java] Day 2 Month 6 Year 2013
	 */
	 // Tomorrow working.



	 /*************************** SUMARY: ********************************

	 	EXERCISES DONE:
			
		Date Class defined by day, month and year.
		if statements:
			isSameYear
			isSameMonth
			isSameDay
			isSame
			simplified methods
		switch statements:
			printMonth
			checkDayAndMonth
			printSeason
		for statements:
			print the months until year ends
			method that prints dates
		while:
			a method that counts the number of attempts needed to generate random date equals to a given one.
			with wile statement
			with do-while statement



		EXERCISES NOT DONE:

		for statements:
		print all dates until the end of the month
		prints the month with the same number
		count the number of days since the first day of the year

		*/


	}

}
