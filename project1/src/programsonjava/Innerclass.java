package programsonjava;

public class Innerclass 
{
	int x=10;
	int y=20;
	int z=x+y;
	public void display()
	{
		System.out.println(z);
	}

public static class Outclass
{
	public static void main(String[] args)
	{
		Innerclass ic=new Innerclass();
		ic.display();
		
	}
	
}
}