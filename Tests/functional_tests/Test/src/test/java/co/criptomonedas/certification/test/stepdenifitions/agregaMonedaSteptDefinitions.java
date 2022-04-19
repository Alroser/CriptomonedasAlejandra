package co.criptomonedas.certification.test.stepdenifitions;

import com.criptomonedas.certification.test.questions.AgregarMonedaQuestions;
import com.criptomonedas.certification.test.questions.DeleteQuestions;
import com.criptomonedas.certification.test.questions.GestoraQuestions;
import com.criptomonedas.certification.test.questions.PaisesQuestions;
import com.criptomonedas.certification.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class agregaMonedaSteptDefinitions  {
    String name;

    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());

    }
    @Given("^the (.*) enters the cryptocurrency application$")
    public void theUserEntersTheCryptocurrencyApplication(String name) {
        this.name = name;
        theActorCalled(name).attemptsTo(
                OpenUp.thePage()
        );
        theActorCalled(name).attemptsTo(
                Login.onThePage("101","Bogota2024")
        );
    }

    @When("^the (.*) adds a new currency$")
    public void theUserAddsANewCurrency(String name) {
        theActorCalled(name).attemptsTo(agregarMoneda.Addmoneda()
        );
    }

    @Then("^the (.*) visualizes his new currency$")
    public void theUserVisualizesHisNewCurrency(String question ) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AgregarMonedaQuestions.toThe(question)));

    }

    @When("^the (.*) delete a new currency$")
    public void theUserDeleteANewCurrency(String name) {
        theActorCalled(name).attemptsTo(deleteMoneda.DeleteMoneda());
    }


    @Then("^the (.*) visualizes his currency is deleted$")
    public void theUserVisualizesHisCurrencyIsDeleted(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(DeleteQuestions.toThe(question)));
    }

    @When("^the (.*) want view your criptocurrencys in table Paises$")
    public void theUserWantViewYourCriptocurrencysInTablePaises(String name) {
        theActorCalled(name).attemptsTo(ListarMonedaPorPaisesDisponible.listarMoneda());

    }

    @Then("^the (.*) view criptocurrency for paises$")
    public void theUserViewCriptocurrencyForPaises(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PaisesQuestions.toThe(question)));
    }

    @When("^the (.*) want view your criptocurrencys in table Gestoras$")
    public void theUserWantViewYourCriptocurrencysInTableGestoras(String name) {
        theActorCalled(name).attemptsTo(ListarMonedaPorGestoraDisponible.listarMoneda());
    }

    @Then("^the (.*) view criptocurrency for Gestoras$")
    public void theUserViewCriptocurrencyForGestoras(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(GestoraQuestions.toThe(question)));
    }


}
