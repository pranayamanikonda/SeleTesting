package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLaunch {

	public static void main(String[] args)
	{
		
		FirefoxDriver driver =new FirefoxDriver();
		
		driver.get("http://facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
