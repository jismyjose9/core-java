package corejava;

import java.util.Scanner;

public class Encapsulation1 {
	Scanner obj=new Scanner(System.in);
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Registration");
		System.out.println("Enter your name:");
		String name=obj.nextLine();
		System.out.println("Enter your address:");
		String address=obj.nextLine();
		System.out.println("Contact Number:");
		String contactNumber=obj.nextLine();
		System.out.println("Email ID:");
		String email=obj.nextLine();
		System.out.println("Enter proof type:");
		String prooftype=obj.nextLine();
		System.out.println("Enter proof id:");
		String proofid=obj.nextLine();
		Classobj131 ob=new Classobj131();
		ob.setname(name);
		ob.setaddress(address);
		ob.setcontactNumber(contactNumber);
		ob.setemail(email);
		ob.setprooftype(prooftype);
		ob.setproofid(proofid);
		System.out.println("name :"+ob.getname());
		System.out.println("address :"+ob.getaddress());
		System.out.println("contactNumber :"+ob.getcontactNumber());
		System.out.println("Email :"+ob.getemail());
		System.out.println("prooftype :"+ob.getprooftype());
		System.out.println("proofid :"+ob.getproofid());
		
		
		

		

}
}


