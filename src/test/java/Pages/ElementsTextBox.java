package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsTextBox {
    WebDriver driver;
    WebDriverWait wdwait;
    WebElement textBoxElements;
    WebElement fullNameTextBox;
    WebElement emailTextBox;
    WebElement currentAdress;
    WebElement permanentAdress;
    WebElement submitButton;
    WebElement assertName;
    WebElement assertEmail;
    WebElement assertCurrentAddress;
    WebElement assertPermanentAddress;
    public ElementsTextBox(WebDriver driver, WebDriverWait wdwait) {
        this.driver = driver;
        this.wdwait = wdwait;
    }
    public WebElement getTextBoxElements() {
        return driver.findElement(By.xpath("//*[@id=\"item-0\"]"));
    }

    public WebElement getFullNameTextBox() {
        return driver.findElement(By.id("userName"));
    }
    public WebElement getEmailTextBox() {
        return driver.findElement(By.id("userEmail"));
    }
    public WebElement getCurrentAdress() {
        return driver.findElement(By.id("currentAddress"));
    }
    public WebElement getPermanentAdress() {
        return driver.findElement(By.id("permanentAddress"));
    }
    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }
    public WebElement getAssertName() {
        return driver.findElement(By.id("name"));
    }
    public WebElement getAssertEmail() {
        return driver.findElement(By.id("email"));
    }
    public WebElement getAssertCurrentAddress() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[3]"));
    }

    public WebElement getAssertPermanentAddress() {
        return driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/p[4]"));
    }

    //-----------------------------------------------------------------------------
    public void clickOnTextBoxElements(){
        getTextBoxElements().click();
    }
    public void clickOnTextBox(){
        getFullNameTextBox().click();
    }
    public void typeTextOnNameTextBox(String name){
        getFullNameTextBox().sendKeys(name);
    }
    public void clickOnEmailTextBox(){
        getEmailTextBox().click();
    }
    public void typeTextOnEmailTextBox(String mail){
        getEmailTextBox().sendKeys(mail);
    }
    public void clickOnCurrentAdressTextBox(){
        getCurrentAdress().click();
    }
    public void typeTextOnCurrentAdress(String adress){
        getCurrentAdress().sendKeys(adress);
    }
    public void clickOnPemanentAdressTextBox(){
        getPermanentAdress().click();
    }
    public void typeTextOnPermanentAdressTextBox(String adress){
        getPermanentAdress().sendKeys(adress);
    }
    public void clickOnTheSubmitButton(){
        getSubmitButton().click();
    }
    public String assertTextName(){
       return getAssertName().getText().split("Name:")[1];
    }
    public String assertTextEmail(){
        return getAssertEmail().getText().split("Email:")[1];
    }
    public String assertTextCurrentAddress(){
        return getAssertCurrentAddress().getText().split("Current Address :")[1];
    }
    public String assertTextPermanentAddress(){
        return getAssertPermanentAddress().getText().split("Permananet Address :")[1];
    }
}
