package Collections;
import java.util.Map;
import java.util.TreeMap;

public class MapExample 
{
	public static void main (String args[])
	{
		Map <Integer,String> map=new TreeMap<Integer,String>();
		map.put(1,"Amit");
		map.put(5,"Rahul");
		map.put(2,"jai");
		map.put(6,"Amit");
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
