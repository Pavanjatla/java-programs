
public class decimal{
	public static void main(String a[]){
	String s1="123456.658";
	int n,f;
	n=s1.length();
	f=s1.indexOf('.');
	System.out.println("before decimal "+f);
	int k=(n-1)-f;
	System.out.print("after decimal "+k);
}
}
