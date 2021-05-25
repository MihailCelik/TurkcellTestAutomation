package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductModel extends BaseModel {

    private By btnSearch = By.className("icon-search");
    private By txtSearch = By.cssSelector("div.m-grid > div > div > form > div > input[type=text]");
    private By btnSearchProduct = By.cssSelector("div.m-grid > div > div > form > div > button > i");
    private By searchResult = By.id("search-results");
    private By tabDevices = By.cssSelector("div.m-tab__items > div > div.m-slider__swiper.swiper-container.swiper-container-initialized.swiper-container-horizontal > div > div.swiper-slide.swiper-slide-next");
    private By deviceName = By.cssSelector("#tabDevices > div:nth-child(2) > a > div.m-p-pc__body > span");

    public ProductModel(WebDriver webDriver) { super(webDriver); }

    public void clickSearch(){
        clickElement(btnSearch);
    }

    public void setTextSearch(){
        sendKeys(txtSearch,"Mobil");
    }

    public void clickSearchProduct(){
        clickElement(btnSearchProduct);
    }

    public boolean checkIfSearchResult(){
        return displayed(searchResult);
    }

    public void clickTabDevices(){
        clickElement(tabDevices);
    }

    public String getTextDeviceName(){
        return getText(deviceName);
    }
}
