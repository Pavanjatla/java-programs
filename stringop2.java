import java.lang.*;
public class stringop2
{
	public static void main(String args[])
	{
		String s,a="hello";
		String s1,b="pavan ";
		String c="pavan sai ram";
		boolean t,f;
		t=a.startsWith("he");
		System.out.println(t);
		f=b.endsWith("he");
		System.out.println(f);
		s=c.substring(1,4);
		System.out.println(s);
		s1=b.replace("avan ","ranav");
		System.out.println(s1);



	}
}