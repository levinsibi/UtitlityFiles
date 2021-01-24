package test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();

		//Add one day to current date.
		cal.add(Calendar.DATE, 1);
		System.out.println(dateFormat.format(cal.getTime()));

		//Substract one day to current date.
		cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		System.out.println(dateFormat.format(cal.getTime()));
	}

}
