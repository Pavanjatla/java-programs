public class fibanocci
{
	public static void main(String args[])
	{
		int n=5;
		int f1,f2,f3,f4,i;
		f1=0;
		f2=1;
		for(i=1;i<=n;i++)
		{
			if(i==1)
			{
				System.out.println(f1);
			}
			else if(i==2)
			{
				System.out.println(f2);
			}
			else
			{
				f3=f1+f2;
				System.out.println(f3);
				f1=f2;
				f2=f3;

			}
		}

	}
}