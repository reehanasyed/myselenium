package programsonjava;

import java.util.Scanner;

import org.openqa.selenium.By;

public class Switchcase {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string in numbers");
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++)
		{
			char c=x.charAt(i);
    		String y=" ";
    		switch(c)
    		{
    			case '0':
    			y="zero";
    			break;
    			case '1':
        		y="one";
        		break;
    			case '2':
        		y="two";
        		break;
    			case '3':
        		y="three";
        		break;
    			case '4':
        		y="four";
       			break;
    			case '5':
       			y="five";
       			break;
    			case '6':
       			y="six";
       			break;
    			case '7':
       			y="seven";
       			break;
    			case '8':
       			y="eight";
       			break;
    			case '9':
       			y="nine";
       			break;
    		}
    		System.out.println(y);
    	}

	}

}
