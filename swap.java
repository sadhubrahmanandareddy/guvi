import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner s=new Scanner(System.in);
	   int num1,num2,temp;
	   num1=s.nextInt();
	   num2=s.nextInt();
	   if(num1<=100000&&num2<=100000)
	   {
	   	 temp=num1;
	   	 num1=num2;
	   	 num2=temp;
	   	 System.out.print(num1+" "+num2);
	   }
	   else{
	   	System.out.print("oops!enter  have must enter the below 100000 only");
	   }
	}
}
