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
	 int a[]=new int[20];
	 n=s.nextInt();
	 if(n>=1&&n<=100000)
	 {
	 	 for(i=1;i<=n;i++)
	 	 {
	 	 	a[i]=s.nextInt();
	 	 }
	 	 for(i=1;i<=n;i++)
	 	 {
	 	 	for(j=i+1;j<=n;j++)
	 	 	{
	 	 		if(a[i]>a[j])
	 	 		{
	 	 		  temp=a[i];
	 	 		  a[i]=a[j];
	 	 		  a[j]=temp;
	 	 		}
	 	 	}
	 	 	
	 	 }
	 	 for(i=1;i<=n;i++)
	 	 {  if(i<n)
	 	 	System.out.print(a[i]+" ");
	 	 	else
	 	 	System.out.print(a[n]);
	 	 }
	 }
	 else
	 {
	 	System.out.print("oops! you enterd the out out of the range .enter between 0 and 1000000");
	 }
	}
}
