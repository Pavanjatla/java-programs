public class sort
{
	public static void main(String args[])
	{
		int a[]={1,5,8,3,2,7,6,9,4};
		int i,j,temp;
		for (i=0;i<a.length ;i++ )
		{
			for(j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.print("after sorting");
		for (i=0;i<a.length ;i++ )
		{
			System.out.print(a[i]);
		}
		
	}
}