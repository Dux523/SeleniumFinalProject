package Base;

import Pages.ElementsCheckBox;
import Pages.ElementsTextBox;
import Pages.HomeCardsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public ExcelReader excelReader;
    public HomeCardsPage homeCardsPage;
    public ElementsTextBox elementsTextBox;
    public ElementsCheckBox elementsCheckBox;
    public JavascriptExecutor js;

    public void scrollInto(WebElement e){
        js.executeScript("arguments[0].scrollIntoView(true)",e);
    }

    @BeforeClass
    public void SetUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        excelReader = new ExcelReader("C:\\Users\\Ryzen\\Desktop\\SeleniumExcel\\SeleniumFinalProject.xlsx");
        homeCardsPage = new HomeCardsPage(driver, wdwait);
        elementsTextBox = new ElementsTextBox(driver, wdwait);
        elementsCheckBox = new ElementsCheckBox(driver,wdwait);
        js = (JavascriptExecutor) driver;
    }

    @AfterClass
    public void TearDown(){
      //  driver.close();
      //  driver.quit();
    }
}
