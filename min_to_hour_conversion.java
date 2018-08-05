import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int h,m;
		m=s.nextInt();
		if(m<60)
		{
			h=0;
	      System.out.print(h+" "+m);
	      
		}
		else
		{
			h=m/60;
			m=m%60;
			System.out.print(h+" "+m);
		}
		
	}
}
