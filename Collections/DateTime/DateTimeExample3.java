package DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateTimeExample3 
{
	public static void main(String args[])
	{
		
		//ISO Date
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter dateformatter=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localDate.format(dateformatter));
		
		//yyyy/mm/dd pattern
		DateTimeFormatter dateformatter1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(localDate.format(dateformatter1));
		
		//MMMM dd,yyyy pattern
		DateTimeFormatter dateformatter2=DateTimeFormatter.ofPattern("MMMM dd,yyyy");
		System.out.println(localDate.format(dateformatter2));
		
		//dd-MMM-yyyy pattern
		DateTimeFormatter dateformatter3=DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		System.out.println(localDate.format(dateformatter3));
		
		//dd-LL-yyyy pattern
		DateTimeFormatter dateformatter4=DateTimeFormatter.ofPattern("dd-LL-yyyy");
		System.out.println(localDate.format(dateformatter4));
		
		
	}

}
