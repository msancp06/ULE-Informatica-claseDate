package es.unileon.prg.date;

/*



*/

public class Date{

	private int year; 
	private int month;
	private int day;
	Check checkeo = new Check();

	public Date(){

		//?*
		this.day = 1;
		this.month = 1;
		this.year = 2016;


	}

	//Need2Fill

	public boolean isSameYear() {


	}

	public boolean isSameMonth(){


	}

	public boolean isSameDay(){


	}

	public boolean isSame(){


	}


	public Date (int today, int month, int year){


		

	}

	//Poner los get

	public int getDay(){

		return day;
	}

	public int getMonth(){

		return month;
	}

	public int getYear(){

		return year;
	}

	public void setDay(int day){

		try{

			checkeo.checkDay(day);
		}catch (DateException mens){
			System.err.println( mens );
		}
	} 

	public void setMonth(int month){

		try{

			checkeo.checkMonth(month);
		}catch (DateException mens){
			System.err.println( mens );
		}

	}

	public void setYear(int year){
		try{

			checkeo.checkYear(year);
		}catch (DateException mens){
			System.err.println( mens );
		}
	}

	public Date tommorrow(){
		 Date tomorrow = null;
		 int d, m, y;

		 d = this.day;
		 m = this.month;
		 y = this,year;

		 d++;

		 if (checkeo.dayAndMonth(month) = false){
		 	d = 1;
		 	m++;
		 	if ( m > 12){
		 		y++;
		 	}
		 }

		 try{
		 	tomorrow = new Date (d,m,y);
		 } catch (DateException msgt){
		 	System.err.println("Error at tomorrow " + msgt );
		 }
	}




}