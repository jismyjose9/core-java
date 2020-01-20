package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashsetExample2 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		  ArrayList<Integer>number=new ArrayList<Integer>();
	       for(int i=0;i<n;i++)
	       {
	    	  number.add(obj.nextInt());//get values from user
	    	    
	       }	
	       Set <Integer> num=new HashSet <Integer>(number);
	       num.addAll(number);
	       System.out.println(num);
	}

}
