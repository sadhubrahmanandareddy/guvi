/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i=1,n,r,k;
		Scanner s=new Scanner(System.in);
	            n=s.nextInt();
	             int a[]=new int[16];
	  
                   while(n>0) 
                   {
                      	r=n%10;                           
      	             if(r%2!=0)                                                        //  n=3056
      	             {
      	             a[i++]=r;                                                             //a[i]=r;-> the output  3  0 5 0
      	                                                                                 
                       	}                                                                                 //  i++;
                    
      	           n=n/10;
                         }
                       for(k=i-1;k>0;k--)
                       {
      	          System.out.print(a[k]+" ");
      	         
                       }
	           }
                     }
