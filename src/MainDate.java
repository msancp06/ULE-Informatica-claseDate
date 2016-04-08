package es.unileon.prg.date;

/*



*/

public class MainDate{

	public static void main (String[] args){

		//Copiado en clase teoria
		//I use println to ckeck program is ok. 
		Date date, date2;

		date = new Date (22,3,2016);
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
		//Up to here, program compiles and works perfectly ^^

		System.out.println("");

		//
		Date checkDateSet;

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
     	
     

	}

}
