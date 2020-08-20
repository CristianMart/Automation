package co.com.test.stepdefinitions;

import co.com.test.model.ExampleData;
import co.com.test.model.ExampleModel;
import co.com.test.questions.VerifyWith;
import co.com.test.tasks.ImplementationTask;
import co.com.test.tasks.OpenTheBrowserExampleTask;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ExampleStepDefinitions {

    @Given("^That User wants to take an action$")
    public void thatUserWantsToTakeAnAction(List<ExampleData> dataSet) {
        OnStage.theActorCalled("Cristian").wasAbleTo(OpenTheBrowserExampleTask.exampleUserInterface(dataSet));
    }

    @When("^he Enters the data to take the action$")
    public void heEntersTheDataToTakeTheAction(List<ExampleModel> dataSet) {
        OnStage.theActorInTheSpotlight().attemptsTo(ImplementationTask.ImplementationTask(dataSet));

    }

    @Then("^he verifies the message (.*)$")
    public void heVerifiesTheMessage(String question) {
        OnStage.theActorInTheSpotlight().should(seeThat(VerifyWith.the(question)));

    }



}
