package programsonjava;

import java.util.Scanner;

public class Stringpalindrome {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word");
		String x=sc.nextLine();
		String y="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			y=y+z;

		}
		System.out.println(y);
		if(y.equals(x))
		{
			System.out.println("given string is a palindrome");
		}
		else
		{

			System.out.println("given string is not a palindrome");
		
		}


	}

}
