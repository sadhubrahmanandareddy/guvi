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
		 int n=s.nextInt();
		 if(n>0)
		{
			if(n%2==0)
			System.out.println("Even");
			else
			System.out.println("Odd");
		}	
		
		else
		{
			System.out.println("Invalid");
		}
	}
}
