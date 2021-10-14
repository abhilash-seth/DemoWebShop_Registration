package performers;

import java.io.IOException;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Registration;

public class ValidDetailsFunctionality extends Browser {


@Given("user is on registration page of demo_web_shop")
public void user_is_on_registration_page_of_demo_web_shop() {
	setDriver();
	getUrl("http://demowebshop.tricentis.com/register");
	
}

@When("user enters Valid details")
public void user_enters_Valid_details() throws IOException, Exception {
    Registration.enterFirstName(1, 0);
    Registration.enterLastName(1, 1);
    Registration.enterEmailId(1, 2);
    Registration.enterPassword(1, 3);
    Registration.enterConfirmPassword(1, 4);
    
}

@And("user clicks on register-button")
public void user_clicks_on_register_button() throws InterruptedException {
	Registration.clickRegisterButton();
	Thread.sleep(5000);
}
   

@Then("user is navigated to home page of demo web shop")
public void user_is_navigated_to_home_page_of_demo_web_shop() {
	Registration.validateUrlHome();
   
}

}
