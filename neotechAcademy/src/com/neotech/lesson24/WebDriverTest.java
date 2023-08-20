package com.neotech.lesson24;

public class WebDriverTest {
	
	//Runtime Polymorphism
	//Method overriding
	//The driver will open the browser depending on the object
	//that has been created
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.openBrowser();
		
		ChromeDriver cd=new ChromeDriver();
		cd.openBrowser();
		
		
		//example of polymorphism for the future job use
		boolean isChrome= false;
		WebDriver wd;
		if(isChrome) {
			wd=new ChromeDriver();
		}else {
			wd=new FirefoxDriver();
		}
		
		//Go to facebook
		//Enter username
		//Enter password
		//Click on the login button
		
		
		
		
		
		
		
		
	}

}
