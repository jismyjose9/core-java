package Abstraction;

import java.util.Scanner;

public class Maininterfaceclass {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a,b;
		a=obj.nextInt();
		b=obj.nextInt();
		obj.close();
		Inheritinterface ob=new Inheritinterface();
		ob.add(a,b);
		ob.sub(a,b);
		ob.mul(a,b);
        ob.div(a,b);
}
}