/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,lower,upper;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		lower=s.nextInt();
		upper=s.nextInt();
		if(n>lower&&n<upper)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
