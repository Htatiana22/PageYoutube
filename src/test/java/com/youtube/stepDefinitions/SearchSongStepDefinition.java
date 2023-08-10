package com.youtube.stepDefinitions;

import com.youtube.questions.ValidateResultQuestion;
import com.youtube.tasks.HomepageTask;
import com.youtube.tasks.SearchResult;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchSongStepDefinition {

    @Before
    public void setSage(){
        setTheStage(new OnlineCast());
    }
    @Given("That the user enters the youtube page")
    public void thatTheUserEntersTheYoutubePage() {
        theActorCalled("Herika").wasAbleTo(
        Open.url("https://www.youtube.com/")
                );
    }
    @When("The user clicks on the search bar and types a song")
    public void theUserClicksOnTheSearchBarAndTypesASong() {
        theActorInTheSpotlight().attemptsTo(
                HomepageTask.search(),
                SearchResult.selectSong()

        );
    }
    @Then("The user looks and selects the correct song")
    public void theUserLooksAndSelectsTheCorrectSong() {
        theActorInTheSpotlight().should(
            seeThat(
                    ValidateResultQuestion.nameSong(), Matchers.equalTo(true)
            )
        );
    }
}
