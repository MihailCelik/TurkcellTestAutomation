package Tests;

import PageModel.HomeModel;
import PageModel.ProductModel;
import org.testng.annotations.Test;
import Utilities.Log4j;
import org.testng.Assert;

public class SearchTest extends BaseTest {

    @Test
    public void searchProduct() {
        HomeModel homeModel = new HomeModel(webDriver);
        ProductModel productModel = new ProductModel(webDriver);
        Log4j.startLog("Test  is Starting");
        homeModel.userVisitSite();
        homeModel.waitOfLoadPage();
        Log4j.info("Opening Page : " + "https://www.turkcell.com.tr/");
        homeModel.checkIfPopupMessage();
        productModel.clickSearch();
        productModel.setTextSearch();
        Log4j.info("Product Name :" + "Mobil");
        productModel.clickSearchProduct();
        Assert.assertTrue(productModel.checkIfSearchResult());
        productModel.clickTabDevices();
        Log4j.info("Product Tab Is Opened :" + "Cihazlar");
        Assert.assertTrue(productModel.getTextDeviceName().contains("Mobil"));
        Log4j.info("Products Match :" + "Listelenen urunun basligi ile search edilen eslesiyor");
    }
}
