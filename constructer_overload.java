class area
{
	area(int a,int b)
	{

		System.out.println("area of rectangle is :" +a*b);
	}
	area(float c)
	{
		System.out.println("area of circle is :"+Math.PI*c*c);
	}
	 area(float d,float e)
	{
		System.out.println("area of triangle is :"+0.5*d*e);
	}
}
class c_overload
{
	public static void main(String[] args) 
	{
		area rect=new area(10,2);
		area triangle=new area(4.6f,5.0f);
		area circle =new area(2.5f);
	}
}