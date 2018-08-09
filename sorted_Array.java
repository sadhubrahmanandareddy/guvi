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
	 int n,i,j,temp;
	 int ar[]=new int[20];
	 n=s.nextInt();
	
	 	 for(i=1;i<=n;i++)
	 	 {
	 	 	ar[i]=s.nextInt();
	 	 }
	 	 for(i=1;i<=n;i++)
	 	 {
	 	 	for(j=i+1;j<=n;j++)
	 	 	{
	 	 		if(ar[i]>ar[j])
	 	 		{
	 	 		  temp=ar[i];
	 	 		  ar[i]=ar[j];
	 	 		  ar[j]=temp;
	 	 		}
	 	 	}
	 	 	
	 	 }
	 	 for(i=1;i<=n;i++)
	 	 {  if(i<n)
	 	 	System.out.print(ar[i]+" ");
	 	 	else
	 	 	System.out.print(ar[n]);
	 	 }
	 
	}
}
