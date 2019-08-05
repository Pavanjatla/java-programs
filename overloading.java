 class area{
	int l,w;
	double r,b,h;
	 area(double x)
	{
	   r=x;
	   System.out.println(Math.PI*r*r);
	 }
	 area(int a,int b)
	{ 
	  l=a;
	  w=b;
	System.out.println(l*w);
	}
	 area(double s,double f)
	{
	  b=s;
	  h=f;
	  System.out.println(0.5*b*h);
	}
}
class overloading{
	public static void main(String args[]){
	geometry obj=new geometry();
	obj.area(10,20);
	obj.area(5.5,6.5);
	obj.area(8.5);
	area rec=new area(20,10);

}
}
	

	