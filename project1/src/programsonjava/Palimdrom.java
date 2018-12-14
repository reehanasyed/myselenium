package programsonjava;

import java.util.Scanner;

public class Palimdrom {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digits");
		num=sc.nextInt();
		int a=num;
		int y=0;
		int d;
		while(num>0)
		{
			d=num%10;
			y=y*10+d;
			num=num/10;
		}
		if(y==a)
		{
			System.out.println(a+" is a palindrome number");
		}
		else
		{
			System.out.println(a+"it is not a palindrome");
		}
			
	}

}
