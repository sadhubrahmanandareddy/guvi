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
		int i,count=0;
		int n=s.nextInt();
		for(i=2;i<n/2;i++)
		{
		if(n%i==0)
		count=1;
		break;
		}
		if(count==1)
		System.out.println("no");
		else
		System.out.println("yes");
	}
	
}
