class object1{
	object1(String name)
	{
		System.out.println(name);
	}
	object1()
	{
	 
	}
	int a;
	void name1(int d)
	{
		a=d;
		System.out.print(a);
	}
	public static void main(String args[])
	{	
		object1 one=new object1("pavan sai ram");
		object1 two=new object1();
		two.a=20;
		two.name1(two.a);
	}
}