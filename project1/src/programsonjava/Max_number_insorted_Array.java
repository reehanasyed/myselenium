package programsonjava;

import java.util.Scanner;

public class Max_number_insorted_Array {

	public static void main(String[] args) 
	{
        int a[]=new int[5];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i< 5;i++)
        {
            System.out.println("Enter "+(i+1)+"of array:");
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i = 0;i <5;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Maximum value:"+max);

	}

}
