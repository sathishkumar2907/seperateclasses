package com.tvisha1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends Test1 {
	public WebElement element;
	
	@Test
	public void proposal_met(){
		By proposal=By.linkText("Proposal");
		By allrows_path_proposal=By.xpath("//*[@id='DataTables_Table_0']/tbody/tr");
		By allpages_path_proposal=By.xpath("//*[@id='DataTables_Table_0_paginate']/span/a");
		 
		
		WebElement proposal_link = driver.findElement(proposal);
		proposal_link.click();
		
		
		List<WebElement> allrows_proposal=driver.findElements(allrows_path_proposal);
		System.out.println(allrows_proposal.size());
		List<WebElement> allpages_proposal=driver.findElements(allpages_path_proposal);
		System.out.println(" all pages in proposal count "+allpages_proposal.size());
		
		for(int k=0;k<allpages_proposal.size();k++){
			for(int j = 1;j<allrows_proposal.size();j++){
				System.out.println(allrows_proposal.size());
				
//				 String name = driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+j+"]/td[5]")).getText();
//                 System.out.println("name =======> "+name);
                 System.out.println("Row loop");
               
                 
			}
			try{
			allpages_proposal = driver.findElements(By.xpath(".//*[@id='DataTables_Table_0_paginate']/span/a"));
	            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
	            allpages_proposal.get(k).click();
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
	} 
	

}
