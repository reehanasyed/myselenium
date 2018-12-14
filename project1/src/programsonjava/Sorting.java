package programsonjava;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		int x[]=new int[5];
		System.out.println("enter the element");
		for(int i=0;i<n;i++)
		{
		   System.out.println(x[i]+"");	
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
		{
			if(x[i]>x[j+1])
			{
				int temp=x[j];
				x[j]=x[j+1];
				temp=x[j+1];
			}
		}
				
		}
		
		//display array after sorting
		for(int i=0;i<n;i++)
		{
			System.out.println(x[i]+ " ");
		}
		


	}

}
