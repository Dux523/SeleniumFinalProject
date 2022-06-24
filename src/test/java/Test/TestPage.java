package Test;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestPage extends BaseTest {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.navigate().to(excelReader.getStringData("URLs",1,0));
        driver.manage().window().maximize();


    }
    @Test
    public void test1(){
        homeCardsPage.clickOnElement();
        elementsTextBox.clickOnTextBoxElements();
        elementsTextBox.clickOnTextBox();
        elementsTextBox.typeTextOnNameTextBox(excelReader.getStringData("ValidCredentials",1,0));
        elementsTextBox.clickOnEmailTextBox();
        elementsTextBox.typeTextOnEmailTextBox(excelReader.getStringData("ValidCredentials",1,1));
        elementsTextBox.clickOnCurrentAdressTextBox();
        elementsTextBox.typeTextOnCurrentAdress(excelReader.getStringData("ValidCredentials",1,2));
        elementsTextBox.clickOnPemanentAdressTextBox();
        elementsTextBox.typeTextOnPermanentAdressTextBox(excelReader.getStringData("ValidCredentials",1,3));
        elementsTextBox.getSubmitButton().click();
        Assert.assertEquals(elementsTextBox.assertTextName(),excelReader.getStringData("ValidCredentials",1,0));
        Assert.assertEquals(elementsTextBox.assertTextEmail(),excelReader.getStringData("ValidCredentials",1,1));
        Assert.assertEquals(elementsTextBox.assertTextCurrentAddress(),excelReader.getStringData("ValidCredentials",1,2));
        Assert.assertEquals(elementsTextBox.assertTextPermanentAddress(),excelReader.getStringData("ValidCredentials",1,3));

    }
    @Test
    public void test2() throws InterruptedException {
        homeCardsPage.clickOnElement();
        elementsCheckBox.clickOnCheckBoxElements();
        elementsCheckBox.clickOnToggleHome();
        elementsCheckBox.checkHomeBox();
        elementsCheckBox.clickOnCollapseAllButton();
        elementsCheckBox.clickOnExpandAllButton();
        elementsCheckBox.checkHomeBox();
        elementsCheckBox.checkDesktopBox();
        elementsCheckBox.checkDesktopBox();
        elementsCheckBox.checkNotesBox();
        elementsCheckBox.checkNotesBox();
        elementsCheckBox.checkCommandsBox();
        elementsCheckBox.checkCommandsBox();
        elementsCheckBox.checkDocumentsBox();
        elementsCheckBox.checkDocumentsBox();
        elementsCheckBox.checkWorkSpaceBox();
        elementsCheckBox.checkWorkSpaceBox();
        elementsCheckBox.checkReacteBox();
        elementsCheckBox.checkReacteBox();
        elementsCheckBox.checkAngularBox();
        elementsCheckBox.checkAngularBox();
        elementsCheckBox.checkVeuBox();
        elementsCheckBox.checkVeuBox();
        elementsCheckBox.checkOfficeBox();
        elementsCheckBox.checkOfficeBox();
        elementsCheckBox.checkPublicBox();
        elementsCheckBox.checkPublicBox();
        elementsCheckBox.checkPrivateBox();
        elementsCheckBox.checkPrivateBox();
        elementsCheckBox.checkClassifiedBox();
        elementsCheckBox.checkClassifiedBox();
        scrollInto(elementsCheckBox.getCheckBoxElements());
        elementsCheckBox.checkGeneralBox();
        elementsCheckBox.checkGeneralBox();
        elementsCheckBox.checkDownloadsBox();
        elementsCheckBox.checkDownloadsBox();
        elementsCheckBox.checkWordBox();
        elementsCheckBox.checkWordBox();
        elementsCheckBox.checkExcelBox();
        elementsCheckBox.checkExcelBox();
        elementsCheckBox.checkAll();
        //Asserting checkbox by how many box are checked, unchecked or half checked
        Assert.assertEquals(elementsCheckBox.checkAssertion(),6);
        Assert.assertEquals(elementsCheckBox.uncheckAssertion(),10);
        Assert.assertEquals(elementsCheckBox.halfCheckAssertion(),1);

        elementsCheckBox.checkWorkSpaceBox();
        elementsCheckBox.checkDesktopBox();
        elementsCheckBox.checkGeneralBox();
        //Asserting checkbox after checking on WorkSpace box
        Assert.assertEquals(elementsCheckBox.checkAssertion(),8);
        Assert.assertEquals(elementsCheckBox.uncheckAssertion(),6);
        Assert.assertEquals(elementsCheckBox.halfCheckAssertion(),3);

        //Using try and catch to check that OfficeBox is not displayed when we collapse all folders
        elementsCheckBox.clickOnCollapseAllButton();

        boolean check = false;
        try{
            check = elementsCheckBox.getOfficeBoxx().isDisplayed();
        }catch (Exception e){}
        Assert.assertFalse(check);

        //Assert words that are showing what you have selected
        Assert.assertEquals(elementsCheckBox.getResult(),elementsCheckBox.getResultsWhenSelectAll());

    }
}
