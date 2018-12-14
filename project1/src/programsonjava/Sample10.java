package programsonjava;

public class Sample10 
{
	public int x;
	private Sample10()
	{
		x=10;
		
	}
	public void display()
	{
		System.out.println(x);
	}
	public static Sample10 create()
	{
		Sample10 s=new Sample10();
		return(s);
	}

}
