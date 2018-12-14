package programsonjava;

public class Geomentric_Area 
{
public void area(float a)
{
	System.out.println("area of a squre"+a*a+"sq.units");
	
}
public void area(float a,float b)
{
	System.out.println("area of a rectangle"+a*b+"sq.units");
	
}
public void area(double a)
{
	System.out.println("area of a circle"+3.14*a*a+"sq.units");
	
}
public static void main(String[] args)
{
	Geomentric_Area ga=new Geomentric_Area();
	ga.area(3.2);
	ga.area(3,4);
	ga.area(2.4);
}
	
}


