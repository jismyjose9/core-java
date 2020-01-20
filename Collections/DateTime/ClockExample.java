package DateTime;

import java.time.Clock;
import java.time.Duration;

public class ClockExample 
{
	public static void main(String args[])
	{
	Clock c1=Clock.systemDefaultZone();//display the current date in the two zones
	System.out.println(c1.getZone());
	Clock c2=Clock.systemUTC();//universal time coordinated
	System.out.println(c2.instant());
	Duration d=Duration.ofHours(5);
	Clock clock=Clock.offset(c2, d);
	System.out.println(clock.instant());
	
	
	
	
	}
}
