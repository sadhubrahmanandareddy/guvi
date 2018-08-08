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
		int num,n1=1,n2=1,i,su;
		num=s.nextInt();
		for(i=1;i<=num;i++)
		{        if(i<num)
		      {  
			System.out.print(n1+" ");
	                   		su=n1+n2;
			n1=n2;
			n2=su;
		      }
	                 	else{
		           	System.out.print(n1);
	                 	}
		}
	}
}
