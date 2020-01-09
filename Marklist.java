package ArrayList;
import java.util.*;
import java.util.Scanner;
public class Marklist 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		  ArrayList<Integer> scorecard=new ArrayList<Integer>();
	       for(int i=0;i<n;i++)
	       {
	    	   scorecard.add(obj.nextInt());//get values from user
	    	    
	       }
	       System.out.println("Actual list is"+ scorecard);//display the actual list
	       ArrayList<Integer> duplicatescorecard=(ArrayList<Integer>)scorecard.clone();//creating duplicate of original
	       Collections.sort(duplicatescorecard);//sort the list
	       System.out.println("sorted list:"+duplicatescorecard);//display the sorted list
	      
		
	}

}
