package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.AddToCart;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    AddToCart addToCart = new AddToCart();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

        addToCart.clickOnComputerTab();
        addToCart.clickOnDesktopTab();
        addToCart.setSelectAtoZCat("Name: A to Z");
        addToCart.clickOnAddToCartButton();
        //System.out.println(addToCart.getActualTextOfBuildComputer());
        Assert.assertEquals(addToCart.getActualTextOfBuildComputer(), "Build your own computer", "Not verified Build your own Computer");
        Thread.sleep(4000);
        addToCart.setSelectProcessorE2200("2.2 GHz Intel Pentium Dual-Core E2200");
        Thread.sleep(1000);
        addToCart.setSelectRAM8GB("8GB [+$60.00]");
        Thread.sleep(1000);
        addToCart.clickOnHDD400();
        Thread.sleep(1000);
        addToCart.clickOnOSVista();
        Thread.sleep(1000);
        addToCart.setCheckedTotalCommander();
        Thread.sleep(1000);
        //System.out.println(addToCart.getActualTextTotalAmount());
        Assert.assertEquals(addToCart.getActualTextTotalAmount(), "$1,475.00", "Not verified The Price");

        addToCart.clickOnAddToCartComputer();
        Thread.sleep(3000);
        Assert.assertEquals(addToCart.verifyProductAddedSuccessfully(), "The product has been added to your shopping cart", "The product not added successfully");
        addToCart.closeNotificationWindow();
        Thread.sleep(2000);
        addToCart.mouseHoverAndClickOnGotoCart();
        Thread.sleep(2000);
        Assert.assertEquals(addToCart.verifyTextShoppingCart(),"Shopping cart","Shopping cart not displayed");
        Thread.sleep(3000);
        addToCart.changeQTY2ClickOnUpdateCart();
        Thread.sleep(3000);
        Assert.assertEquals(addToCart.verifyPriceAfterQTYUpdate(),"$2,950.00","Price is not updated");
        Thread.sleep(2000);
        addToCart.clickOnAgreeWithTermCheckbox();
        addToCart.clickOnCheckOutTab();
        Thread.sleep(3000);
        Assert.assertEquals(addToCart.verifySignInText(),"Welcome, Please Sign In!","Not display Sign In text");
        addToCart.clickOnCheckOutAsGuest();
        addToCart.enterFirstName("Patrick");
        addToCart.enterLastName("Vyas");
        addToCart.enterEmail("biigate16788@gmail.com");
        addToCart.selectCountry("India");
        addToCart.enterCity("Nadiad");
        addToCart.enterAddress("Pij Road");
        addToCart.enterZipCode("387002");
        addToCart.enterPhoneNumber("8866300553");
        addToCart.clickOnRegister();
        addToCart.clickOnRadioBtnNextDaYAir();
        addToCart.clickOnContinueBtn();
        Thread.sleep(3000);
        addToCart.selectRadioBtnCreditCard();
        addToCart.selectMasterCardFromDropDownList("Master card");
        addToCart.enterCardHolderName("Pankaj Vyas");
        addToCart.enterCardNumber("5555555555554444");
        addToCart.selectExpMonth("11");
        addToCart.selectExpYear("2024");
        addToCart.enterCVV("199");
        addToCart.clickOnContinueAfterCardDetailEntered();
        Thread.sleep(2000);
        Assert.assertEquals(addToCart.getTextPaymentMethod(),"Credit Card","Payment Method not displayed");
        Thread.sleep(2000);
        Assert.assertEquals(addToCart.getTextShippingMethod(),"(Next Day Air)","Shipping method not displayed");
        Thread.sleep(2000);
        Assert.assertEquals(addToCart.getTextFinalTotalPrice(),"$2,950.00","Final Total Price is not displayed");
        Thread.sleep(2000);
        addToCart.clickOnConfirmBtn();
        Thread.sleep(2000);
        Assert.assertEquals(addToCart.verifyTextThankYouMessage(),"Thank you","Thank you Message not dispalyed");
        Thread.sleep(3000);
        Assert.assertEquals(addToCart.verifyOrderProcessedSuccessfully(),"Your order has been successfully processed!","Not processed successfully");
        Thread.sleep(2000);
        addToCart.clickOnContinueButton();
        Thread.sleep(2000);
        Assert.assertEquals(addToCart.verifyWelcomeStoreMessage(),"Welcome to our store","welcome store msg not displayed");
    }
}
