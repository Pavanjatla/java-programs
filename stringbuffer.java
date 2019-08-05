import java.lang.*;
class stringbuffer
{
	public static void main(String args[])
	{
		int i;
		StringBuffer s=new StringBuffer("hello world");
		System.out.println(s);
		s.append(" program");
		System.out.println(s);
		s.insert(5," hai");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		s.delete(0,4);
		System.out.println(s);
		s.deleteCharAt(4);
		System.out.println(s);
		//i=indexOf();
		//System.out.println(i);



	}
}