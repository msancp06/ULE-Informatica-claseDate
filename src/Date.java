package es.unileon.prg.date;

/*
 Class date
 @author Manuel Sanchez Paniagua
 @version 1.0
*/
 
import java.util.Random;

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

		/* if Statement anwser:
		boolean variable = false;
		if (this.year == date2.getYear()){
			variable = true;
		}
		return variable;
		*/
		//Simplified anwser:
		return this.year == date2.getYear();

	}

	public boolean isSameMonth(Date date2){

		/* if Statement anwser:
		boolean variable = false;
		if (this.month == date2.getMonth()){
			variable = true;
		}
		return variable;
		*/
		//Simplified anwser:
		return this.month == date2.getMonth();
	}

	public boolean isSameDay(Date date2){

		/* if Statement anwser:
		boolean variable = false;
		if (this.day == date2.getDay()){
			variable = true;
		}
		return variable;
		*/
		//Simplified anwser:
		return this.day == date2.getDay();
	}

	public boolean isSame(Date date2){

		/* if Statement anwser:
		boolean variable = false;
		if (this.year == date2.getYear()) && (this.month == date2.getMonth()) && (this.day == date2.getDay())){
			variable = true;
		}
		return variable;
		*/
		//Simplified anwser:
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

	public String getMonthName(){
		StringBuffer name = new StringBuffer();
		switch (this.month){
			case 1:
			name.append("January");
			break;
			case 2:
			name.append("February");
			break;
			case 3:
			name.append("March");
			break;
			case 4:
			name.append("April");
			break;
			case 5:
			name.append("May");
			break;
			case 6:
			name.append("June");
			break;
			case 7:
			name.append("July");
			break;
			case 8:
			name.append("August");
			break;
			case 9:
			name.append("September");
			break;
			case 10:
			name.append("October");
			break;
			case 11:
			name.append("November");
			break;
			case 12:
			name.append("December");
			break;
			default:
			name.append("Something went wrong. Program not working well.");
			break;
		}
		return name.toString();
	}
	public String getSeason(){
		StringBuffer season = new StringBuffer();
		switch(this.month){
			case 1:
			case 2:
			case 3:
			season.append("Winter");
			break;
			case 4:
			case 5:
			case 6:
			season.append("Spring");
			break;
			case 7:
			case 8:
			case 9:
			season.append("Summer");
			break;
			case 10:
			case 11:
			case 12:
			season.append("Autumn");
			break;
		}
		return season.toString();	
	}


	//*******************************FOR STATETMENT***********************

	public String getMonthsUntilEnd(){

		Date dateMonths = new Date(this.day, this.month, this.year);
		StringBuffer months = new StringBuffer();

		for (int i = (this.month + 1) ; i < 13; i++ ){

				dateMonths.setMonth(i);

				months.append (dateMonths.getMonthName());
		}
		return months.toString();
	}

	// Method that prints a date:

	public String toString(){

		return "Day "+ day + " Month "+ month +" Year " + year;
	}

	//I couldn't find a solution for print the months all dates until the end of the month

	/*public String getMonthsWithSameDays(){

		StringBuffer months = new StringBuffer("Month with same days as" + getMonthName() + ":");
		

		for (int i = 1; i < 13; i++){
			if ()
		}
		return months.toString();
	}
	*/

	//******************************** WHILE AND DO-WHILE *******************************

	public int randomAttemptsWhile(){

		int dayRand= 0; 
		int monthRand = 0;
		int attempts = 0;
		Random rand = new Random();
		int aux = checkeo.getDaysInMonth(month);


		while((dayRand != this.day) || (monthRand != this.month)){

			dayRand = rand.nextInt(aux);
			monthRand = rand.nextInt(12);

			attempts++;
		}

		return attempts;
	}

	public int randomAttemptsDoWhile(){

		int dayRand= 0; 
		int monthRand = 0;
		int attempts = 0;
		Random rand = new Random();
		int aux = checkeo.getDaysInMonth(month);


		do{

			dayRand = rand.nextInt(aux);
			monthRand = rand.nextInt(12);

			attempts++;
		} while((dayRand != this.day) || (monthRand != this.month));

		return attempts;
	}
	public Date tomorrow(){
		 Date tomorrow = new Date (1,1,1);
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

		 tomorrow.setDate(d,m,y);
		 return tomorrow;
	}





}