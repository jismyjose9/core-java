package corejava;
import java.util.Scanner;
public class outerclass 
{
	private int a=10;
	class innerclass
	{
		public void fun()
		{
			
		
		System.out.println(a);
	 }
	}
     public static void main(String args[])
     {
     outerclass obj=new outerclass();//creating object of outerclass
     outerclass.innerclass ob=obj.new innerclass();//outerclass object is used for innerclass
     ob.fun();
     
     
     
     
    	 
}
}
