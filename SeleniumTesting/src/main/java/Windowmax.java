import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import java.util.concurrent.TimeUnit;

 

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowmax {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
        

        driver = new ChromeDriver(chromeOptions);
        
        
        //Static dropdown
        /*driver.manage().window().maximize();
        WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select selectdropdown = new Select(staticdropdown);
       selectdropdown.selectByIndex(1);
       System.out.println(selectdropdown.getFirstSelectedOption().getText());
        driver.close();*/
        
        //Dynamic dropdown
        /* WebElement dynamicdropdown = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
         dynamicdropdown.click();
         Thread.sleep(2000L);
         WebElement bhopaloption = driver.findElement(By.xpath("//a[@value='BHO']"));
         bhopaloption.click();
         Thread.sleep(1000L);
         WebElement delhioption = driver.findElement(By.xpath("(//a[@value='DEL'])[2]"));
         delhioption.click();
         Thread.sleep(1000L);
         driver.close();*/
        
        //Checkboxes
        
       /*System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
       
       driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
       System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
       driver.close();*/
        
        
        //Dynamic dropdown list items
       /* 
        WebElement countrylist = driver.findElement(By.xpath("/html/body/form/div[4]/div[1]/div[1]/div[1]/div/fieldset/input"));
        countrylist.sendKeys("CHI");
        Thread.sleep(2000L);
        List<WebElement> suggestedcountries = countrylist.findElements(By.xpath("/html/body/form/div[4]/div[1]/div[1]/div[1]/div/fieldset/input"));
        for(WebElement e : suggestedcountries)
        {
        	if(e.getText()=="China")
        	{
        		System.out.println(e.getText());
        		
        	}
        }
        
        
        
        
        driver.close();*/
        
        /*driver.get("https://www.google.com");

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea")).sendKeys("Testing");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")));

        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();

        System.out.println("It Works!");

        driver.close();*/
        
        
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        Thread.sleep(2000);

        List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        

        for(int i =0; i<products.size(); i++) {

            String name = products.get(i).getText();

            

            if(name.contains("Cucumber")) {

                //Click on Add to Cart

                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();

                break;

            }

        }

        System.out.println("It works!");

        driver.close();
       
       
	}

}
