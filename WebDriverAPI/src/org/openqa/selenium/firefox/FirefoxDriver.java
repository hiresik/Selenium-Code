package org.openqa.selenium.firefox;

import org.openqa.selenium.WebDriver;

public class FirefoxDriver implements WebDriver {
	
	
	public FirefoxDriver(){
		
		System.out.println("Launches firefox browser");
	}
	
	
	public void get(String url){
		
		System.out.println("Navigating to the URL in Firefox");
		
	}
	
	public void getTitle(){
		
		System.out.println("Getting the title in Firefox");
	}
	
	public void click(String locator){
		
		System.out.println("Clicking on an Element in Firefox");
		
	}
	
	public void sendKeys(String value) {


		System.out.println("Typing in Firefox");
		
	}

}
