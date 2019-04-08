package addcustomer;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import java.util.*;
import junit.framework.Assert;

public class AddCustomerSteps {
 static WebDriver dr;
	/*@Given("The user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	     System.setProperty("webdriver.chrome.driver", "E:\\New_work\\AddCust\\driver\\chromedriver.exe");
	     dr=new ChromeDriver();
	     dr.get("http://demo.guru99.com/telecom/addcustomer.php");
	}

	@When("The user fill in the customer details")
	public void the_user_fill_in_the_customer_details( ) {
 	    dr.findElement(By.xpath("//label[text()='Done']")).click();
	    dr.findElement(By.id("fname")).sendKeys("hello");
	    dr.findElement(By.id("lname")).sendKeys("world");
	    dr.findElement(By.id("email")).sendKeys("hello@gmail.com");
	    dr.findElement(By.name("addr")).sendKeys("chennai");
	    dr.findElement(By.id("telephoneno")).sendKeys("364346");


	    
	    
	}
	@When("The user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
	     dr.findElement(By.name("submit")).click();
	}

	@Then("The user should see the Customer ID generated")
	public void the_user_should_see_the_Customer_ID_generated() {
	     Assert.assertTrue(dr.findElement(By.tagName("h3")).isDisplayed());
	}
*/
 
 		//Passing Values Using LIST
/* @Given("The user is in add customer page")
 public void the_user_is_in_add_customer_page() {
	 System.setProperty("webdriver.chrome.driver", "E:\\New_work\\AddCust\\driver\\chromedriver.exe");
     dr=new ChromeDriver();
     dr.get("http://demo.guru99.com/telecom/addcustomer.php");

 }

 @When("The user fill in the customer details")
 public void the_user_fill_in_the_customer_details(DataTable cust_details) {
     List<String> List_cust = cust_details.asList(String.class);
     System.out.println(List_cust);
     dr.findElement(By.xpath("//label[text()='Done']")).click();
	    dr.findElement(By.id("fname")).sendKeys(List_cust.get(0));
	    dr.findElement(By.id("lname")).sendKeys(List_cust.get(1));
	    dr.findElement(By.id("email")).sendKeys(List_cust.get(2));
	    dr.findElement(By.name("addr")).sendKeys(List_cust.get(3));
	    dr.findElement(By.id("telephoneno")).sendKeys(List_cust.get(4));

     
 }

 @When("The user clicks the submit button")
 public void the_user_clicks_the_submit_button() {
	 dr.findElement(By.name("submit")).click();
 }

 @Then("The user should see the Customer ID generated")
 public void the_user_should_see_the_Customer_ID_generated() {
	 Assert.assertTrue(dr.findElement(By.tagName("h3")).isDisplayed());
 }
*/
 			//Pass Values Using Map
 /*@Given("The user is in add customer page")
 public void the_user_is_in_add_customer_page() {
	 System.setProperty("webdriver.chrome.driver", "E:\\New_work\\AddCust\\driver\\chromedriver.exe");
     dr=new ChromeDriver();
     dr.get("http://demo.guru99.com/telecom/addcustomer.php");
 }

 @When("The user fill in the customer details")
 public void the_user_fill_in_the_customer_details(DataTable cus_details) {
     
	 Map<String, String> cust_map = cus_details.asMap(String.class, String.class);
	 System.out.println(cust_map);
	 dr.findElement(By.id("fname")).sendKeys(cust_map.get("fname"));
	    dr.findElement(By.id("lname")).sendKeys(cust_map.get("lname"));
	    dr.findElement(By.id("email")).sendKeys(cust_map.get("email"));
	    dr.findElement(By.name("addr")).sendKeys(cust_map.get("address"));
	    dr.findElement(By.id("telephoneno")).sendKeys(cust_map.get("telephno"));

 }

 @When("The user clicks the submit button")
 public void the_user_clicks_the_submit_button() {
	 dr.findElement(By.name("submit")).click();
 }

 @Then("The user should see the Customer ID generated")
 public void the_user_should_see_the_Customer_ID_generated() {
	 Assert.assertTrue(dr.findElement(By.tagName("h3")).isDisplayed());
 }
*/
 

@Given("The user is in add customer page")
public void the_user_is_in_add_customer_page() {
	System.setProperty("webdriver.chrome.driver", "E:\\New_work\\AddCust\\driver\\chromedriver.exe");
    dr=new ChromeDriver();
    dr.get("http://demo.guru99.com/telecom/addcustomer.php");
}

@When("The user fill in the customer details")
public void the_user_fill_in_the_customer_details(DataTable custlists) {
    
	List<String> ccdet=custlists.asList(String.class);
	List<ccdet,String> ccdetail = custlists.asList(String.class);
     System.out.println(ccdetail);
     dr.findElement(By.xpath("//label[text()='Done']")).click();
	    dr.findElement(By.id("fname")).sendKeys(ccdetail.get(2).get(0));
	    dr.findElement(By.id("lname")).sendKeys(ccdetail.get(2).get(1));
	    dr.findElement(By.id("email")).sendKeys(ccdetail.get(2).get(2));
	    dr.findElement(By.name("addr")).sendKeys(ccdetail.get(2).get(3));
	    dr.findElement(By.id("telephoneno")).sendKeys(ccdetail.get(2).get(4));

}

@When("The user clicks the submit button")
public void the_user_clicks_the_submit_button() {
	dr.findElement(By.name("submit")).click();
}

@Then("The user should see the Customer ID generated")
public void the_user_should_see_the_Customer_ID_generated() {
	Assert.assertTrue(dr.findElement(By.tagName("h3")).isDisplayed());
}





}
