/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int r,i;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n>0)
		{
		for(i=n;i<=n+10;i++)
		{
		
			if(i%10==0)
			{
				System.out.println(i);
			}
		}
		}
		else
		{
			System.out.println("entre greater than zero values..... ");
		}
	}
}
