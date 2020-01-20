package Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashsetExample3 
{
	public static void main(String args[])
	{
		 Set <String> popularCities=new HashSet <String>();
		  System.out.println("Is popularCities set empty?: "+popularCities.isEmpty());
		  Scanner obj=new Scanner(System.in);
		  int n=obj.nextInt();
		  for(int i=0;i<n;i++)
		  {
			popularCities.add(obj.next());
		  }
		  System.out.println("Number of cities in the Hashset: "+popularCities.size());
		  if(popularCities.contains("paris"));
		  System.out.println("paris is in the popular cities set ");
		 
	}

}
