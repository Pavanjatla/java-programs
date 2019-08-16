import java.util.*;
class details
{
	double number;
	int id;
	String name;
	void display()
	{
		System.out.println("number: "+number);
		System.out.println("id: "+id);
		System.out.println("name: "+name);

	}
}
class main
{
	public static void main(String[] args) 
	{
		Scanner number=new Scanner(System.in);
		System.out.println("enter the number of the student");
		long n=number.nextLong();
		System.out.println("enter the id of the student");
		int i=number.nextInt();
		System.out.println("enter the name of the student");
		String p=number.next();
		details obj=new details();
		obj.number=n;
		obj.id=i;
		obj.name=p;
		obj.display();



	}
}