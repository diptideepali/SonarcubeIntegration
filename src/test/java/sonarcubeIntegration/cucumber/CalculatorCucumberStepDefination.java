package sonarcubeIntegration.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sonarcubeIntegration.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorCucumberStepDefination {

        private Calculator calculator;
        private int result;


        @Given("I have a calculator")
        public void iHaveACalculator() {
        calculator = new Calculator();
    }

        @When("I add {int} and {int}")
        public void iAddAnd(int a, int b) {
        result = calculator.add(a, b);
    }

        @When("I multiply {int} and {int}")
        public void iMultiplyAnd(int a, int b) {
        result = calculator.multi(a, b);
        // assert false : "Intentional failure";
    }

        @When("I subtract {int} and {int}")
        public void iSubtractAnd(int a, int b) {
        result = calculator.sub(a, b);
    }

        @Then("the result should be {int}")
        public void theResultShouldBe(int expected) {
        assertEquals(expected, result);
    }

}
