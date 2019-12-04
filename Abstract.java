package corejava;

public class Abstract {
	public static void main(String args[])
	{
		Racoon racoon=new Racoon("Racoon");
		 racoon.eat();
		 racoon.breathe();
	}
}
abstract class Food{

	private String name;
	public Food  (String name) {
		this.name=name;
	}
	public abstract void eat();
	public abstract void breathe();
	public String getName(){
		return name;
	}
}
class Racoon extends Food{
	public Racoon(String name){
		super(name);
	}
	public void eat(){
		System.out.println(getName()+" is eating");
	}
	
		
		
	public void breathe(){
		System.out.println("breathe in,breathe out,repeat");
	}
	
			
	
		
}


