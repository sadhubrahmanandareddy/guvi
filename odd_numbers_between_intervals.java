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
	    int i,n,m;
	    n=s.nextInt();
	    m=s.nextInt();
	     if(n<=m)
	     {
	     	for(i=n;i<=m;i++)
	     	{
	     		if(i==n)
	     		continue;
	     		if(i%2!=0)
	     	System.out.print(i);
	     		
	     	}
	          
	     }
	}
}
