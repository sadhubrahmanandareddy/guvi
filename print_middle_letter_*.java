/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
	
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char a[]=str.toCharArray();
		int n=str.length();
		if(n%2==0)
		{
			a[n/2]='*';
			a[n/2-1]='*';
		}
		else
		{
			a[n/2]='*';
		}
		for(i=0;i<n;i++)
		System.out.print(a[i]);
	}
}
