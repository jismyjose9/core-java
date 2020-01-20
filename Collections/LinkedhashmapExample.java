package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedhashmapExample 
{
	public static void main(String args[])
	{
		LinkedHashMap <String,Integer> map=new LinkedHashMap<String,Integer>();
		map.put("ONE",1);
		map.put("TWO",2);
		map.put("THREE",3);
		map.put("FOUR",4);
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
