
package com.test1;

//import java.awt.Button;
//import java.net.http.WebSocket;
import java.time.Duration;

//import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
//import org.openqa.selenium.By.ByLinkText;
//import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	static WebDriver driver;
	
	@BeforeSuite
	
//	public void name(String browser)
//	{
//		if (browser.equalsIgnoreCase("chrome"));
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//	}
	
	//new

			
	
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com");
//		//driver.navigate().to("https://www.google.com");
//		//System.out.println(driver.getCurrentUrl());
//		//System.out.println(driver.getTitle());
//		
//		//driver.switchTo().newWindow(WindowType.WINDOW);
//		//driver.switchTo().newWindow(WindowType.TAB);
//		//driver.get("https:/www.yahoo.com");
//		//System.out.println(driver.getCurrentUrl());
	
		
		driver.findElement(By.xpath("//*[@id=\"u_0_0_p9\"]"));
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		
	}
}
