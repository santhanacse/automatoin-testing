package Day42Testng;
/*
 * open app
 * login
 * logout

 * 
 */

import org.testng.annotations.Test;

public class Firsttestcase {
    @Test(priority=100)
	void openapp()
	{
		System.out.println("opening app");
	}
    @Test(priority=1)
	void login()
	{
		System.out.println("log in");
	}
    @Test
	void logout()
	{
		System.out.println("log out");
	}
	}
	
	
	
	

