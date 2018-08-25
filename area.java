/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
                	double length,breadth,a;
		Scanner sc=new Scanner(System.in);
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		a=length*breadth;
		System.out.printf("%.5f",a);
	}
}
