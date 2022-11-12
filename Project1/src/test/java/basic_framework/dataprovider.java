package basic_framework;

import org.testng.annotations.DataProvider;

public class dataprovider 
{
	@DataProvider(name = "signupdata")
	public String[][] data()
	{
		String [][] arr = {{"sachin", "gm" , "sac@123", "sac123"}};
		return arr;
	}
	
	@DataProvider(name = "logindata")
	public String[][] log_data() 
	{
		String [][] arr1 = {{"sachin",  "sac@123"}};
		return arr1;
		
	}

}
