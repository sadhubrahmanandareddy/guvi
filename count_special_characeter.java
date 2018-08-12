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
	
	  for(i=0;i<string.length();i++)
	  {
	  	c=string.charAt(i);
	  	if(Character.isLetter(c))  //for alphabet checking
	  	{
	  	continue;	
	  	}
	         if(c==' ') //for spacee checking
	         {
	         	continue;
	         }
	  	if(Character.isDigit(c))  //for number checking
	  	{
	  	continue;	
	  	}
	           else
	 	{
	 		co++;
	 	}
	 }
	 System.out.println(co);
	
	}
}
