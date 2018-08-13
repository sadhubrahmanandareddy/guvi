/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,count=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int array[]=new int[28];
		for(i=1;i<=n;i++)
	   {
	   	array[i]=s.nextInt();
	   }
	   for(i=1;i<=n;i++)
	   {
	   	if(k==array[i])
	   	{
	   		count=count+1;
	   		break;
	   	}
	   }
	   if(count==1)
	   {
	   	System.out.println("yes");
	   }else
	   {
	   System.out.println("no");
	   }
	}


}
