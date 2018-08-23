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
		int n1,n2;
		n1=s.nextInt();
		n2=s.nextInt();
		int m=n1*n2;
		int i;
		int count=0;
		for(i=0;i<=m;i++)
		{
			if(m==i*i)
			{
				count=1;
			}
		}
		if(count==1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}
