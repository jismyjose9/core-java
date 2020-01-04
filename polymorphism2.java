package corejava;
class Animal{

	public void animalsound()
	{
		System.out.println("Sounds of the Different Animals");
	}
	
	}
 class Lion extends Animal//class Lion extends the class Animal
 {
	 public void animalsound()
	 {
		 System.out.println("The Lion Roares"); 
	 }
 } 
 class Cat extends Animal //class Cat extends the class Animal
 {
	 public void animalsound()
	 {
		 System.out.println("The Cat Mouyaoo"); 
	 }
 }
 class Dog extends Animal //class Dog extends the class Animal
 {
	 public void animalsound()
	 {
		 System.out.println("The Dog Barking"); 
	 }
 }
 
 
public class polymorphism2 {
	public static void main(String args[])
	{
		Animal myanimal=new Animal();
		Animal myLion=new Lion();
		Animal myCat=new Cat();
		Animal myDog=new Dog();
		myanimal.animalsound();
		myLion.animalsound();
		myCat.animalsound();
		myDog.animalsound();
		
		
		
		
	}

}
