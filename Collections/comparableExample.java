package Collections;

import java.util.Scanner;
import java.util.TreeSet;

public class comparableExample {
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		TreeSet <Employee> hashset = new TreeSet<Employee>();
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=obj.next();
			age=obj.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			hashset.add(emp[i]);
			
		}
		for(Employee e:hashset)
			System.out.println(e.getName()+" "+e.getAge());
		    obj.close();
		
		

		}
}
