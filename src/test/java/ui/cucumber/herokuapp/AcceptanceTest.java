package ui.cucumber.herokuapp;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/herokuapp/", tags = { "@Login" }, glue = { "ui.cucumber.herokuapp.step" })
public class AcceptanceTest {
}
