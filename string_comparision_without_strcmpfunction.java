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
	     	String st1=s.nextLine();
			String st2=s.nextLine();
		if(st1.length()==st2.length())
	             	{
			System.out.println(st1);
			}
                            else if(st1.length()>st2.length())
       
                            {
        	                 System.out.println(st1);
                            }
                        else 
                          {
                       System.out.println(st2);
	           }
}
}
