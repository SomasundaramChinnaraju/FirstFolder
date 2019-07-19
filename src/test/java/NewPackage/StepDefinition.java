package NewPackage;



import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^User Must be registered$")
	public void user_Must_be_registered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User must be registered!!");
	    //throw new PendingException();
	}

	@When("^login using below credentials$")
	public void login_using_below_credentials(DataTable dt) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
			
	    // For automatic transformation, change DataTable to one of
	    
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    	List<Map<String,String>> credential = dt.asMaps(String.class, String.class);
	    			for(int i=0; i < credential.size(); i++) {
	    				System.out.println(credential.get(i).get("useranme")+"\t"+credential.get(i).get("password"));
	    			}
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
		//throw new PendingException();
	
	}
	@Then("User must be in home page")
	public void user_must_be_in_home_page() throws Throwable{
		System.out.println("Logged in !!");
	}
	
	
}
