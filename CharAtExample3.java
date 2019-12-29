package StringMethods;

public class CharAtExample3 {
	public static void main(String[] args)
	{
		String str="Welcome to FACE portal";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)//find frequency of t in the string
		{
			if(str.charAt(i)=='t')
			{
				count++;
				
			}
		}
		System.out.println("Frequency of t is:"+count);
	}

}
