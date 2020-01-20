package Collections;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2)
	{
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if(e1.getAge()==e2.getAge())
		return e1.getName().compareTo(e2.getName());
		return 0;
	}


}
