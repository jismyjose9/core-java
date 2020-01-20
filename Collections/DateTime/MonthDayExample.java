package DateTime;
import java.time.*;
import java.time.MonthDay;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample 
{
	public static void main(String args[])
	{
		MonthDay month=MonthDay.now();
		LocalDate date = month.atYear(2019);//check the date and month present in the year
		System.out.println(date);
		boolean a=month.isValidYear(2018);
		System.out.println(a);
		long b=month.getLong(ChronoField.MONTH_OF_YEAR);//get the value of current month
		System.out.println(b);
		ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);//range between the month
		System.out.println(r1);
		ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);//range between the day
		System.out.println(r2);
	}

}
