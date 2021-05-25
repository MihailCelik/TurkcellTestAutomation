package Tests;

import PageModel.BasketModel;
import PageModel.HomeModel;
import Utilities.Log4j;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasketTest extends BaseTest {

    @Test
    public void basketProductControl() {
        HomeModel homeModel = new HomeModel(webDriver);
        BasketModel basketModel = new BasketModel(webDriver);
        Log4j.startLog("Test  is Starting");
        homeModel.userVisitSite();
        homeModel.waitOfLoadPage();
        Log4j.info("Opening Page : " + "https://www.turkcell.com.tr/");
        homeModel.checkIfPopupMessage();
        basketModel.clickPassage();
        Assert.assertTrue(basketModel.checkIfPassagePage());
        Log4j.info("Opening Page : " + "Pasaj");
        basketModel.clickBasket();
        Assert.assertTrue(basketModel.getTextMessageBasket().contains("Sepetinizde ürün bulunmamaktadır."));
        Log4j.info("Basket Product Control : " + "Sepetinizde ürün bulunmamaktadır");
    }
}
