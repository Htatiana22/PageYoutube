package com.youtube.interactions;

import com.youtube.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.youtube.userInterfaces.HomepageUI.LBL_WRITE_SONG;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandom implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listSongs = LBL_WRITE_SONG.resolveAllFor(actor);
        Random random = new Random();

        int indexRandom = random.nextInt(listSongs.size());

        String song = listSongs.get(indexRandom).getText();

        listSongs.get(indexRandom).click();

        EscrituraExcel.escrituraExcel("src/test/resources/data/DataToSearch.xlsx", song, 1,1);
    }
    public static Performable select(){
        return instrumented(ClickRandom.class);
    }
}
