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
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
			else
			{
				count=2;
			}
		}
			if(count==2)     //to know how many factors 
			{
				System.out.println("no");
				
			}
			else
			System.out.println("yes");
		
	}
}
