package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class HashmapExample2 
{
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		HashMap <Integer,Employee> hashmap = new HashMap<Integer,Employee>();
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=obj.next();
			age=obj.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashmap.put(i,emp[i]);
			
		}
		for(Map.Entry<Integer,Employee>e:hashmap.entrySet()) {
			Employee c=e.getValue();
			System.out.println(e.getKey()+" "+c.getName()+" "+c.getAge());
		    obj.close();
		
		

		}

}
}


