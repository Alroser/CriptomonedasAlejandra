package co.criptomonedas.certification.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/agregar_moneda.feature",
        glue="co.criptomonedas.certification.test",
        snippets= SnippetType.CAMELCASE)

public class monedaRunners {
}
