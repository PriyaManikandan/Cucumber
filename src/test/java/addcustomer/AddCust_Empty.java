package addcustomer;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCust_Empty {
static WebDriver dr;
	/*@Given("The Customer is in add customer page")
	public void the_Customer_is_in_add_customer_page() {
		System.setProperty("webdriver.chrome.driver", "E:\\New_work\\AddCust\\driver\\chromedriver.exe");
	     dr=new ChromeDriver();
	     dr.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user click the submit button without filling any fields")
	public void the_user_click_the_submit_button_without_filling_any_fields() {
		dr.findElement(By.name("submit")).click();
		
	}

	@Then("The user should get the alert message")
	public void the_user_should_get_the_alert_message() {
 Alert a=dr.switchTo().alert();
 String name="please fill all fields";
Assert.assertEquals(a.getText(), name);
 a.accept();

	}*/

@Given("The Customer is in add customer page")
public void the_Customer_is_in_add_customer_page() {
	System.setProperty("webdriver.chrome.driver", "E:\\New_work\\AddCust\\driver\\chromedriver.exe");
    dr=new ChromeDriver();
    dr.get("http://demo.guru99.com/telecom/addcustomer.php"); 
}

@When("The user click the submit button without filling any fields")
public void the_user_click_the_submit_button_without_filling_any_fields() {
	dr.findElement(By.name("submit")).click();
}

@Then("The user should get the alert message")
public void the_user_should_get_the_alert_message() {
	Alert a=dr.switchTo().alert();
	 String name="please fill all fields";
	Assert.assertEquals(a.getText(), name);
	 a.accept();
}

@When("The user click the submit button with invalid data's")
public void the_user_click_the_submit_button_with_invalid_data_s() {
	    dr.findElement(By.xpath("//label[text()='Done']")).click();

     dr.findElement(By.id("fname")).sendKeys("sdbsae54354");
     dr.findElement(By.id("lname")).sendKeys("dbsh54545");
     dr.findElement(By.id("email")).sendKeys("hello");
	    dr.findElement(By.name("addr")).sendKeys("6343#$");
	    dr.findElement(By.id("telephoneno")).sendKeys("sdsajd");

}

@Then("The user should get the error message")
public void the_user_should_get_the_error_message() throws InterruptedException   {
    Assert.assertTrue(dr.findElement(By.xpath("(//label[text()='Numbers are not allowed'])[1]")).isDisplayed());
    Assert.assertTrue(dr.findElement(By.xpath("(//label[text()='Numbers are not allowed'])[2]")).isDisplayed());
    Assert.assertTrue(dr.findElement(By.xpath("//label[text()='Email-ID is not valid']")).isDisplayed());
      Assert.assertTrue(dr.findElement(By.xpath("//label[@id='message3']")).isDisplayed());
    Assert.assertTrue(dr.findElement(By.xpath("//label[text()='Characters are not allowed']")).isDisplayed());



}

}