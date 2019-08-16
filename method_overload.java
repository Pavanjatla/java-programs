class test
{
	void area(int a,int b)
	{
		System.out.println("area of rectangle is :"+a*b);
	}
	void area(float c)
	{
		System.out.println("area of circle is :"+Math.PI*c*c);
	}
	void area(float d,float e)
	{
		System.out.println("area of triangle :"+0.5*d*e);
	}
}
class overload
{
	public static void main(String[] args)
	{
		test rect=new test();
		rect.area(5,6);
		test circle=new test();
		circle.area(5.6f);
		test triangle=new test();
		triangle.area(7.0f,8.5f);
		
	}
}