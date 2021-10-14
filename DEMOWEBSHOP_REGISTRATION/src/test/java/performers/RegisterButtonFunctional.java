package performers;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Home;
import pages.Registration;

public class RegisterButtonFunctional extends Browser {

@Given("user is on home page of demo web shop")
public void user_is_on_home_page_of_demo_web_shop() {
	setDriver();
	getUrl("http://demowebshop.tricentis.com/");
}

@When("user clicks on Register_Button")
public void user_clicks_on_Register_Button() {
	Home.clickRegister();
   
}

@Then("Register page is Displayed")
public void register_page_is_Displayed() {
	Registration.validateUrlRegister();
   
}


}
