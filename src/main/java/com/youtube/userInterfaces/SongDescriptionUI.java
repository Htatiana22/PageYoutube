package com.youtube.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SongDescriptionUI {
    public static final Target LBL_NAME_OF_THE_SONG = Target
            .the("Name of the song").located(By.xpath("//h1[@class='style-scope ytd-watch-metadata']"));
}
