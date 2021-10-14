package performers;

import java.io.IOException;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Registration;

public class MismatchPasswordFunctionlity extends Browser {


@Given("user is on Registration_page of demo web shop")
public void user_is_on_Registration_page_of_demo_web_shop() {
	setDriver();
	getUrl("http://demowebshop.tricentis.com/register");
	
}

@When("user enters Valid details mismatch passwords")
public void user_enters_Valid_details_mismatch_passwords() throws IOException {
	Registration.enterFirstName(3, 0);
    Registration.enterLastName(3, 1);
    Registration.enterEmailId(3, 2);
    Registration.enterPassword(3, 3);
    Registration.enterConfirmPassword(3, 4);
}

@And("user clicks on register btn")
public void user_clicks_on_register_btn() throws InterruptedException {
	Registration.clickRegisterButton();
	Thread.sleep(5000);
}

@Then("error messsage displays password mismatch")
public void error_messsage_displays_password_mismatch() {
	Registration.mismatchpasswordHome();
  
}

}
