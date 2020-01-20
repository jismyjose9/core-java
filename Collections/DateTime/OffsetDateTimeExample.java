package DateTime;

import java.time.OffsetDateTime;

public class OffsetDateTimeExample 
{
	public static void main(String args[])
	{
		OffsetDateTime offsetDT=	OffsetDateTime.now();//using offset method
		System.out.println(offsetDT.getDayOfMonth());//get the value of the day
		System.out.println(offsetDT.getDayOfYear());//get the value of the day in the year
		System.out.println(offsetDT.getDayOfWeek());//get the value of the day in the week
		System.out.println(offsetDT.toLocalDate());//get the current date
		OffsetDateTime value1=offsetDT.minusDays(240);
		System.out.println(value1);
		OffsetDateTime value2=offsetDT.plusDays(240);
		System.out.println(value2);

		

		
	}

}
