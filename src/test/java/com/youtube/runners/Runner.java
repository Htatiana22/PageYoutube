package com.youtube.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/searchSong.feature",
        tags = "@scenario1",
        glue = "com.youtube.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class Runner {
}
