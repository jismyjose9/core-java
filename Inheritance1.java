package corejava;
import java.util.Scanner;
public class Inheritance1 extends A {
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is "+sum);
		
	}
	public static void main(String args[]) {
		int a,b;
		Scanner obj=new Scanner(System.in);
		
		System.out.println("enter first element");
		a=obj.nextInt();
		System.out.println("enter second element");
		b=obj.nextInt();
		A ob=new Inheritance1();
		ob.add(a,b);
	}
			
	}
	
class A {
	public void add(int a,int b)
	{
		
	
	int sum=a+b+10;
	System.out.println("sum is "+ sum);
}
}