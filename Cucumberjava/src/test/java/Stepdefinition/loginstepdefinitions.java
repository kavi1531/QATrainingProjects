package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;
import java.util.ArrayList;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class loginstepdefinitions {
WebDriver driver=null;

private List<String> shoppingCart = new ArrayList<String>();

	

	@Given("The user opens the browser")

	public void Browser_is_open() {

		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();

	}

	

	@When("The user enters the valid URL")

	public void enters_url() throws InterruptedException {

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");

		Thread.sleep(2000);

	}

	

	@Then("The user is able to see the Green Cart icon")

	public void see_gren_cart() {

		driver.findElement(By.xpath("/html/body/div/div/header/div/div/div")).isDisplayed();

		System.out.println("Its working");

		driver.close();

		driver.quit();

	}
	

    @Given("the user has an empty shopping cart")
    public void userHasEmptyCart() {
        shoppingCart.clear();
    }

    @When("they add {string} to the cart")
    public void addToCart(String item) {
        shoppingCart.add(item);
        System.out.println(item + " added to the cart.");
    }

    @Then("the cart should contain {string}")
    public void cartShouldContain(String item) {
        Assert.assertTrue(shoppingCart.contains(item), "Expected item not found in the cart");
        System.out.println("Verified that the cart contains " + item);
    }
	
	

}
