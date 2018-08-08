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
	  String string=s.nextLine();
	  int i,co=0;
	  char c;
	  if(string.length()<=1000){
	  for(i=0;i<string.length();i++)
	  {
	  	c=string.charAt(i);
	  	if(c==' ')
	  	{
	  	co=co+1;
	  	}
	    }
	
	System.out.print(co);
	  }
	  else
	  {
	  	System.out.println("oops! you entered the above the 1000 characters .try again....");
	  }
}
}
