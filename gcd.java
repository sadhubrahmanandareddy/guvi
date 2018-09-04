import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int gcd=1;
		/*System.out.println("a factors");
		for(i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("b factors are");
			for(i=1;i<=b;i++)
		{
			if(b%i==0)
			{
				System.out.println(i);
			}
		}*/
		for(i=1;i<=a && i<=b;++i)
		{
			if(a%i==0 && b%i==0)
			{
			gcd=i;;
			}
		}
		System.out.println(gcd);
		
	}
}
