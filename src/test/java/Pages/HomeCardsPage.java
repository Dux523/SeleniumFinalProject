package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomeCardsPage {
    WebDriver driver;
    WebDriverWait wdWait;

    public void scrollIntoView(WebElement webE){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", webE);
    }


    WebElement element;
    WebElement bookstore;



    public HomeCardsPage(WebDriver driver, WebDriverWait wdWait) {
        this.driver = driver;
        this.wdWait = wdWait;
    }
    public List<WebElement> getElement(){
        return driver.findElements(By.className("card-body"));
    }


    public void clickOnElement(){
        for (int i = 0; i<getElement().size(); i++){
            scrollIntoView(getElement().get(i));
            if (getElement().get(i).getText().equals("Elements")){
                getElement().get(i).click();
                break;
            }
        }
    }
    public WebElement getBookstore() {
        return driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[6]/div/div[2]"));
    }
    public void clickOnBookstore(){
        getBookstore().click();
    }
}