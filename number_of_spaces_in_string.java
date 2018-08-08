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
	  int i,count=0;
	  char ch;
	  if(str.length()<=1000){
	  for(i=0;i<str.length();i++)
	  {
	  	ch=str.charAt(i);
	  	if(ch==' ')
	  	{
	  	count=count+1;
	  	}
	    }
	
	System.out.print(count);
	  }
	  else
	  {
	  	System.out.println("oops! you entered the above the 1000 characters .try again....");
	  }
}
}
