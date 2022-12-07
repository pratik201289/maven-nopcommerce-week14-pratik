package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ComputerMenu extends Utility {

        By clickComputerMenu =By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]");
        By clickDesktopTab= By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]");

        By verifyZtoAList= By.xpath("//select[@id='products-orderby']");

        public void clickOnComputerMenu(){
            clickOnElement(clickComputerMenu);
        }
        public void clickOnDesktopMenu(){
            clickOnElement(clickDesktopTab);
        }
        public void setSelectZtoAListDrop(){
            selectByContainsTextFromDropDown(verifyZtoAList,"Name: Z to A");

        }


}
