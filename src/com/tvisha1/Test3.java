package com.tvisha1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test3 extends Test2{

   @Test
   public void alerts_admin(){
	 By alerts_path_admin=By.linkText("Alerts");
	 By alerts_button_admin=By.xpath("//button[contains(text(),'Add New Alert')]");  
	 
	 
	 
	 
	 WebElement alerts_link_admin=driver.findElement(alerts_path_admin);
	 alerts_link_admin.click();
	 
	 WebElement alerts_button_link_admin=driver.findElement(alerts_button_admin);
	 alerts_button_link_admin.click();
	 
	   
   }
	
	
}
