/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,min;
		int a[]=new int[45];
		Scanner s=new Scanner(System.in);
	    //  String str=s.nextInt();
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		min=a[0];
		for(i=0;i<10;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}System.out.println(min);
		
	}
}
