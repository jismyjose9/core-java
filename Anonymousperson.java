package corejava;
import java.util.Scanner;
abstract class Anonymousperson {
	
		abstract void learn();

		public static void main(String args[])
		{
			
			 Anonymousperson p=new  Anonymousperson()
			 {
				void learn()
				{
					System.out.println("welcome ddugky face kollam");
				}
			 };
	      p.learn();
		
	}

}
