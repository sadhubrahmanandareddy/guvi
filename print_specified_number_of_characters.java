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
                       int k;
		char array[]=s.next().toCharArray();
		k=s.nextInt();
		for(i=0;i<k;i++)
		{
			System.out.print(array[i]);
		}
	}
}
