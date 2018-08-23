/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		String ori,rev="";
		Scanner s=new Scanner(System.in);
	           ori=s.nextLine();
	           int len=ori.length();
	          for(i=len-1;i>=0;i--)
	           {
	           	rev=rev+ori.charAt(i);
	           }
	        if(ori.equals(rev))
	        {
	    	System.out.println("yes");
	        }
	    else
	    System.out.println("no");
	}
}
