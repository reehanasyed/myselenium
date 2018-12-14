package programsonjava;

public class Splitarray {

	public static void main(String[] args) 
	{
		String x="my@&name@isreehana";
		String y[]=x.split("@");
		System.out.println(y.length);
		for(int i=0;i<y.length;i++)
		{
			System.out.println(y[i]);
		}



	}

}
