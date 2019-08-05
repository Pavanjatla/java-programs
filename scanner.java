import java.lang.*;
import java.util.*;
public class scanner{
	public static void main(String args[]){
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a name");
		String num=ab.nextLine();
		StringBuffer de=new StringBuffer(num);
		de.reverse();
		System.out.println(de);

	}

}