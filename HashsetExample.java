package Collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class HashsetExample 
{
	public static void main(String args[])
	{
		Set <Integer> set1=new HashSet <Integer>();
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		for(int i=0;i<n;i++)
		{
		set1.add(obj.nextInt());	
		}
		
		/*set1.add(1);//using add method
		set1.add(9);
		set1.add(3);
		set1.add(4);
		set1.add(5);*/
		Set <Integer> set2=new HashSet <Integer>();
		
		for(int i=0;i<n;i++)
		{
		set2.add(obj.nextInt());	
		}
		/*set2.add(6);//using add method
		set2.add(4);
		set2.add(8);
		set2.add(2);
		set2.add(9);*/
		Set <Integer> union=new HashSet <Integer>(set1);//find the union of two given sets
		union.addAll(set2);
		System.out.println("union is:"+union);
		Set <Integer> Intersection=new HashSet <Integer>(set1);//find the intersection of two given sets
		Intersection.retainAll(set2);
		System.out.println("Intersection is:"+Intersection);
		Set <Integer> Symmetricdifference=new HashSet <Integer>(set1);//find the symmetric difference between two given sets
		Symmetricdifference.removeAll(set2);
		System.out.println("Symmeteric difference is:"+Symmetricdifference);
		
		
	}

}
