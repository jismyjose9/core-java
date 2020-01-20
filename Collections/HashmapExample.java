package Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HashmapExample 
{
	public static void main(String args[])
	{
		HashMap <Integer,String> list=new HashMap<Integer,String>();
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
		/*map.put("ONE",1);
		map.put("TWO",2);
		map.put("THREE",3);
		map.put("FOUR",4);
		boolean containsKey(3);*/
		for(int i=0;i<n;i++)
		{
			int no=obj.nextInt();
			String name=obj.next();
			list.put(no,name);
		}
		System.out.println(list);
		System.out.println(" enter the value to be search");
		String s=obj.next();
		if(list.containsValue(s));
		System.out.println(" the value is present");
		System.out.println(" enter the key to be search");
		int t=obj.nextInt();
		if(list.containsValue(t));
		System.out.println(" enter the key to be present");
		/*for(list.Entry m:list.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
		
	}

}
