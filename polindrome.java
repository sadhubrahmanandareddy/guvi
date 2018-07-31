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
	int rem,rev=0,m;
	int n=s.nextInt();
	
	m=n;
	while(n>0)
	{
		rem=n%10;
		rev=(rev*10)+rem;
		n=n/10;
		
	}
	if(rev==m)
	{
		System.out.println("yes");
		
	}
	else
	System.out.println("no");
	}
}
