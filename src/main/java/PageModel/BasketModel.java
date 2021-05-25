package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketModel extends BaseModel {

    private By btnPassage = By.cssSelector("nav > a:nth-child(1)");
    private By btnIconPassage = By.className("o-p-header__logo");
    private By btnBasket = By.className("o-p-header__my-basket");
    private By messageBasket = By.cssSelector("div.m-grid.m-t-100.p-t-20 > div > div > h3");

    public BasketModel(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickPassage(){
        clickElement(btnPassage);
    }

    public boolean checkIfPassagePage(){
        return displayed(btnIconPassage);
    }

    public void clickBasket(){
        clickElement(btnBasket);
    }

    public String getTextMessageBasket(){
        return getText(messageBasket);
    }
}
