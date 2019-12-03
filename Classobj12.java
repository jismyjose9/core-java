package corejava;
import java.util.Scanner;


public class Classobj12 {
	String name;
	String address;
	String contactNumber;
	String email;
	String prooftype;
	String proofid;
	public Classobj12(String name, String address, String contactNumber, String email, String prooftype, String proofid)
	{
		this.name=name;
		this.address=address;
		this.contactNumber=contactNumber;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;
		
	}
	void Register(String name, String address, String contactNumber, String email, String proofType, String proofid)
	{
		System.out.println("Thank you for registering :The details are: ");
		System.out.println("name is :"+name);
		System.out.println("address is :"+address);
		System.out.println("contact Number is :"+contactNumber);
		System.out.println("email is :"+email);
		System.out.println("proof type is :"+prooftype);
		System.out.println("proof id is :"+proofid);
		
	}
	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Registration");
		System.out.println("Enter your name");
		String name;
		name=obj.nextLine();
		System.out.println("Enter your address");
		String address;
		address=obj.nextLine();
		System.out.println("Contact Number ");
		String contactNumber;
		contactNumber=obj.nextLine();
		System.out.println("E-Mail ID");
		String email;
		email=obj.nextLine();
		System.out.println("Enter proof type");
		String prooftype;
		prooftype=obj.nextLine();
		System.out.println("Enter proof id");
		String proofid;
		proofid=obj.nextLine();
	Classobj12 obj1=new Classobj12(name,address,contactNumber,email,prooftype,proofid);
         obj1.Register(name,address,contactNumber,email,prooftype,proofid);
	obj.close();

	


}
}