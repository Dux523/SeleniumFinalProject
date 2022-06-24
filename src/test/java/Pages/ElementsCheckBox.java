package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ElementsCheckBox {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement checkBoxElements;
    WebElement toggleHome;
    WebElement checkBoxHomeUncheck;
    WebElement collapseAllButton;
    WebElement expandAllButton;
    WebElement officeBox;
    WebElement result;
    String resultsWhenSelectAll = "You have selected :\n" +
            "workspace\n" +
            "react\n" +
            "angular\n" +
            "veu\n" +
            "general\n" +
            "downloads\n" +
            "wordFile\n" +
            "excelFile";

    public String getResultsWhenSelectAll() {
        return resultsWhenSelectAll;
    }

    public ElementsCheckBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public void scrollIntoView(WebElement webE){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", webE);
    }

    public WebElement getCheckBoxElements() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span"));
    }
    public WebElement getToggleHome() {
        return driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
    }



    public List<WebElement> getCheckBox() {
       return driver.findElements(By.className("rct-title"));
    }

    public WebElement getCollapseAllButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-collapse-all"));
    }

    public WebElement getExpandAllButton() {
        return driver.findElement(By.cssSelector(".rct-option.rct-option-expand-all"));
    }
    public List<WebElement> getAssertionUncheck(){
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-uncheck"));
    }
    public List<WebElement> getAssertionCheck(){
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-check"));
    }
    public List<WebElement> getAssertionHalfCheck(){
        return driver.findElements(By.cssSelector(".rct-icon.rct-icon-half-check"));
    }
    public WebElement getOfficeBoxx(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Office")){
              return   getCheckBox().get(i);
            }
        }
        return null;
    }

    public String getResult() {
        return driver.findElement(By.id("result")).getText();
    }

    //------------------------------------------------------Methods-------------------------
    public void clickOnCheckBoxElements(){
        getCheckBoxElements().click();
    }
    public void clickOnToggleHome(){
        getToggleHome().click();
    }
    public void checkHomeBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Home")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkDesktopBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Desktop")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkNotesBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Notes")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkCommandsBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Commands")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkDocumentsBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Documents")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkWorkSpaceBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("WorkSpace")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkReacteBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("React")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkAngularBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Angular")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkVeuBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Veu")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkOfficeBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Office")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkPublicBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Public")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkPrivateBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Private")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkClassifiedBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Classified")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkGeneralBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("General")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkDownloadsBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Downloads")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkWordBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Word")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }
    public void checkExcelBox(){
        for (int i = 0; i < getCheckBox().size(); i++){
            if(getCheckBox().get(i).getText().equals("Excel")){
                getCheckBox().get(i).click();
                break;
            }
        }
    }

    public void clickOnCollapseAllButton(){
        getCollapseAllButton().click();
    }
    public void clickOnExpandAllButton(){
        getExpandAllButton().click();
    }

    public void checkAll(){
        for (int i = 0; i < getCheckBox().size(); i++){
            scrollIntoView(getCheckBox().get(i));
            if(getCheckBox().get(i).isDisplayed()){
                getCheckBox().get(i).click();
            }
        }
    }
    public int checkAssertion(){
        int i;
        for(i = 0; i < getAssertionCheck().size(); i++){
        }
        return i;
    }
    public int uncheckAssertion(){
        int i;
        for(i = 0; i < getAssertionUncheck().size(); i++){
        }
        return i;
    }
    public int halfCheckAssertion(){
        int i;
        for(i = 0; i < getAssertionHalfCheck().size(); i++){
        }
        return i;
    }
}
