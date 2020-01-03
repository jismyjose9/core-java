package Regex;
import java.util.regex.*;
public class RegexExample {
	public static void main(String args[])
	{
		String content="Face - Focus Academy for career Enhancement - Face";
		String String="Face";
		Pattern pattern=Pattern.compile(String);//pattern class used to define pattern
		Matcher matcher=pattern.matcher(content);//matcher class used to find matches
		while(matcher.find())
		{
			System.out.println("found at: "+matcher.start()+"-"+(matcher.end()-1));
		}
		
		  System.out.println(Pattern.matches("focu.", "focus" ));
		  System.out.println(Pattern.matches("face", "face" ));
		  System.out.println(Pattern.matches("fa*", "faa" ));
		  System.out.println(Pattern.matches("fa*e", "fake" ));
	}

}
