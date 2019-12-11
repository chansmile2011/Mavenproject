package framework;

import org.testng.annotations.Test;

public class CapaignTest {
	
	@Test
	public void createCampainTest()
	{
		
		
		String BROWSER=System.getProperty("browser");
		String URL=System.getProperty("url");
		
		String USER=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PASSWORD);
		
		
		System.out.println("execute createCampaigntest");
		

}
}