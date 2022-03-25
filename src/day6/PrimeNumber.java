package day6;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[]args) {
	int n,temp=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number");
	n=s.nextInt();
	
	for(int i=2;i<n-1;i++)
	{
		if(n%i==0)
		{
			temp=temp+1;
		}
	}
if(temp==n)
	System.out.println(n+ " is prime number");
else
	System.out.println(n+ " is not a prime number");
}




		// TODO Auto-generated method stub

	}


