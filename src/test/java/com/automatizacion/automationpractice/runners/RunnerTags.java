package com.automatizacion.automationpractice.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/funcionalidad_automationpractice.feature",
        tags = "@funcionalidad",
        glue = "com.automatizacion.automationpractice.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class RunnerTags {
}
