package corejava;
import java.util.Scanner;
public class Classregister{
	String name;
	String address;
	String contactNumber;
	String email;
	String prooftype;
	String proofid;
public static void main(String args[])
{
	Scanner obj=new Scanner(System.in);
	Classregister ob=new Classregister();
	
	System.out.println("Enter your name:");
	ob.name=obj.nextLine();
	System.out.println("Enter your address:");
	ob.address=obj.nextLine();
	System.out.println("Contact Number:");
	ob.contactNumber=obj.nextLine();
	System.out.println("Email ID:");
	ob.email=obj.nextLine();
	System.out.println("Enter proof type:");
	ob.prooftype=obj.nextLine();
	System.out.println("Enter proof id:");
	ob.proofid=obj.nextLine();
	System.out.println("Thank you for registering :The details are: ");
	System.out.println("name:"+ob.name);
	
	System.out.println("address:"+ob.address);
	
	System.out.println("ContactNumber:"+ob.contactNumber);
	
	System.out.println("Email ID:"+ob.email);
	
	System.out.println("Enter proof type:"+ob.prooftype);
	
	System.out.println("Enter proof id:"+ob.proofid);
	
}
}
