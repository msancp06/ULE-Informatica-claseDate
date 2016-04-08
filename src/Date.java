package es.unileon.prg.date;

/*



*/

public class Date{

	private int year; 
	private int month;
	private int day;
	Check checkeo = new Check();

	public Date(){

		this.day = 1;
		this.month = 1;
		this.year = 1;
	}

	//Need2Fill

	public boolean isSameYear(Date date2) {

		return this.year == date2.getYear();

	}

	public boolean isSameMonth(Date date2){

		return this.month == date2.getMonth();
	}

	public boolean isSameDay(Date date2){

		return this.day == date2.getDay();
	}

	public boolean isSame(Date date2){

		return ((this.year == date2.getYear()) && (this.month == date2.getMonth()) && (this.day == date2.getDay()));

	}


	public Date (int day, int month, int year){

		try{

		checkeo.checkDate(day, month, year);
		/* Maybe I don't need it.
		this.day = today;	
		this.month = month;
		this.year = year;
		At the end I really need them, 'cause I can't set them at Check.java *1
		*/
		this.day = day;	
		this.month = month;
		this.year = year;

		}catch (DateException errormsg){
			System.err.println(errormsg);
		}

		

	}

	//Poner los get

	public int getDay(){

		return this.day;
	}

	public int getMonth(){

		return this.month;
	}

	public int getYear(){

		return this.year;
	}

	public void setDay(int day){

		try{

			checkeo.checkDay(day,month);
			// I've tried to set day to this.day at the method, but something went wrong, so 
			//I will try here to do it, what I guess it's gonna happen is that day is gonna be set 
			//even if day value is wrong. Anyway, let's see if the error stops the program.
			this.day = day;
		}catch (DateException mens){
			System.err.println( mens );
		}
	} 

	public void setMonth(int month){

		try{
			//Same happened here.
			this.month = month;
			checkeo.checkMonth(month);

		}catch (DateException mens){
			System.err.println( mens );
		}

	}

	public void setYear(int year){
		try{
			//Here too.
			this.year = year;
			checkeo.checkYear(year);
		}catch (DateException mens){
			System.err.println( mens );
		}
	}

	public void setDate(int day, int month, int year){

		try{
			checkeo.checkDate(day, month, year);
			this.day = day;	
			this.month = month;
			this.year = year;

		}catch (DateException errormsg){
			System.err.println(errormsg);
		}
	}
	// To print some things...
	public String toString(){

		return "Day "+ day + " Month "+ month +" Year " + year;
	}

	public Date tommorrow(){
		 Date tomorrow = null;
		 int d, m, y;

		 d = this.day;
		 m = this.month;
		 y = this.year;

		 d++;

		 if (checkeo.dayAndMonth(d, m) == false){
		 	d = 1;
		 	m++;
		 	if ( m > 12){
		 		y++;
		 	}
		 }
		 return tomorrow;
	}





}