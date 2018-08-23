/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i=0;
		int a[]=new int[20];
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0)
		{
			int r=n%10;
			if(r%2!=0)
			{
				a[i++]=r;
			}
			n=n/10;
		}
		for(int j=i-1;j>=0;j--)
		{             if(j>=1)
			System.out.print(a[j]+" ");
			if(j==0)
			System.out.println(a[j]);
		}
	}
}
