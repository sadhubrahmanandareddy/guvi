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
              String str=s.nextLine();
              char a[]=new char[78];
              for(i=0;i<str.length();i++)
              {
              	char c=str.charAt(i);
              	if(Character.isDigit(c))
              	{
              	a[i]=c;
                        System.out.print(a[i]);
              	}
              }
	}
}
