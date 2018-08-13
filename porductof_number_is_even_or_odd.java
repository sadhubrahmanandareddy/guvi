/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int mul;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		mul=n*m;
		if(mul%2==0)
		{
			System.out.println("even");	
		} 
		else
		{
		System.out.println("odd");
		}
	} 
}
