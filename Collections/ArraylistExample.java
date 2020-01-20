package Collections;
import java.util.Scanner;
//public class ArraylistExample {
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class user {
     int id;
     String name;
     String address;
     String ph;
     String email;
     String ptype;
     String pid;
user(int id,String name,String address,String ph,String email,String ptype,String pid)
{
    this.id=id;
    this.name=name;
    this.address=address;
    this.ph=ph;
    this.email=email;
    this.ptype=ptype;
    this.pid=pid;
}
//public static int i=1;
public void register(int id,String n,String a,String p,String e,String pt,String pi)
{
    Scanner ob=new Scanner(System.in);
    String op1,op2;
    this.name=n;
    this.address=a;
    this.ph=p;
    this.email=e;
    this.ptype=pt;
    this.pid=pi;
    this.id=id;
}//i++;
   String getname()
   {
     return this.name;
   }
   String getaddress()
   {
     return this.address;
   }
   String getph()
   {
     return this.ph;
   }
   String getemail()
   {
     return this.email;
   }
   String getptype()
   {
     return this.ptype;
   }
   String getpid()
   {
     return this.pid;
   }
   int getid()
   {
     return this.id;
   }
}
public class ArraylistExample
 {
public static void main(String args[])throws NullPointerException
{
    String ac;
    String cot;
    String cable;
    String wifi;
    String laundry;
int date=0,d1,d2;

Scanner ob=new Scanner(System.in);
int r;
String op1,op2,op3,op4;
List<user>list=new LinkedList<user>();
//casehotelbook d[]=new casehotelbook[20];
int i=0,s=101,k=0,j;
int id=1;
do {
System.out.print("1.Registration\n2.View\n3.Exit\n");
r=ob.nextInt();
switch(r)
{
case 1:
do
{
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
//c[i]=new email();
//c[i].register(id,n,a,p,e,pt,pi)
System.out.println("Thank you for registering.Your id is :"+id);

user S=new user(id,n,a,p,e,pt,pi);
list.add(S);
id++;
i++;
System.out.println("Do you want to continue registration (yes/no)");
op4=ob.next();
}while(op4.equals("yes"));
break;
case 2:
System.out.println("enter your id");
int lid=ob.nextInt();
      for(j=0;j<list.size();j++)
      {
      if(lid==(list.get(j).getid()))
      {
      System.out.println(list.get(j).getid());//using gets() and sets()
      System.out.println(list.get(j).getname());
      System.out.println(list.get(j).getaddress());
      System.out.println(list.get(j).getph());
      System.out.println(list.get(j).getemail());
      System.out.println(list.get(j).getptype());
      System.out.println(list.get(j).getpid());
      }
        else
      {
      System.out.println("Invalid entry");
      break;
          }
       }
     
     
case 3:
System.exit(0);
}
System.out.println("Do you want to continue (yes/no)");
      op1=ob.next();
}while(op1.equals("yes"));
}
}