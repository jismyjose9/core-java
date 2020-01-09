package Collections;
import java.util.*;
public class LinkedlistExample2 
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		LinkedList<String> list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
		list.add(obj.next());	
		}
		//System.out.println("Actual Linkedlist:"+list);
		  ArrayList<String> list1=new ArrayList<String>();
		  int m=obj.nextInt();
	       for(int i=0;i<m;i++)
	       {
	    	  list1.add(obj.next());//get values from user
	    	    
	       }
	       System.out.println("Actual Linkedlist:"+list);
	       list.addAll(list1);
	       System.out.println("After copy:"+list);
	}

}
