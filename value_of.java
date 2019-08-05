public class value{
	public static void main(String args[]){
	int a=10;
	Integer od=new Integer(10);
	int b=od;
	System.out.println(b);
	Integer obb=Integer.valueOf(a);
	System.out.println(obb);
	int c=od.intValue();
	System.out.println(c);
	float u=5.6f;
	Float king=Float.valueOf(u);
	System.out.println(u);
	Float sum=Float.valueOf(a+u);
	System.out.println(sum);
}
}