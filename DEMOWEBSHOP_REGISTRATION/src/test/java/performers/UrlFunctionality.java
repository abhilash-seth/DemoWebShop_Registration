package performers;

import Browser.Browser;
import io.cucumber.java.en.*;
import pages.Home;

public class UrlFunctionality extends Browser{

@Given("open the chrome")
public void open_the_chrome() {
	setDriver();  
}

@When("Enter the url")
public void enter_the_url() {
	getUrl("http://demowebshop.tricentis.com/");
}

@Then("page is displayed")
public void page_is_displayed() throws Exception {
	Home.validateUrl();   
}
}
