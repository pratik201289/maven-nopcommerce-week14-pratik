package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerMenuTest extends BaseTest {

    ComputerMenu computerMenu =new ComputerMenu();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

        computerMenu.clickOnComputerMenu();
        computerMenu.clickOnDesktopMenu();
        computerMenu.setSelectZtoAListDrop();
        // Get all the products name and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='item-grid']"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println(originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
        System.out.println(originalProductsName);
        // Select sort by Name Z - A
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='products-orderby']"), "Name: Z to A");
        // After filter Z -A Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//div[@class='item-grid']"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
        Assert.assertEquals(
                originalProductsName, afterSortByZToAProductsName,"Product not sorted into Z to A order");
    }

}


