package steps;

import cucumber.api.java.en.*;
import pages.GooglePage;

public class PurebaGoogle {

    GooglePage google = new GooglePage();

    @Given("^navego a google$")
    public void navigateToGoogle(){
        google.navigateToGoogle();
    }

    @When("^busco algo$")
    public void enterBuscar(){

    }

    @And("^Start to type your And step here$")
    public void clickBuscar(){

    }

    @Then("^obtengo resultados$")
    public void validadateResult(){

    }

}