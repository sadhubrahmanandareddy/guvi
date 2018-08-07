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
		int number,firstterm,commondiff,sum;
		number=s.nextInt();
		firstterm=s.nextInt();
		commondiff=s.nextInt();
		if((number>=1&&number<=100000)&&(firstterm>=1&&firstterm<=100000)&&(commondiff>=1&&commondiff<=100000))
		{
		sum =((number)*(2*firstterm + (number- 1)*commondiff))/2;
		System.out.println(sum);
	           }
	           else
	           {
	           	System.out.println("oops! enter values between 0 and 1000000");
	           	
	           }
	}
}
