package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeModel extends BaseModel {

    private By hdLogo = By.className("o-header__logo");
    private By popupMessage = By.cssSelector("body > div.hypeNewModal > div");

    public HomeModel(WebDriver webDriver) {
        super(webDriver);
    }

    public void userVisitSite(){
        webDriver.get("https://www.turkcell.com.tr/");
    }

    public void waitOfLoadPage(){
        waitForLoad(hdLogo);
    }

    public void checkIfPopupMessage(){
        if(displayed(popupMessage)== true){
            clickElement(popupMessage);
        }
    }
}
