import java.io.*;
import java.util.*;
public class lab2{
	public static void main(String args[]){
	int i,j;
	for(i=2;i<100;i++)
	{
	   int count=1;
	   for(j=2;j<i;j++)
	   {
	      if(i%j==0)
	       {
		count=0;
	       }
	   }
	   if(count==1)
	    {
		System.out.println("prime numbers:"+i);
	    }
           count=1;
	     
	 }
						 }
     		 }