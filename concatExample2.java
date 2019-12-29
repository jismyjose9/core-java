package StringMethods;

public class concatExample2 {
	public static void main(String[] args)
	{
		String str1="hello";
		String str2="Face@2.0";
		String str3="Reader";
		String str4=str1.concat(str2);//concatenating one string
		System.out.println(str4);
		String str5=str1.concat(str2).concat(str3);//concatenating multiple strings
		System.out.println(str5);
		
	}

}
