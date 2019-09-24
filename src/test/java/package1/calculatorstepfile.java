package package1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	public class calculatorstepfile {
		@Given("I enter 50 in the calculator")
		public void given(){
			System.out.println(" I enter 50 in the calculator");
		}
		@Given("I enter 30 in the calculator")
		public void given1(){
			System.out.println(" I enter 30 in the calculator");
		}
	    @And("I press add")
	    public void and1() {
	    	System.out.println("I press add");
	    }
	    @And ("I have entered 20 in calculator")
	    public void and() {
	    	System.out.println(" i have entered 20 in calculator");
	    }
	    @And ("I have entered 10 in calculator")
	    public void and2() {
	    	System.out.println(" i have entered 10 in calculator");
	    }
	    @When ("I press equal symbol")
	    public void when() {
	    	System.out.println("I press equal symbol");
	    }
	    @Then ("the result should be 70 on screen")
	    public void then() {
	    	System.out.println("the result should be 70 on screen");
	    }
	    @Then ("the result should be 40 on screen")
	    public void then1() {
	    	System.out.println("the result should be 40 on screen");
	    }
	}
