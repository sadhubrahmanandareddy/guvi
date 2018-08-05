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
		int hours,min;
		min=s.nextInt();
		if(min<60)
		{
			hours=0;
	      System.out.print(hours+" "+min);
	      
		}
		else
		{
			hours=min/60;
			min=min%60;
			System.out.print(hours+" "+min);
		}
		
	}
}
