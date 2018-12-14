package programsonjava;

import java.util.Scanner;

public class PlusOpertor {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=x+y;
		System.out.println(z);
		float x1=sc.nextFloat();
		float z1=x1+y;
		System.out.println(z1);
		char x2='a';
		int z2=x2+y;
		System.out.println(z2);

	}

}
