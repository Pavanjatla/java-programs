class static{
static int a=10;
static int b;
static void display()
{
 System.out.println(a);
 System.out.println(b);
}
static
{
 System.out.println("static");
 b=a*10;
}
public static void main(String[] args)
{
System.out.print("main");
display();
}
}