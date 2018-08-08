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
	   int n1,n2,temp;
	   n1=s.nextInt();
	   n2=s.nextInt();
	   if(n1<=100000&&n2<=100000)
	   {
	   	 temp=n1;
	   	 n1=n2;
	   	 n2=temp;
	   	 System.out.print(n1+" "+n2);
	   }
	   else{
	   	System.out.print("oops!enter  have must enter the below 100000 only");
	   }
	}
}
