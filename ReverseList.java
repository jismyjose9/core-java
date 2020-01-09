package ArrayList;
import java.util.*;
public class ReverseList 
{
   public static void main(String args[])
{
	   Scanner obj=new Scanner(System.in);
	   int n=obj.nextInt();
       ArrayList<String> Stationary=new ArrayList<String>();//creating Arraylist
       for(int i=0;i<n;i++)
       {
    	   Stationary.add(obj.next());
    	    
       }
       System.out.println(Stationary);//reversing the Arraylist
       for(int i=n-1;i>=0;i--)
       {
    	   System.out.print(Stationary.get(i)+" "); 
       }
 
}
	

}
