package es.unileon.prg.date;

/*



*/

public class Check {

	public boolean checkDay (){

		return ((day < 31 ) && (day > 0 ));

	}

	public boolean checkMonth (){

		return ((month < 12) && (month > 0));

	}

	public boolean checkYear (){

		return ((year > 0) && (year < 2016));
	}

	public boolean checkDate (){

		//Es probable que no funcione.
		return (day.checkDay() && month.checkMonth() && year.checkYear());

	}
}