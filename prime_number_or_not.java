import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n, i, flag = 0;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 for(i=2;i<=n;i++)
		 {
		 	if(n%i==0)
		 	{
		 	flag=1;
		 	break;
		 	}
		 }
		 if(flag==0)
		 System.out.println("yes");
		 else
		 System.out.println("no");
		
	}
}
