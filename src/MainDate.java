package es.unileon.prg.date;

/*



*/

public class MainDate{

	public static void main (String[] args){

		//Copiado en clase teoria
		//I use println to ckeck program is ok. 
		Date date, date2;

		date = new Date (21,3,2016);
		date2 = new Date (22,3,2016);

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



	}

}
