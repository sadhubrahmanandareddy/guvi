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
		int length=s.nextInt();
              	int width=s.nextInt();
		int height=s.nextInt();
		int surfacearea=2*length*width+2*length*height+2*width*height;
		int volume=length*width*height;
      System.out.print(surfacearea+" "+volume);
      
	}
}
