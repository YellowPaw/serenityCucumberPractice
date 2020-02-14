package ui.cucumber.herokuapp.step;

import common.BaseTest;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class LoginPage extends BaseTest {

    @Steps
    private pages.herokuapp.LoginPage loginPage_pageobject;


    @cucumber.api.java.en.Given("^Navigate to herokuapp login site$")
    public void navigateToHerokuappSite() {

        loginPage_pageobject.open();

    }

    @Then("^User clicks on '(.*)'$")
    public void loginWithEmailAndPassword(String link) {

        loginPage_pageobject.clickLink(link);

    }

    @Then("^Should navigate to home page site$")
    public void shouldNavigateToHomePageSite() {
        WebDriverWait wait = new WebDriverWait(getDriver(),2);
        wait.until(ExpectedConditions.urlContains("welcome"));
        softAssertImpl.assertAll();

    }

    @Then("^Should prompt with '(.*)'$")
    public void shouldPromptWithErrormessage(String errorMessage) {

        softAssertImpl.assertThat("Verify message error",loginPage_pageobject.getMessageError().contains(errorMessage),true);
        softAssertImpl.assertAll();

    }
}
