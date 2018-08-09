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
	 int n,i,j,t;
	 int arr[]=new int[10];
	 n=s.nextInt();
	
	 for(i=0;i<n;i++)
	 {
	 	arr[i]=s.nextInt();
	 	}
	 	for(i=0;i<n;i++)
	 	{
	 		for(j=i+1;j<n;j++)
	 		{
	 			if(arr[i]>arr[j])
	 			{
	 				t=arr[i];
	 				arr[i]=arr[j];
	 				arr[j]=t;
	 			}
	 		}
	 	}
	 	
	 	for(i=0;i<n-1;i++){
	 	System.out.print(arr[i]+" ");
	 		
	 	}
	 	System.out.print(arr[i]);
	 

	}
}
