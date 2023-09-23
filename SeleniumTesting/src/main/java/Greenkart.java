import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Greenkart {

	public static void main(String[] args) throws InterruptedException, IOException{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[2]/form/input")).sendKeys("Brocolli");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();;
        String expecteditem = "2";
        WebElement actualitem =  driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[1]/table/tbody/tr[1]/td[3]/strong"));
        String itemsno = actualitem.getText();
        try {
        	Assert.assertEquals(itemsno,expecteditem);
        	System.out.println("WORKING");
            File src1 = ((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src1, new File("C:\\Users\\16124\\screenshotgreenkart1.png"));
        }catch(AssertionError e)
        {
        	System.out.println("Couldn't take Screenshot");
        }
        //WebElement price=driver.findElement(By.xpath("/html/body/div[1]/div/header/div/div[3]/div[1]/table/tbody/tr[2]/td[3]/strong"));
        //Assert.assertEquals("120",price);
        
        //File src1 = ((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src1, new File("C:\\Users\\16124\\screenshotgreenkart.png"));
        
        
        driver.close();
	}

}
