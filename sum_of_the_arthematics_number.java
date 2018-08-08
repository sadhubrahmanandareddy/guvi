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
		int num,fi,co,su;
		num=s.nextInt();
		fi=s.nextInt();
		co=s.nextInt();
		if((num>=1&&num<=100000)&&(fi>=1&&fi<=100000)&&(co>=1&&co<=100000))
		{
		su =((num)*(2*fi + (num- 1)*co))/2;
		System.out.println(su);
	           }
	           else
	           {
	           	System.out.println("oops! enter values between 0 and 1000000");
	           	
	           }
	}
}
