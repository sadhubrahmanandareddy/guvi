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
		Scanner sc=new Scanner(System.in);
		String stri=sc.nextLine();
		for(int i=0;i<stri.length();i++)
		{
			char c=stri.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='O'||c=='U'||c=='I')
			{
				count=1;
			}
		}
		if(count==1)
			System.out.println("yes");
		else
		System.out.println("no");
	
	}
}
