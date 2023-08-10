package com.youtube.tasks;

import com.youtube.utils.DataExcel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.youtube.userInterfaces.HomepageUI.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomepageTask implements Task {
    ArrayList<Map<String, String>> data= new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            data = DataExcel.leerDatosDeHojaDeExcel("src/test/resources/data/DataToSearch.xlsx", "SearchSong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(data.get(0).get("SONG")).into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }
    public static HomepageTask search(){
        return instrumented(HomepageTask.class);
    }
}
