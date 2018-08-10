/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int ho1,m1,h2,m2;
		int ho,min;
		ho1=s.nextInt();
		m1=s.nextInt();
		h2=s.nextInt();
		m2=s.nextInt();
		ho=ho1-h2;
		min=m1-m2;
		
		System.out.println(Math.abs(ho)+" "+Math.abs(min));
	}
}
