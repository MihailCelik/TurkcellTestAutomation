package PageModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class BaseModel {

    protected WebDriver webDriver;

    public BaseModel(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public WebElement findElement(By byElement){
        waitForLoad(byElement);
        return webDriver.findElement(byElement);
    }

    public void clickElement(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 1000);
        waitForLoad(byElement);
        wait.until(ExpectedConditions.elementToBeClickable(byElement));
        findElement(byElement).click();
    }

    public void sendKeys(By byElement, String text) {
        findElement(byElement).sendKeys(text);
    }

    public String getText(By byElement) {
        return findElement(byElement).getText();
    }

    public void waitForLoad(By byElement) {
        WebDriverWait wait = new WebDriverWait(webDriver, 1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(byElement));
    }

    public boolean displayed(By byElement) {
        return webDriver.findElement(byElement).isDisplayed();
    }

    public List<WebElement> findElements(By byElement){
        waitForLoad(byElement);
        return webDriver.findElements(byElement);
    }

    public void sleep(int second) {
        try {
            Thread.sleep(second);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public String getAttribute(By byElement,String value){
        return findElement(byElement).getAttribute(value);
    }

    public void scrollToElement(String scroll) {

        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("window.scrollBy(0," + scroll + ")");
    }
}
