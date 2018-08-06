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
      int array[]=new int[10];
      int size,i;
      size=s.nextInt();
      int max;      
         for(i=0;i<size;i++)
           { 
         	array[i]=s.nextInt();
           }
            max=array[0];
         for(i=1;i<size;i++)
            {
         	if(max<array[i])
         	 {
         		max=array[i];
         	}
         }
         System.out.println(max);
	}
	
}
