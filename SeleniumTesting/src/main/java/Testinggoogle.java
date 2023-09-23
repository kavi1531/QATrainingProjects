import java.time.Duration;
import org.openqa.selenium.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testinggoogle {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
        

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.google.co.in/");
        System.out.println(driver.getTitle());
        WebElement googleSearch = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        googleSearch.sendKeys("Indian restaurants near me");
        WebElement searchClick=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
        searchClick.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        System.out.println(driver.getCurrentUrl());
        driver.close();

	}

}
