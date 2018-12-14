package programsonjava;

import java.util.Scanner;

public class CountOfStrings {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		int nol=0;//lower case
		int nou=0;//upper case
		int nod=0;//digits
		int nosc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			//ASCII values
			if(y<=122 && y>=97)
			{
				nol=nol+1;
			}
			else if(y<=97 && y>=65)
			{
				nou=nou+1;
			}
			else if(y<=57 && y>=48)
			{
				nod=nod+1;
			}
			else
			{
				nosc=nosc+1;
			}
		}
		System.out.println("no: of lower case are"+nol);
		System.out.println("no: of upper case are"+nou);
		System.out.println("no: of digits are"+nod);
		System.out.println("no: of special characters are"+nosc);

	}

}
