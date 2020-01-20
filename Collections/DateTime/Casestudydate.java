package DateTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Casestudydate {
	
	
	
	
	public static void main(String[] args)
	{
	int r;
	int room=1;
	int id=1;
	int i=0;

	String b;
	String b1="";
	String b2="";
	String b3="";
	String sdate;
	String edate;

	LocalDate localDate=LocalDate.now();
	DateTimeFormatter dateFormatter=DateTimeFormatter.ISO_LOCAL_DATE;

	Casestudydate2 arr[]=new Casestudydate2[10];
	Casestudydate3 brr[]=new Casestudydate3[10];
	Scanner ob=new Scanner(System.in);
	do
	{
	System.out.print("1. Booking \n2. View \n3. Exit");
	r=ob.nextInt();
	switch(r)
	{
	case 1:
	do
	{
	System.out.println("\tRegistration");
	System.out.println("Enter your name:");
	String n=ob.next();
	System.out.println("Enter your address:");
	String a=ob.next();
	System.out.println("Contact Number:");
	String p=ob.next();
	System.out.println("Email ID:");
	String e=ob.next();
	System.out.println("Enter proof type:");
	String pt=ob.next();
	System.out.println("Enter proof id:");
	String pi=ob.next();
	arr[i]=new Casestudydate2();
	arr[i].register(id,n,a,p,e,pt,pi);
	System.out.println("Thank you for registering.Your id is :"+id);
	System.out.println("Do you want to book a room (y/n)?");
	b=ob.next();
	if(b.equals("y"))
	{
	System.out.println("<\t*****Booking*****>");
	System.out.println("Please choose the services required.");
	System.out.println("AC/non-AC(AC/nAC)");
	String ac=ob.next();
	System.out.println("Cot(Single/Double)");
	String cot=ob.next();
	System.out.println("With cable connection/without cable connection(C/nC)");
	String cable=ob.next();
	System.out.println("Wi-Fi needed or not(W/nW)");
	String wifi=ob.next();
	System.out.println("Laundry service needed or not(L/nL)");
	String laundry=ob.next();
	System.out.println("Enter the date of booking");
	String date=ob.next();
	DateTimeFormatter datetime=DateTimeFormatter.ofPattern("dd-LL-yyyy");
	LocalDate d1=LocalDate.parse(date,datetime);

	brr[i]=new Casestudydate3();
	brr[i].booking(id,room,d1,ac,cot,cable,wifi,laundry);

	System.out.println("Do you want to proceed?(yes/no)");
	b1=ob.next();

	if(b1.equals("yes"))
	{
	System.out.println("Thank you for booking. Your room number is "+room);
	}
	else
	{
	System.out.println("Thank you");
	}
	}
	else
	{
	System.out.println("Thank you");
	}

	System.out.println("Do you want to continue registration?(yes/no)");
	b2=ob.next();

	i++;
	id++;
	room++;

	}
	while(b2.equals("yes"));
	break;
	case 2:
	System.out.println("View all bookings");

	System.out.println("Enter the start date");
	sdate=ob.next();
	DateTimeFormatter datetime1=DateTimeFormatter.ofPattern("dd-LL-yyyy");
	LocalDate d2=LocalDate.parse(sdate,datetime1);

	System.out.println("Enter the end date");
	edate=ob.next();
	DateTimeFormatter datetime2=DateTimeFormatter.ofPattern("dd-LL-yyyy");
	LocalDate d3=LocalDate.parse(edate,datetime2);

	System.out.println("The bookings made from "+d2+" to "+d3+" are");
	System.out.println("Room number\t"+"Customer ID");
	for(int j=0;j<i;j++)
	{
	if((brr[j].d1.isAfter(d2))&&(brr[j].d1.isBefore(d3)))
	brr[j].display();
	}
	break;
	case 3:
	System.exit(0);
	break;
	default:
	break;
	}
	System.out.println("Do you want to continue (yes/no)");
	b3=ob.next();

	}
	while(b3.equals("yes"));
	}

	}