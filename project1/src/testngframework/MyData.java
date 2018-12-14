package testngframework;

import org.testng.annotations.DataProvider;

public class MyData 
{
	@DataProvider(name="searchword")
	public Object[][] testdata()
	{
		return new Object[][]
				{
					{"moon"},
					{"stars"},
					{"sky"},
					{"trees"}
				};
		
	}
}
