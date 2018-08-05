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
		int hr1,min1,hr2,min2;
		int hours,minutes;
		hr1=s.nextInt();
		min1=s.nextInt();
		hr2=s.nextInt();
		min2=s.nextInt();
		hours=hr1-hr2;
		minutes=min1-min2;
		
		System.out.println(Math.abs(hours)+" "+Math.abs(minutes));
	}
}
