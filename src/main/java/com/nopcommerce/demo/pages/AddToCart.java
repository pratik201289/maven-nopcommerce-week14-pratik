package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class AddToCart extends Utility {

    By computerTabClick = By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
    By desktopTabClick = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");
    By selectAtoZCat = By.xpath("//select[@id='products-orderby']");
    By clickAddToCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");
    By actualTextVerifyProduct = By.xpath("//h1[contains(text(),'Build your own computer')]");
    //method explicit wait from utility class
    By selectProcessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By selectHDD = By.xpath("//input[@id='product_attribute_3_7']");
    By selectOS = By.xpath("//input[@id='product_attribute_4_9']");
    By CheckedTotalCommander = By.xpath("//label[text()='Total Commander [+$5.00]']");
    By totalAmountActualTextVerify = By.xpath("//span[@id='price-value-1']");

    By clickOnAddToCartComputer = By.xpath("//button[@id='add-to-cart-button-1']");

    By verifyTextProductAdded = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");

    By closeNotification = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");

    By mouseHoverCart = By.xpath("//span[contains(text(),'Shopping cart')]");

    By verifyTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping cart')]");

    By QTY = By.xpath("//td[@class='quantity']/child::input");
    By clickOnUpdateCart = By.xpath("//button[@id='updatecart']");
    By verifyPriceAfterUpdateQTY = By.xpath("//tbody/tr[4]/td[2]/span[1]");

    By clickCheckboxAgree =By.xpath("//input[@id='termsofservice']");

    By clickCheckoutBtn= By.xpath("//button[@id='checkout']");

    By verifyWelcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By clickOnCheckoutGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");

    By firstName= By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastName= By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailAddress=By.xpath("//input[@id='BillingNewAddress_Email']");
    By Country= By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By City=By.xpath("//input[@id='BillingNewAddress_City']");
    By address1=By.xpath("  //input[@id='BillingNewAddress_Address1']");
    By zipCode=By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneNumber=By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By clickRegister= By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]");

    By clickOnNextDayRadio =By.xpath("//input[@id='shippingoption_1']");

    By clickContinueBtn=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]");

    By clickRadioCC =By.xpath("//input[@id='paymentmethod_1']");
    By clickRadioCCSe= By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");

    By selectMasterCard= By.xpath("//select[@id='CreditCardType']");

    By cardHolderName =By.xpath("//input[@id='CardholderName']");
    By cardNumber= By.xpath("//input[@id='CardNumber']");
    By selectMonth= By.xpath("//select[@id='ExpireMonth']");
    By selectYear =By.xpath("//select[@id='ExpireYear']");
    By cardCode=By.xpath("//input[@id='CardCode']");

    By clickContinueBtnAfterCardDetail=By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]");

    By verifyPaymentMethodTextCreditCard =By.xpath("//span[contains(text(),'Credit Card')]");

    By verifyShippingMethodText =By.xpath("//span[contains(text(),'(Next Day Air)')]");

    By verifyFinalTotalPrice = By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]");

    By clickConfirm = By.xpath("//button[contains(text(),'Confirm')]");

    By verifyTextThankYou =By.xpath("//h1[contains(text(),'Thank you')]");

    By verifyOrderSuccessfullyText= By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");

    By clickContinueAfterOrderPlaced = By.xpath("//button[contains(text(),'Continue')]");

    By verifyWelcomeOurStoreText= By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public void clickOnComputerTab() {
        clickOnElement(computerTabClick);
    }

    public void clickOnDesktopTab() {
        clickOnElement(desktopTabClick);
    }

    public void setSelectAtoZCat(String str) {
        selectByVisibleTextFromDropDown(selectAtoZCat, str);
    }

    public void clickOnAddToCartButton() {

        try {
            clickOnElement(clickAddToCart);
        } catch (StaleElementReferenceException e) {
            clickOnElement(clickAddToCart);
        }

    }

    public String getActualTextOfBuildComputer() {
        return getTextFromElement(actualTextVerifyProduct);
    }

    public void setSelectProcessorE2200(String processor) {
        selectByVisibleTextFromDropDown(selectProcessor, processor);
    }

    public void setSelectRAM8GB(String ram) {
        selectByVisibleTextFromDropDown(selectRam, ram);
    }

    public void clickOnHDD400() {
        clickOnElement(selectHDD);
    }

    public void clickOnOSVista() {
        clickOnElement(selectOS);
    }

    public void setCheckedTotalCommander() {
        clickOnElement(CheckedTotalCommander);
    }

    public String getActualTextTotalAmount() {
        return getTextFromElement(totalAmountActualTextVerify);
    }

    public void clickOnAddToCartComputer() {

        clickOnElement(clickOnAddToCartComputer);
    }

    public String verifyProductAddedSuccessfully() {

        return getTextFromElement(verifyTextProductAdded);

    }

    public void closeNotificationWindow() {
        clickOnElement(closeNotification);
    }

    public void mouseHoverAndClickOnGotoCart() {
        mouseHoverToElement(mouseHoverCart);
        WebElement m = driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].click();", m);
    }

    public String verifyTextShoppingCart() {
        return getTextFromElement(verifyTextShoppingCart);
    }

    public void changeQTY2ClickOnUpdateCart() {

        WebElement Quantity = driver.findElement(QTY);
        Quantity.clear();
        Quantity.sendKeys("2");
        clickOnElement(clickOnUpdateCart);

    }
    public String verifyPriceAfterQTYUpdate(){
        return getTextFromElement(verifyPriceAfterUpdateQTY);
    }

    public void clickOnAgreeWithTermCheckbox(){
        clickOnElement(clickCheckboxAgree);
    }
    public void clickOnCheckOutTab(){
        clickOnElement(clickCheckoutBtn);
    }
    public String verifySignInText(){
        return getTextFromElement(verifyWelcomeText);
    }
    public void clickOnCheckOutAsGuest(){
        clickOnElement(clickOnCheckoutGuest);
    }
    public void enterFirstName(String firstname){

        sendTextToElement(firstName,firstname);
    }
    public void enterLastName(String lastname){

        sendTextToElement(lastName,lastname);
    }
    public void enterEmail(String email){
        sendTextToElement(emailAddress,email);
    }
    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(Country,country);
    }
    public void enterCity(String city){
        sendTextToElement(City,city);
    }
    public void enterAddress(String Add){
        sendTextToElement(address1,Add);
    }
    public void enterZipCode(String code){
        sendTextToElement(zipCode,code);
    }
    public void enterPhoneNumber(String phno){
        sendTextToElement(phoneNumber,phno);
    }
    public void clickOnRegister(){
            clickOnElement(clickRegister);
    }
    public void clickOnRadioBtnNextDaYAir(){
        clickOnElement(clickOnNextDayRadio);
    }

    public void clickOnContinueBtn(){
        clickOnElement(clickContinueBtn);
    }
    public void selectRadioBtnCreditCard(){
        clickOnElement(clickRadioCC);
        clickOnElement(clickRadioCCSe);
    }
    public void selectMasterCardFromDropDownList(String cc){
        selectByVisibleTextFromDropDown(selectMasterCard,cc);
    }
    public void enterCardHolderName(String cname){
        sendTextToElement(cardHolderName,cname);
    }
    public void enterCardNumber(String cardnumber){
        sendTextToElement(cardNumber,cardnumber);
    }
    public void selectExpMonth(String month){
        sendTextToElement(selectMonth,month);
    }
    public void selectExpYear(String year){
        sendTextToElement(selectYear,year);
    }
    public void enterCVV(String code){
        sendTextToElement(cardCode,code);
    }
    public void clickOnContinueAfterCardDetailEntered(){
        clickOnElement(clickContinueBtnAfterCardDetail);

    }
    public String getTextPaymentMethod(){

        return getTextFromElement(verifyPaymentMethodTextCreditCard);

    }
    public String getTextShippingMethod(){

        return getTextFromElement(verifyShippingMethodText);

    }
    public String getTextFinalTotalPrice(){

        return getTextFromElement(verifyFinalTotalPrice);

    }
    public void clickOnConfirmBtn(){
        clickOnElement(clickConfirm);
    }
    public String verifyTextThankYouMessage(){

        return getTextFromElement(verifyTextThankYou);

    }
    public String verifyOrderProcessedSuccessfully(){
        return  getTextFromElement(verifyOrderSuccessfullyText);
    }
    public void clickOnContinueButton(){
        clickOnElement(clickContinueAfterOrderPlaced);
    }
    public String verifyWelcomeStoreMessage(){
        return getTextFromElement(verifyWelcomeOurStoreText);
    }













}
