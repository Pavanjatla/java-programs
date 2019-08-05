import java.util.*;
public class token{
	public static void main(String rgs[]){
	StringTokenizer str1=new StringTokenizer("Hello How are:you", ":",true);
	int a=str1.countTokens();
	System.out.println(a);
	boolean b=str1.hasMoreTokens();
	System.out.println(b);
	String c=str1.nextToken();
	System.out.println(c);
	String d=str1.nextToken();
	System.out.println(d);
}
}