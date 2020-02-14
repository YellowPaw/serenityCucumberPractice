package pages.herokuapp;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;


@DefaultUrl("http://the-internet.herokuapp.com/")
public class LoginPage extends PageObject {

//    @FindBy(name = "email")
//    private WebElementFacade emailField;
//
//    @FindBy(name = "password")
//    private WebElementFacade passwordField;

    @FindBy(css = "button[data-track_event-action='Login']")
    private WebElementFacade basicAuthLink;

    @FindBy(xpath = "//form[@method='post'][not(@name)]//div[@class='form-errors clearfix']")
    private WebElementFacade errorMessageElement;


    public void clickLink(String link) {
        switch (link)
        {
            case "A/B Testing" :
                clickLinkByHref("abtest");
                break; // break is optional
            case "Add/Remove Elements" :
                clickLinkByHref("add_remove_elements");
                break; // break is optional
            case "Basic Auth" :
                clickLinkByHref("basic_auth");
                break; // break is optional
            case "Broken Images" :
                clickLinkByHref("broken_images");
                break; // break is optional
            case "Challenging DOM" :
                clickLinkByHref("chellenging_dom");
                break; // break is optional
            case "Checkboxes" :
                clickLinkByHref("checkboxes");
                break; // break is optional
            case "Context Menu" :
                clickLinkByHref("context_menu");
                break; // break is optional
            case "Digest Authentication" :
                clickLinkByHref("digest_auth");
                break; // break is optional
            case "Disappearing Elements" :
                clickLinkByHref("disappearing_elements");
                break; // break is optional
            case "Drag and Drop" :
                clickLinkByHref("drag_and_drop");
                break; // break is optional
            case "Dropdown" :
                clickLinkByHref("dropdown");
                break; // break is optional
            case "Dynamic Content" :
                clickLinkByHref("dynamic_content");
                break; // break is optional
            case "Dynamic Controls" :
                clickLinkByHref("dynamic_controls");
                break; // break is optional
            case "Dynamic Loading" :
                clickLinkByHref("dynamic_loading");
                break; // break is optional
            case "Exit Intent" :
                clickLinkByHref("exit_intent");
                break; // break is optional
            case "File Download" :
                clickLinkByHref("download");
                break; // break is optional
            case "File Upload" :
                clickLinkByHref("upload");
                break; // break is optional
            case "Floating Menu" :
                clickLinkByHref("floating_menu");
                break; // break is optional
            case "Forgot Password" :
                clickLinkByHref("forgot_password");
                break; // break is optional
            case "Form Authentication" :
                clickLinkByHref("login");
                break; // break is optional
            case "Frames" :
                clickLinkByHref("frames");
                break; // break is optional
            case "Geolocation" :
                clickLinkByHref("geolocation");
                break; // break is optional
            case "Horizontal Slider" :
                clickLinkByHref("horizontal_slider");
                break; // break is optional
            case "Hovers" :
                clickLinkByHref("hovers");
                break; // break is optional
            case "Infinite Scroll" :
                clickLinkByHref("infinite_scroll");
                break; // break is optional
            case "Inputs" :
                clickLinkByHref("inputs");
                break; // break is optional
            case "JQuery UI Menus" :
                clickLinkByHref("jqueryui/menu");
                break; // break is optional
            case "JavaScript Alerts" :
                clickLinkByHref("javascript_alerts");
                break; // break is optional
            case "JavaScript onload event error" :
                clickLinkByHref("javascript_error");
                break; // break is optional
            case "Key Presses" :
                clickLinkByHref("key_presses");
                break; // break is optional
            case "Large & Deep DOM" :
                clickLinkByHref("large");
                break; // break is optional
            case "Multiple Windows" :
                clickLinkByHref("windows");
                break; // break is optional
            case "Nested Frames" :
                clickLinkByHref("nested_frames");
                break; // break is optional
            case "Notification Messages" :
                clickLinkByHref("notification_message");
                break; // break is optional
            case "Redirect Link" :
                clickLinkByHref("redirector");
                break; // break is optional
            case "Secure File Download" :
                clickLinkByHref("download_secure");
                break; // break is optional
            case "Shadow DOM" :
                clickLinkByHref("shadowdom");
                break; // break is optional
            case "Shifting Content" :
                clickLinkByHref("shifting_content");
                break; // break is optional
            case "Slow Resources" :
                clickLinkByHref("slow");
                break; // break is optional
            case "Sortable Data Tables" :
                clickLinkByHref("tables");
                break; // break is optional
            case "Status Codes" :
                clickLinkByHref("status_codes");
                break; // break is optional
            case "Typos" :
                clickLinkByHref("typos");
                break; // break is optional
            case "WYSIWYG Editor" :
                clickLinkByHref("tinymce");
                break; // break is optional


            default :
                System.out.println("Could not find link");
        }
    }

    public String getMessageError(){
        waitFor(errorMessageElement);
        return errorMessageElement.getTextContent();
    }

    public void clickLinkByHref(String href) {
        List<WebElement> anchors = getDriver().findElements(By.tagName("a"));
        Iterator<WebElement> i = anchors.iterator();

        while(i.hasNext()) {
            WebElement anchor = i.next();
            if(anchor.getAttribute("href").contains(href)) {
                anchor.click();
                break;
            }
        }
    }

}
