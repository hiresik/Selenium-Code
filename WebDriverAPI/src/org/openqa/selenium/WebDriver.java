package org.openqa.selenium;

public interface WebDriver {
	
	
	public void get(String url);
	public void getTitle();
	public void click(String locator);
	public void sendKeys(String value);

}
