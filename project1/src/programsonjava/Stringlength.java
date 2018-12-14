package programsonjava;

public class Stringlength {

	public static void main(String[] args) 
	{
		String x="ahgnjmbb vbhgh hjgvfv hyjbhfgyhj hjgyitfgmhnbhjui hgytfcggkjmkj";
		int y=x.length();
		System.out.println(y);
		String x1="Mindq";
		String y1="mindq";
		if(x1.equals(y1))
		{
			System.out.println("two strings are equal");
		}
		else
		{
			System.out.println("two strings are unequal");
		}
		if(x1.equalsIgnoreCase(y1))
		{
			System.out.println("equal with ignorecase");
		}
		else
		{
			System.out.println("unequal");
		}

	}

}
