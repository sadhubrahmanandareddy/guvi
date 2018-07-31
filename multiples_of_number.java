import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,i,d;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=5;i++)
		{
			d=n*i;
			System.out.print(d+" ");
			if(i==5)
			break;
		}
	}
}
