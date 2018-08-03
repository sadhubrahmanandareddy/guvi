/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{ 
		int r,ams=0,p;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		p=n;
		while(n>0)
		{
			r=n%10;
			ams=ams+r*r*r;
			n=n/10;
		}
		if(p==ams){
		System.out.println("yes");
		}
		else
		{
		System.out.println("no");
		}
	}
}
