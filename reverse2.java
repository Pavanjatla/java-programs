import java.util.*;
public class reverse2
{
	public static void main(String[] args) 
	{
		int i;
		System.out.println("enter a string");
		Scanner obj=new Scanner(System.in);
		String a=obj.nextLine();
		String reverse=" ";
		for (i=a.length()-1;i>=0 ;i-- )
		{
			reverse=reverse + a.charAt(i);
		}
		System.out.print(reverse);
	}
}