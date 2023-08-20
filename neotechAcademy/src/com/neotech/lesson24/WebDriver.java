package com.neotech.lesson24;

public class WebDriver {
	public void openBrowser() {
		System.out.println("Open browser");
	}
}

class ChromeDriver extends WebDriver {
	@Override
	public void openBrowser() {
		System.out.println("Open chrome browser");
	}
}
	class FirefoxDriver extends WebDriver {
		@Override
		public void openBrowser() {
			System.out.println("Open Firefox Browser");
		}
	}
	class InternetExplorerDriver extends WebDriver {
		@Override
		public void openBrowser() {
			System.out.println("Open Internet Explorer Browser");
		}
	}
