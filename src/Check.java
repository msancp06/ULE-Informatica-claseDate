package es.unileon.prg.date;

/*



*/

public class Check {

	public checkDate(int day, int month, int year) throws DateException{

		StringBuffer mens = new StringBuffer();
		if (dia <= 0){

			mens.append("Negative days are not accepted. Set Day again. ");

		} else {

			if (dia > 31){

				mens.append("Error at Day value. Day is up to 31.");
			} else {

				if (day.dayAndMonth() == false){

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
		} else {

			this.day = day;
			this.month = month;
			this.year = year;
		}

	}

	public boolean dayAndMonth (){

		boolean daynmonth = true;

		switch(month){

			case 2:

			if (dia > 29 ) daynmonth = false;
			break;

			case 4:
			case 6:
			case 9:
			case 11:

			if (dia > 30) daynmonth = false;
			break;

		}
		

	}

	public boolean checkDay(){

		if (dia <= 0){

			mens.append("Negative days are not accepted. Set Day again. ");

		} else {

			if (dia > 31){

				mens.append("Error at Day value. Day is up to 31.");
			} else {

				if (day.dayAndMonth() == false){

					mens.append("Day and month combination doesn't exist.");
				} else {
					this.day = day;
				}
			}
		}
		return;
	}

	public boolean checkMonth (){

		if (month <= 0){

				mens.append("Negative days are not accepted. Set Month again.");
			} else {

				if (month > 12){

					mens.append("Error at Month value. Month is up to 12.");
				} else {
					this.month = month;
				}
			}
		return;

	}

	public boolean checkYear (){

		if (year < 0){

				mens.append("Negative year is not accepted. Set Year again.");
		} else {
			this.year = year;
		}
	}
/*
	public boolean checkDate (){

		return (day.checkDay() && month.checkMonth() && year.checkYear());

	}

*/
}