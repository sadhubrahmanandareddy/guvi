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
      int a[]=new int[10];
      int si,i;
      si=s.nextInt();
      int max;   
            
         for(i=0;i<si;i++)
           { 
         	a[i]=s.nextInt();
           }
            max=a[0];
         for(i=1;i<si;i++)
            {
         	if(max<a[i])
         	 {
         		max=a[i];
         	}
         }
         System.out.println(max);
	}
}
