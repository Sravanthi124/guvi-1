import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=0,i=0;
          Scanner X = new Scanner(System.in);
	System.out.print("Enter value n : ");
	n = X.nextInt();
	for(i=1; i<n; i++)
	{
	if(i%2!=0)
	System.out.print(i+" ");
	}
	System.out.println();
	}
}
