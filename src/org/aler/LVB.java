package org.aler;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LVB {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pc\\eclipse-workspace\\Selenium Task1\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	     String lvb="https://retail.onlinesbi.com/retail/login.htm";
	     
	     driver.get(lvb);
	    
	     driver.manage().window().maximize();
	}

}
