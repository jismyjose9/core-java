package Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample3 
{
	public static void main(String args[])throws IOException{
	{
		LinkedHashMap <Integer, String> map=new LinkedHashMap<Integer, String>();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of values to be inserted");
		int n=Integer.parseInt(br.readLine());
		System.out.println("Enter the values");
		for(int i=0;i<n;i++)
		{
			int num=Integer.parseInt(br.readLine());
			String value=br.readLine();
			map.put(num,value);
					
		}
		int num1=Integer.parseInt(br.readLine());
		map.remove(num1);
		System.out.println(map);
		System.out.println(map.size());
		
	}

}
}
