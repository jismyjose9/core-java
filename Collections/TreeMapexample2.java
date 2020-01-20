package Collections;
import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TreeMapexample2 
{
	public static void main(String args[]) throws IOException{ 
	{
		TreeMap <String, Integer> map = new TreeMap<String, Integer>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of values to be inserted");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			String value=br.readLine();
			int num=Integer.parseInt(br.readLine());
			map.put(value,num);
					
		}
	    System.out.println( map);
	    System.out.println("Enter the index to be removed:");
	    String r=br.readLine();
	    //int r=Integer.parseInt(br.readLine());
	    map.remove(r);
	   
	    System.out.println("Enter the values to be inserted:");
	    String value1=br.readLine();
	    int index1=Integer.parseInt(br.readLine());
	    map.put(value1,index1);
	    System.out.println( map);
	    
	    
	    
	    
		
	}

}
}
