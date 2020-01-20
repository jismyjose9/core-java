package Collections;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class comparableExample3 {

	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		List<Employee> list = new LinkedList<Employee>();
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
			name=obj.next();
			age=obj.nextInt();
			emp[i]=new Employee();
			emp[i].setAge(age);
			emp[i].setName(name);
			list.add(emp[i]);
			
		}
		    System.out.println("Name wise comparison");
		    Collections.sort(list,new NameComparator());
		    for(Employee e:list)
		    System.out.println(e.getName()+" "+e.getAge());
		    System.out.println("Age wise comparison");
		    Collections.sort(list,new AgeComparator());
		    for(Employee e:list)
			System.out.println(e.getName()+" "+e.getAge());
		    obj.close();
		
		

		}
	
}





