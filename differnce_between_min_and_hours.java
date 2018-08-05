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
		int hour1,minute1,hour2,minute2;
		int hours,minutes;
		hour1=s.nextInt();
		minute1=s.nextInt();
		hour2=s.nextInt();
		minute2=s.nextInt();
		hours=hour1-hour2;
		minutes=minute1-minute2;
		
		System.out.println(Math.abs(hours)+" "+Math.abs(minutes));
	}
}
