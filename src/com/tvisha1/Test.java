package com.tvisha1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test extends Tvisha1{

	@org.testng.annotations.Test(dataProvider="tk",dataProviderClass=Tvisha2.class)
	public void test1(String name,String email) throws InterruptedException{
		
		By user_path=By.xpath("//*[@id='username']");
		By pass_path=By.xpath("//*[@id='password']");
		By login_path=By.id("signup_btn");
		
		
		try{
		//Thread.sleep(500);
		//WebDriverWait wait =new WebDriverWait(driver, 30);
		//Thread.sleep(1000);
		WebElement name1=driver.findElement(user_path);
		name1.sendKeys(name);
		
		Thread.sleep(1000);
		WebElement email1=driver.findElement(pass_path);
		email1.sendKeys(email);
		
		Thread.sleep(1000);
		WebElement password1=driver.findElement(login_path);
		password1.click();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
  }
