import org.openqa.selenium.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.*;

import org.openqa.selenium.By.*;


public class Testing1 {
	
	public static void main(String[] args) {
		WebDriver driver;
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\16124\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/");
        System.out.println(driver.getTitle());
        WebElement bootCamps = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[2]/a[4]"));
        bootCamps.click();
        System.out.println(driver.getCurrentUrl());
        driver.close();*/
        
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
        // Create the driver object

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.w3schools.com/");
        System.out.println(driver.getTitle());
        WebElement bootCamps = driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[2]/a[4]"));
        bootCamps.click();
        System.out.println(driver.getCurrentUrl());
        driver.close();
	}

}
