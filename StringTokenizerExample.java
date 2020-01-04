package StringTokenizer;
import java.util.StringTokenizer;
public class StringTokenizerExample {
	public static void main(String[] args)
	{
		String str="I , am , going , to , split , this, string by,space";
		StringTokenizer st=new StringTokenizer(str);//creating the object st
		System.out.println("split by space");
		while (st.hasMoreElements())//using the method hasMoreElements()
	
	{
		System.out.println(st.nextElement());
	}
		
		System.out.println();
		System.out.println("split by ,");
		StringTokenizer st2=new StringTokenizer(str, ",");
		while (st2.hasMoreElements())
		{
			System.out.println(st2.nextElement());
		}
		
	

}
}
