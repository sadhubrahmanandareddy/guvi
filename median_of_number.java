/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[10];
		int n=s.nextInt();
		int i,j,t,median;
		if(n>=1&&n<=1000)
		{
		for(i=0;i<n;i++)
		{
		   a[i]=s.nextInt();   //array value reading here
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
		                      if(a[i]>a[j])
				{
					 t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			} 
			
		}
	
		if(n%2==0)
		{
			median=(a[(n/2)]+a[((n-2)/2)])/2;
	                   System.out.println(median);
			
		}
		else{
			median=a[n/2];
			System.out.println(median);
		}		
			
		}  	
		else{
			System.out.printf("enter the size between 0 and 10000!");
			
		}
		
		
	}
}
