package StringMethods;

import java.util.ArrayList;

public class EqualsExample2 {
	public static void main(String[] args)
	{
		String str1="FACENXT";
		ArrayList<String> list=new ArrayList<>();//useing the array of elements
		list.add("FACE");//string add to the array of list
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str: list)
		{
			if(str.contentEquals(str1))
			{
				System.out.println("FACENXT is present");
			}
		}
		
	}

}
