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
		Scanner s=new Scanner(System.in);
                      String str=s.next();
                      
                        int length=str.length();
                      
                        int n=s.nextInt();
                        for(i=length-n;i<str.length();i++)
                        {
                        	char ch=str.charAt(i);
                        	System.out.print(ch);
                        }
	}
}
