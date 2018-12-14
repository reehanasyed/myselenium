package collections;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String x=sc.nextLine();
		String n="";
		for(int i=x.length()-1;i>=0;i--)
		{
			char z=x.charAt(i);
			  n=n+z;
		}
		System.out.println(n);
		
		
		

	}

}
