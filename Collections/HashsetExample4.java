package Collections;
import java.lang.Math;
//import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashsetExample4 
{
	public static void main(String args[])
	{
		
		 Set <Integer> numberlist=new HashSet <Integer>();//create hashset
		  Scanner obj=new Scanner(System.in);
		  int n=obj.nextInt();
		  for(int i=0;i<n;i++)
		  {
		   numberlist.add(obj.nextInt());//add elements to the hash set
		  }
		 
		  System.out.println("Numbers:"+numberlist);
		  int m=obj.nextInt();
		  numberlist.remove(m);//remove the particular element in the hashlist
		  System.out.println("After remove():"+numberlist);
		  Set <Integer> numberlist1=new HashSet <Integer>();
		  for(int l:numberlist)
		  {
			  int k=l;
			  int var=(int)Math.sqrt(k);
			  if(var*var==k)
			  {
				  numberlist1.add(k);
			  }
		  }
		  numberlist.removeAll(numberlist1);
		  System.out.println("After removeAll(perfectsqures):"+numberlist);
		  numberlist.clear();//clear the hashlist
		  System.out.println("After clear():"+ numberlist);
	}
}


