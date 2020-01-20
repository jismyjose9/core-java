package Collections;
import java.util.*;

public class LinkedlistExample 
{
	public static void main(String args[])
	{
		List<String>words=new LinkedList<String>();//creating linkedlist
		words.add("Competition");
		words.add("Be positive");
		words.add("Happy Day");
	    Iterator itr=words.iterator();//using iterator for getting values
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    
	}	

}
