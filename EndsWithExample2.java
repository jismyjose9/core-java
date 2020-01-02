package StringMethods;

public class EndsWithExample2 {
	public static void main(String[] args)
	{
		String str="Welcome to FACE.in";
		System.out.println(str.endsWith("in"));
		if(str.endsWith(".com"))
		{
			System.out.println("strings ends with.com");//returns true
		}
		else
		{
			System.out.println("It does not end with.com");
		}
	}

}
