package StringMethods;

public class CompareToExample1 {
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//returns the length of s1 because s2 is empty
		System.out.println(s2.compareTo(s3));//returns the length of s3
		
		
	}

}
