package programsonjava;

import java.util.Scanner;

public class Common_integer {

	public static void main(String[] args) {

		String x[]=new String[8];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<8;i++)
		{
			System.out.println("enter the "+(i+1)+"word");
			x[i]=sc.nextLine();
		}
		for(int i=0;i<8;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(x[j+1].compareTo(x[j])>0)
				{
					String temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
		//display
		for(int i=0;i<8;i++)
		{
			System.out.println(x[i]+"");
		}
	}

}
