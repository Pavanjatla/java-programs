class test
{
	int a;
	test()
	{
		a=10;
		System.out.println(a);
	}
	void display(int a)
	{
		this.a=40;
		System.out.println(a);
		System.out.println(this.a);
	}
}
class test2_pro
{
	public static void main(String args[])
	{
		test obj=new test();
		obj.display(20);
	}
}