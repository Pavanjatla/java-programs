public class stringop
{
	public static void main(String args[])
	{
		int l,r,i;
		boolean t,f;
		String a="i am a human";
		String b="the";
		String c="Ball";
		String d="ball";
		l=a.length();
		System.out.println(l);
		r=b.compareTo(c);
		System.out.println(r);
		i=d.compareToIgnoreCase(c);
		System.out.println(i);
		f=c.equals(d);
		System.out.println(f);
		t=c.equalsIgnoreCase(d);
		System.out.println(t);





	}
}