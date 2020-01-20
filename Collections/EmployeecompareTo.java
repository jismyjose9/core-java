package Collections;

public class EmployeecompareTo{
	public class Employee implements Comparable<Employee>
	{
		private String name;
		private int age;
		public String getName()
		{
		return name;
	    }
	    public void setName(String name)
	    {
	    	this.name=name;
	    }
	    public int getAge()
	    {
	    	return age;
	    }
	    public void setAge(int age)
	    {
	    	this.age=age;
	    }
	    /*public int (Employee e)
	    {
	    	if(age>e.getAge())
	    	{
	    		return 1;
	    	}*/
		@Override
		public int compareTo(Employee o) {
		
			if(age>o.getAge())
			{
			return 1;
			
		   }
			else if(age<o.getAge())
			{
				return -1;
			}
			else
			{
				return 0;
			}
	    	
	    
	}


}
}
