package stepDefination;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePage_POM;
import pageObjectModel.Queue_POM;
import pageObjectModel.SigninPage_POM;
import utils.LoggerLoad;

public class Queue_SD {
    
	HomePage_POM homePage= new HomePage_POM();
	SigninPage_POM Signinpage =new SigninPage_POM();
	Queue_POM Qpom = new Queue_POM();
	
	
	
    @Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {
    	Qpom.click_signin();
	}

	@When("The user enter valid {string} and {string}")
    public void the_user_enter_valid_and(String string, String string2) {
		 Signinpage.enterUserName(string);   
		 Signinpage.enterPassword(string2);
	      
    	}

	@When("The user click on login button")
    public void the_user_click_on_login_button() {
    
		 Signinpage.loginbtn();
	}

	@Given("User is on Home Page of Dsalgo Portal")
	public void user_is_on_home_page_of_dsalgo_portal() {
		LoggerLoad.info("----------User is on Home Page of Dsalgo Portal------------------------"); 
	}

	@When("User clicks on getstarted button")
	public void user_clicks_on_getstarted_button() {
		LoggerLoad.info("----------User clicks on getstarted button------------------------");
	    Qpom.getstart_queue();
	}

	@Then("User is navigated to Queue data structure")
	public void user_is_navigated_to_queue_data_structure() {
		LoggerLoad.info("----------User is navigated to Queue data structure------------------------");   
	//	String title=Qpom.getTitleofPage();
	//	System.out.println("TITLE FROM SD"+title);
		//assertEquals(title,"NumpyNinja");
	}

	@Given("User is on Queue Data Structure")
	public void user_is_on_queue_data_structure() {
		LoggerLoad.info("----------User is on Queue Data Structure------------------------");
	}

	@When("User clicks on Implementation of Queue in Python")
	public void user_clicks_on_implementation_of_queue_in_python() {
		LoggerLoad.info("----------User clicks on Implementation of Queue in Python------------------------");
	    Qpom.implement_queue();
	}

	@Then("User is directed to Implementation of Queue in Python")
	public void user_is_directed_to_implementation_of_queue_in_python() {
          
	}

	@Given("User is on Implementation of Queue in Python")
	public void user_is_on_implementation_of_queue_in_python() {
		LoggerLoad.info("----------User is on Implementation of Queue in Python------------------------");
	}

	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		LoggerLoad.info("----------User clicks on TRYHERE button------------------------");
		Qpom.try_button();
		
	}
	
	@Then("User is navigated to tryEditor Page")//n
	public void user_is_navigated_to_try_editor_page() {
	    LoggerLoad.info("----------User is navigated to tryEditor Page------------------------");
	}

	@Given("User is on Try Editor Page") //n
	public void user_is_on_try_editor_page() {
	   
	}

	
	@When("User Enters  {string} in the Editor")
	public void user_enters_in_the_editor(String string) {
		LoggerLoad.info("----------User Enters Code in Editor------------------------");
		Qpom.textarea(string);
	}

	@When("clicks on Run Button")
	public void clicks_on_run_button() {
		 
		LoggerLoad.info("----------clicks on Run Button------------------------");
		Qpom.run_but();
	}
	@Then("The User is Presented with a Result")
	public void the_user_is_presented_with_a_result() {
		LoggerLoad.info("----------The User is Presented with a Result------------------------");
	    Qpom.result();
	}
	
	
	
	@Given("User is navigated to Implementation of Queue in python")
	public void user_is_navigated_to_Implementation_of_queue_in_python() {
	    Qpom.call_que_implement();
	    LoggerLoad.info("----------User is navigated to Implementation of Queue in python------------------------");
	}

	@When("User Enters  Invalid python code {string} in the Editor")
	public void user_enters_invalid_python_code_in_the_editor(String string) {
		
		Qpom.textarea(string);
	}

	@Then("The User is Presented with a Error Message for Invalid python code")
	public void the_user_is_presented_with_a_error_message_for_invalid_python_code() {
	   Qpom.cap_alert();
	   
	}
	
	@Given("User  navigated to Implementation of Queue in python")
	public void user_navigated_to_implementation_of_queue_in_python() {
	   
		LoggerLoad.info("----------User is navigated to Implementation of Queue in python------------------------");
		   Qpom.call_que_implement();
	}
	
	@When("User clicks on the Implementation using collections.deque link")
	public void user_clicks_on_the_implementation_using_collections_deque_link() {
		 
		   
		LoggerLoad.info("----------User clicks on the Implementation using collections.deque link------------------------");
		Qpom.call_que_colln();	  
	}

	@Then("User is navigated to Implementation using collections.deque page")
	public void user_is_navigated_to_implementation_using_collections_deque_link() {
		LoggerLoad.info("----------User is navigated to Implementation using collections.deque link-----------------------");
	}
	
    @Given("User is on Implementation using collections.deque page")
    public void user_is_on_implementation_using_collections_deque_page() {
    
    }	

	@When("User clicks on Implementation using array link")
	public void user_clicks_on_implementation_using_array_link() {
	    Qpom.call_qu_imp_array();
	}

	@Then("User is navigated to Implementation using array page")
	public void user_is_navigated_to_implementation_using_array_page() {
		LoggerLoad.info("----------User is navigated to Implementation using array page-----------------------");
	}

	@Given("User is on Implementation using array page")
	public void user_is_on_implementation_using_array_page() {
		LoggerLoad.info("----------User is on Implementation using array page-----------------------");
	}

	@When("User clicks on  Queue Operations link")
	public void user_clicks_on_queue_operations_link() {
		LoggerLoad.info("----------User clicks on  Queue Operations link-----------------------");
	    Qpom.call_array_op();
	}

	@Then("User is navigated to Queue Operations Page")
	public void user_is_navigated_to_queue_operations_page() {
		LoggerLoad.info("----------User is navigated to Queue Operations Page-----------------------"); 
	}

	@Given("User is on QUeue Operations Page")
	public void user_is_on_q_ueue_operations_page() {
		LoggerLoad.info("----------User is on QUeue Operations Page-----------------------"); 
	}	
	
	@When("User clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
		LoggerLoad.info("----------User clicks on Practice Questions link-----------------------");
		Qpom.call_prt_qut();
	    
	}

	@Then("User is navigated to Practice Questions")
	public void user_is_navigated_to_practice_questions() {
	    
	    
	}

	
}

	
	
	
	

