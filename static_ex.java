class rest{
static int a=10;
static void display()
{
  System.out.println("hai");
  System.out.println(a);
}
public static void main(String args[])
{
rest ob1=new rest();
rest ob2=new rest();
ob1.display();
ob2.display();
a=50;
display();
}
}