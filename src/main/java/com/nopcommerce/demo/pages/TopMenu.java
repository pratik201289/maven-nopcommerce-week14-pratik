package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class TopMenu extends Utility {
    public void selectMenu(String menu){
        String mainMenu = menu.toLowerCase();
        String expression = "//a[@href ='/" + mainMenu + "']";
        driver.findElement(By.xpath(expression)).click();
        String currentUrl= driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,baseUrl+ menu,"Navigated successfully");
    }

    String baseUrl="https://demo.nopcommerce.com/";
    By MouseHoverComputer =By.xpath("//a[@href='/computers']");
    By MouseHoverElectronic =By.xpath("//a[@href='/electronics']");
    By MouseHoverApparel =By.xpath("//a[@href='/apparel']");
    By MouseHoverDigitalDownloads= By.xpath("//a[@href='/digital-downloads']");
    By MouseHoverBooks =By.xpath("//a[@href='/books']");
    By MouseHoverJewerely =By.xpath("//a[@href='/jewelry']");
    By MouseHoverGiftCards =By.xpath("//a[@href='/gift-cards']");



    public void MouseHoveringComputer(){
        mouseHoverToElement(MouseHoverComputer);

    }

    public void MouseHoveringElectronic(){
        mouseHoverToElement(MouseHoverElectronic);
    }
    public void MouseHoveringApparel(){
        mouseHoverToElement(MouseHoverApparel);
    }
    public void MouseHoveringDigitalDownload(){
        mouseHoverToElement(MouseHoverDigitalDownloads);
    }
    public void MouseHoveringBooks(){
        mouseHoverToElement(MouseHoverBooks);
    }
    public void MouseHoveringJewellery(){
        mouseHoverToElement(MouseHoverJewerely);
    }
    public void MouseHoveringGiftCards(){
        mouseHoverToElement(MouseHoverGiftCards);
    }


}
