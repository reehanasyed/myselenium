package programsonjava;

import java.util.Scanner;

public class Common_integer1 {

	public static void main(String[] args)
	{
		int x[]= {12,78,98,97};
		int y[]= {23,12,56,78};
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<y.length;j++)
			{
				if(x[i]==y[j])
				{
					System.out.println(x[i]);
				}
			}
		}
	}

}
