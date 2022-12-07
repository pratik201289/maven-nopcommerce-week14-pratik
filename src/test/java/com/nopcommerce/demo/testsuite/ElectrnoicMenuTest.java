package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectrnoicMenuTest extends BaseTest {

    ElectronicsMenu electronicsMenu = new ElectronicsMenu();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() throws InterruptedException {

        electronicsMenu.mouseHoverOnElectronicMenu();
        Thread.sleep(2000);
        electronicsMenu.clickOnCellPhone();
        Thread.sleep(1000);
        Assert.assertEquals(electronicsMenu.getActualTextCellPhone(), "Cell phones", "CellPhone Text is not displayed");

        electronicsMenu.clickOnListViewTab();
        Thread.sleep(5000);
        electronicsMenu.clickOnNokiaLumiaProduct();
        Assert.assertEquals(electronicsMenu.verifyNokiaLumiaText(), "Nokia Lumia 1020", "Nokia Lumia 1020 is not displayed");
        Assert.assertEquals(electronicsMenu.verifyPrice(), "$349.00", "$349.00 is not displayed");
        electronicsMenu.changeTheQuantity();
        electronicsMenu.clickOnAddToCartButton();
        Assert.assertEquals(electronicsMenu.verifyProductAddedInShoppingCartText(), "The product has been added to your shopping cart", "Product add in shopping cart is not displayed");
        electronicsMenu.clickOnCloseButton();
        electronicsMenu.hoverOnShoppingCartAndClickOnGoToCartButton();
        Assert.assertEquals(electronicsMenu.verifyShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        Thread.sleep(5000);
        Assert.assertEquals(electronicsMenu.verifyTheTotal(), "$698.00", "$698.00 is not displayed");
        electronicsMenu.clickOnCheckBox();
        electronicsMenu.clickOnCheckoutButton();
        Assert.assertEquals(electronicsMenu.verifyWelcomeMessage(), "Welcome, Please Sign In!", "Welcome message is not displayed");
        electronicsMenu.clickOnRegisterTab();
        Assert.assertEquals(electronicsMenu.verifyRegisterText(), "Register", "Register is not displayed");

        electronicsMenu.mandatoryFields();
        electronicsMenu.clickOnRegistrationButton();
        Assert.assertEquals(electronicsMenu.verifyRegistrationText(), "Your registration completed", "Registration text is not displayed");
        electronicsMenu.clickOnContinueTab();
        Assert.assertEquals(electronicsMenu.checkShoppingCartText(), "Shopping cart", "Shopping cart is not displayed");
        electronicsMenu.clickOnCheckBox();
        electronicsMenu.clickOnCheckoutButton();
        electronicsMenu.fillDeliveryAddressFields();
        electronicsMenu.clickOnContinueButton();
        electronicsMenu.clickOn2ndDayAirButton();
        electronicsMenu.clickContinue();
        electronicsMenu.selectCreditCardRadioButton();
        electronicsMenu.clickCon();
        electronicsMenu.selectVisaFromDropDown();
        Thread.sleep(2000);
        electronicsMenu.fillCardDetails();
        electronicsMenu.clickConBtn();
        Assert.assertEquals(electronicsMenu.verifyCreditCardText(), "Credit Card", "Credit Card is not displayed");
        Assert.assertEquals(electronicsMenu.verify2ndDayAirText(), "2nd Day Air", "2nd Day Air is not displayed");
        Assert.assertEquals(electronicsMenu.verifyFinalTotal(), "$698.00", "$698.00 is not displayed");
        electronicsMenu.clickOnConfirmButton();
        Assert.assertEquals(electronicsMenu.verifyThankYouText(), "Thank you", "Thank you is not displayed");
        Assert.assertEquals(electronicsMenu.verifySuccessfullyProcessedMessage(), "Your order has been successfully processed!", "Successfully processed message is not displayed");
        electronicsMenu.clickOnContinue();
        Assert.assertEquals(electronicsMenu.verifyWelcomeToOurStoreText(), "Welcome to our store", "Welcome to our store is not displayed");
        electronicsMenu.clickOnLogoutLink();



    }


}
