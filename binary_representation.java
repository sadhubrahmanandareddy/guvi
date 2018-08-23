/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int count=0;
	   Scanner s=new Scanner(System.in);
	   String str=s.next();
	   int len=str.length();
	   for(int i=0;i<len;i++)
        {
        	char ch=str.charAt(i);
        	if(ch=='1')
        	{
        		count=1;
        	}
        	else if(ch=='0')
        	{
        		count=1;
        	}
        	else
        	{
        		count=0;
        	}
        	
        }
        if(count==1)
        System.out.println("yes");
        else
        System.out.println("no");
  
	}
}
