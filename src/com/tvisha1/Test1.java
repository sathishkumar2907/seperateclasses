package com.tvisha1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test1 extends Test {
public WebElement element;
	@org.testng.annotations.Test
	public void test2() throws InterruptedException{
		
		
		Thread.sleep(1000);
		WebElement request_post=driver.findElement(By.linkText("Request Post"));
		request_post.click();
		
		Thread.sleep(3000);
		int rows_count_admin=driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr")).size();
		System.out.println(" Request Rows count    "+rows_count_admin);
		
		int coloumns_count_admin=driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr[1]/td")).size();
		System.out.println(" Request coloums count  "+coloumns_count_admin);
		
		
		int cell_count1=driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr/td")).size();
		System.out.println(" Request cells count  "+cell_count1);
		
//		String first_part="//*[@id='mCSB_2_container']/table/tbody/tr[";
//		String second_part="]/td[";
//		String Third_part="]";
		
//		for(int i=1;i<rows_count_admin;i++){
//			for(int j=1;j<coloumns_count_admin;j++){
//		
		
		//=========================
//				List pagination =driver.findElements(By.xpath(".//*[@id='DataTables_Table_0_paginate']/span/a")); 
//				// checkif pagination link exists 
//
//				if(pagination.size()>0){ 
//				//sop("pagination exists"); 
//                 System.out.println("pagination exists");
//				// click on pagination link 
//
//				for(int i=1; i<pagination .size(); i++){ 
//					int rows_count_admin=driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr")).size();
//					System.out.println(" Request Rows count    "+rows_count_admin);
//				((WebElement) pagination.get(i)).click(); 
//				} 
//				} else { 
//					 System.out.println("pagination not exists"); 
//				} 
			
		
				List<WebElement> allrows = driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr"));
				System.out.println("all rows======>"+allrows.size());
				List<WebElement> allpages = driver.findElements(By.xpath("//*[@id='DataTables_Table_0_paginate']/span/a"));
				System.out.println("Total pages :" +allpages.size());
				   
				              for(int i=0; i<=(allpages.size()); i++){
				                   for(int row=1; row<=(allrows.size()); row++){
				            	  System.out.println("Total rows :" +allrows.size()); 
				    
				            	  System.out.println("new Row number "+driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+row+"]")).size());
				            	  
				            	  
				            	  try{
				            	  List<WebElement> allrows_for = driver.findElements(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+row+"]"));
				  				  System.out.println("all rows======>"+allrows.size());
				            	  
				  				  
				  				  for(WebElement k:allrows_for){
				  					  
				  					  System.out.println("page row count "+k.getSize());
				  				  }
				  				  
				                  String name = driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+row+"]/td[5]")).getText();
				                  System.out.println("name =======> "+name);
				                  System.out.println("Row loop");
//				                  String pagewise_text = driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+row+"]/td["+i+1+"]")).getText();
//				                  System.out.println(pagewise_text+"==================================");
				                  
//				                    if(name.contains("Accepted"))
//				                        {
//				                            WebElement editbutton = driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+row+"]/td[5]"));
//				                            editbutton.click();
//				                            break;
//				                        }
//				                    else
//				                    {
//				                        System.out.println("Element doesn't exist");
//				                    }
//				                    allpages = driver.findElements(By.xpath("//*[@id='DataTables_Table_0_paginate']/span/a"));
//				                    driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//						            allpages.get(i).click();
				              
				                  
				            	}catch(Exception e){
				            		e.printStackTrace();	
				            	}
				               }
                             try{
				            
				            allpages = driver.findElements(By.xpath("//*[@id='DataTables_Table_0_paginate']/span/a"));
				            driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
				            allpages.get(i).click();
				            }catch(Exception e){
				            	e.printStackTrace();
				            }
				          }
				
	 //==========================================	
     //String celldata=driver.findElement(By.xpath("//*[@id='DataTables_Table_0']/tbody/tr["+i+"]/td["+j+"]")).getText();
     //System.out.println(" "+ celldata);
     			
//				String accepted=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/tbody/tr["+i+"]/td["+j+"]/span")).getAttribute("class");
//				System.out.println(accepted+" Accepted");
			
//			}
//		 }
	
//		for(int i=1;i<rows_count_admin;i++){
//			for(int j=1;j<coloumns_count_admin;j++){
//		
//		
//		String accepted=driver.findElement(By.xpath(".//*[@id='DataTables_Table_0']/thead/tr/td/span")).getText();
//		System.out.println(accepted+" Accepted");
//		String approved="";
//		String pending="";
//			}}
		
	  }
	}
