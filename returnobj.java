class example
{
	int a;
	example()
	{
		a=10;
		System.out.println(a);
	}
	example display(example ob)
	{
		ob.a=ob.a+30;
		return ob;
	}
}
class example_pro
{
	public static void main(String[] args) 
	{
		example ob1=new example();
		example ob2;
		ob2=ob1.display(ob1);
		System.out.println(ob2.a);
		ob1.a=50;
		ob1=ob2.display(ob1);
		System.out.println(ob2.a);
		
	}
}