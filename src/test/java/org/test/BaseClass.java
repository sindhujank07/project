package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
private void BrowserLaunch() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

}
}
