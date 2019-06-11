package com.tvisha1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;




public class Tvisha1 {
public static WebDriver driver;
	
    @BeforeTest
	public void tvisha1() throws InterruptedException{
		//System.setProperty("webdriver.chrome.driver","D:\\sathish_softwares\\chromedriver.exe");
		driver=new FirefoxDriver();
    	
    	driver.manage().window().maximize();
		driver.get("http://192.168.2.10/saadhya/public/login");
		Thread.sleep(500);
//		WebElement login_link=driver.findElement(By.xpath("//*[@id='menu-top']/li[1]/a"));
//		login_link.click();
	}
	
	@AfterTest
	public void quit(){
//		}	driver.close();
//		driver.quit();
	}
	
     } 
