/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		String string;
		string=s.next();
		char ch;
		int count=0,i;
		for(i=0;i<string.length();i++)
		{
		   ch=string.charAt(i);
		   if(Character.isLetter(ch))
		   {
		   	count=1;
		   }
		}
		if(count==1)
	          	System.out.println("no");
	          
	          else
	          System.out.println("yes");
	
	}
}
