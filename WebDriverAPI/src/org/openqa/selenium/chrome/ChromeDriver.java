package org.openqa.selenium.chrome;

import org.openqa.selenium.WebDriver;

public class ChromeDriver implements WebDriver {
	
	
	public ChromeDriver(){
		
		System.out.println("Lauching Chrome Browser");
		
	}
	
	
	public void get(String url){
		
		System.out.println("Navigating to the URL in Chrome");
		
	}
	
	
	public void getTitle(){
		
		System.out.println("Getting the title in Chrome");
	}
	
	public void click(String locator){
		
		System.out.println("Clicking on an Element in Chrome");
		
	}


	
	public void sendKeys(String value) {


		System.out.println("Typing in Chrome");
		
	}
	


}
