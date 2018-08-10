/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,count=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char ch;
		for(i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
