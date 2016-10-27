// Program to find factorial of a number
import java.io.*;

class Factoral
{
	public static void main(String args[])
	{
		int i, j, f=1, n;
		System.out.println("Enter limit: ");
		int n = Integer.parseInt(System.console().readLine());
		for(i=1;i<=n;i++)
		{ f = f * i;}
		System.out.println("factorial of "+n+" is "+f);
	
	}
}
