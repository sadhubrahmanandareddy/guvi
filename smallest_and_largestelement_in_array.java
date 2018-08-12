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
		int n,i,j,max,min;
		n=s.nextInt();
		int a[]=new int[29];
		for(i=1;i<=n;i++)
		{
	           	a[i]=s.nextInt();
	           	
		}
		max=a[1];
	           for(i=1;i<=n;i++)
	           {
	           	for(j=i+1;j<=n;j++)
	           	{
	           		if(max<a[j])
	           		{
	           			max=a[j];
	           		}
	           	}
	           	
	           }	min=a[1];
	           for(i=1;i<=n;i++)
	           {
	           	for(j=i+1;j<=n;j++)
	           	{
	           		if(min>a[j])
	           		{
	           			min=a[j];
	           		}
	           	}
	           	
	           }
	           
	  	           	System.out.println(min+" "+max);
	  	           	

	}
}
