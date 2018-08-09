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
		int array[]=new int[10];
		int n=s.nextInt();
		int i,j,t,median;
	
		for(i=0;i<n;i++)
		{
		   array[i]=s.nextInt();   //array value reading here
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
		                      if(array[i]>array[j])
				{
					 t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
			} 
			
		}
	
		if(n%2==0)
		{
			median=(array[(n/2)]+array[((n-2)/2)])/2;
	                   System.out.println(median);
			
		}
		else{
			median=array[n/2];
			System.out.println(median);
		}		
		}
}
