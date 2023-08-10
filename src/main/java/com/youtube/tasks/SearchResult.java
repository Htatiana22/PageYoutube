package com.youtube.tasks;

import com.youtube.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchResult implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ClickRandom.select()
        );
    }
    public static Performable selectSong (){
        return instrumented (SearchResult.class);
    }
}
