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
		String str=s.nextLine();
		int alpha=0,digit=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isLetter(ch))
			{
				alpha=1;
			}
			else if(Character.isDigit(ch))
			{
				digit=1;
			}
		}
		if(alpha==1 && digit==1)
		System.out.print("Yes");
		else
		System.out.print("No");
	}
}
