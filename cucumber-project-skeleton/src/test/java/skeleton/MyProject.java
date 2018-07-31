package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class MyProject {
private WebDriver driver;

@Given("^user is on the login page$")
public void user_is_on_the_login_page() throws Throwable {
   System.setProperty("webdriver.chrome.driver","C:\\users\\pdc4-training.pdc4\\chromedriver.exe");
   driver = new ChromeDriver();
   driver.get("http://newtours.demoaut.com/");
}

@When("^user provides the correct credentials$")
public void user_provides_the_correct_credentials() throws Throwable {
  driver.findElement(By.name("userName")).sendKeys("invalid");
  driver.findElement(By.name("password")).sendKeys("invalidpwd");
  driver.findElement(By.name("login")).click();
}

@Then("^user can fo successful login$")
public void user_can_fo_successful_login() throws Throwable {
   Assert.assertEquals("Find a Flight", driver.getTitle());
}

}

