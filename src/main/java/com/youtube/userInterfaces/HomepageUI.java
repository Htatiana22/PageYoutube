package com.youtube.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomepageUI  {
    public static final Target INPUT_SEARCH = Target
            .the("Search Song").located(By.name("search_query"));

    public static final Target LBL_WRITE_SONG = Target
            .the("Select Song").located(By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-renderer']"));
}
