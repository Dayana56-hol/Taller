package co.com.red5g.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features/loguearse.feature",
        glue = "co.com.red5g.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)



public class InicioSesionRunner {
}
