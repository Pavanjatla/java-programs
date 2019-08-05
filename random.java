import java.util.*;
public class random
{
	public static void main(String a[]){
	double d=Math.random();
	double e=Math.random();
	System.out.println(d);
	System.out.println(e);
	Random some=new Random(100);
	double c=some.nextDouble();
	System.out.println(c);

}
}
