package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.TopMenu;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

    TopMenu topMenu = new TopMenu();

    @Test
    public void verifyPageNavigation() {

        topMenu.MouseHoveringComputer();
        topMenu.selectMenu("computers");
        topMenu.MouseHoveringElectronic();
        topMenu.selectMenu("electronics");
        topMenu.MouseHoveringApparel();
        topMenu.selectMenu("apparel");
        topMenu.MouseHoveringDigitalDownload();
        topMenu.selectMenu("digital-downloads");
        topMenu.MouseHoveringBooks();
        topMenu.selectMenu("books");
        topMenu.MouseHoveringJewellery();
        topMenu.selectMenu("jewelry");
        topMenu.MouseHoveringGiftCards();
        topMenu.selectMenu("gift-cards");

    }


}
