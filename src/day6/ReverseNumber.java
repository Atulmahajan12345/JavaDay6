package day6;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n,r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number");
		n=s.nextInt();
		
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		
		}

	}


	
		
		// TODO Auto-generated method stub

	}


