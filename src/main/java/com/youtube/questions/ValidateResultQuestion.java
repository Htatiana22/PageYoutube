package com.youtube.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.youtube.userInterfaces.SongDescriptionUI.LBL_NAME_OF_THE_SONG;
public class ValidateResultQuestion implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade nameSong = LBL_NAME_OF_THE_SONG.resolveFor(actor);
        return nameSong.isDisplayed();
    }
    public static ValidateResultQuestion nameSong (){
        return new ValidateResultQuestion();
    }
}
