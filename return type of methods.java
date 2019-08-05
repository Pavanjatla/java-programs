import java.util.*;
public class tested{
int a;
Void type2(int x)
{
  a=x;
  System.out.println(a);
}
int type3()
{
  a=50;
  return a;
}
int type4(int x)
{
  a=x;
  return a;
}
}
class test{
public static void main(){
test.ob=new test();
ob.type2(100);
int c=ob.type3();
System.out.println(c);
System.out.println(ob.type(1000));
}
}


