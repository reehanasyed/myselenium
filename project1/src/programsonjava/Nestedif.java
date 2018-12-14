package programsonjava;

public class Nestedif {

	public static void main(String[] args) 
	{
      int x=89;
      int y=77;
      int z=100;
      if(z>x+y)
      {
    	System.out.println(z);
    	if(z<x+y)
    	{
    		System.out.println(z);
    	}
    	else
    	{
    		System.out.println(z);
    	}
      }
      else
      {
    	  System.out.println(z);
      }
	}

}
