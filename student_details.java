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
		details student=new details();
		student.number=949199;
		student.id=370;
		student.name="pavan sai ram";
		student.display();

	}
}