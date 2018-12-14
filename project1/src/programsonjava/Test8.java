package programsonjava;

public class Test8 {

	public static void main(String[] args) 
	{
		Sample8 s=new Sample9();
		int a=s.add(10,30);
		int b=s.subtract(20,4);
		//create obj to concreate class
		Sample9 s1=new Sample9();
		int c=s1.add(33,44);
		int d=s1.subtract(40,33);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

	}

}
