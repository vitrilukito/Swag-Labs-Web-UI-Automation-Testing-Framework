package helper;
import org.junit.runner.Request;
import org.openqa.selenium.By;
import java.net.MalformedURLException;
import java.net.URL;

import static helper.Utility.driver;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Model {

    private static Request details1;

    public static Request firstProductDetails() throws MalformedURLException {
        String expectedTitle = "Sauce Labs Backpack";
        String actualTitle = driver.findElement(By.xpath("//*[contains (text(), \"Sauce Labs Backpack\")]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedDescription = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
        String actualDescription = driver.findElement(By.xpath("//*[contains (text(), \"carry.allTheThings() with the sleek\")]")).getText();
        assertEquals(expectedDescription, actualDescription);
        String expectedPrice = "$29.99";
        String actualPrice = driver.findElement(By.xpath("//div[text() = \"29.99\"]")).getText();
        assertEquals(expectedPrice, actualPrice);
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/sauce-backpack-1200x1500.0a0b85a3.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return details1;
    }

    private static Request details2;

    public static Request secondProductDetails() throws MalformedURLException {
        String expectedTitle = "Sauce Labs Bike Light";
        String actualTitle = driver.findElement(By.xpath("//*[contains (text(), \"Sauce Labs Bike Light\")]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedDescription = "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.";
        String actualDescription = driver.findElement(By.xpath("//*[contains (text(), \"A red light\")]")).getText();
        assertEquals(expectedDescription, actualDescription);
        String expectedPrice = "$9.99";
        String actualPrice = driver.findElement(By.xpath("//div[text() = \"9.99\"]")).getText();
        assertEquals(expectedPrice, actualPrice);
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/bike-light-1200x1500.37c843b0.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/bike-light-1200x1500.37c843b0.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return details2;
    }

    private static Request details3;

    public static Request thirdProductDetails() throws MalformedURLException {
        String expectedTitle = "Sauce Labs Bolt T-Shirt";
        String actualTitle = driver.findElement(By.xpath("//*[contains (text(), \"Sauce Labs Bolt T-Shirt\")]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedDescription = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.";
        String actualDescription = driver.findElement(By.xpath("//*[contains (text(), \"Get your testing superhero\")]")).getText();
        assertEquals(expectedDescription, actualDescription);
        String expectedPrice = "$15.99";
        String actualPrice = driver.findElement(By.xpath("//div[text() = \"15.99\"]")).getText();
        assertEquals(expectedPrice, actualPrice);
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/bolt-shirt-1200x1500.c2599ac5.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/bolt-shirt-1200x1500.c2599ac5.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return details3;
    }

    private static Request details4;

    public static Request fourthProductDetails() throws MalformedURLException {
        String expectedTitle = "Sauce Labs Fleece Jacket";
        String actualTitle = driver.findElement(By.xpath("//*[contains (text(), \"Sauce Labs Fleece Jacket\")]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedDescription = "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.";
        String actualDescription = driver.findElement(By.xpath("//*[contains (text(), \"a midweight quarter-zip fleece jacket\")]")).getText();
        assertEquals(expectedDescription, actualDescription);
        String expectedPrice = "$49.99";
        String actualPrice = driver.findElement(By.xpath("//div[text() = \"49.99\"]")).getText();
        assertEquals(expectedPrice, actualPrice);
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/sauce-pullover-1200x1500.51d7ffaf.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/sauce-pullover-1200x1500.51d7ffaf.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return details4;
    }

    private static Request details5;

    public static Request fifthProductDetails() throws MalformedURLException {
        String expectedTitle = "Sauce Labs Onesie";
        String actualTitle = driver.findElement(By.xpath("//*[contains (text(), \"Sauce Labs Onesie\")]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedDescription = "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.";
        String actualDescription = driver.findElement(By.xpath("//*[contains (text(), \"Rib snap infant onesie\")]")).getText();
        assertEquals(expectedDescription, actualDescription);
        String expectedPrice = "$7.99";
        String actualPrice = driver.findElement(By.xpath("//div[text() = \"7.99\"]")).getText();
        assertEquals(expectedPrice, actualPrice);
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/red-onesie-1200x1500.2ec615b2.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/red-onesie-1200x1500.2ec615b2.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return details5;
    }

    private static Request details6;

    public static Request sixthProductDetails() throws MalformedURLException {
        String expectedTitle = "Test.allTheThings() T-Shirt (Red)";
        String actualTitle = driver.findElement(By.xpath("//*[contains (text(), \"Test.allTheThings() T-Shirt (Red)\")]")).getText();
        assertEquals(expectedTitle, actualTitle);
        String expectedDescription = "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.";
        String actualDescription = driver.findElement(By.xpath("//*[contains (text(), \"This classic Sauce Labs t-shirt is perfect\")]")).getText();
        assertEquals(expectedDescription, actualDescription);
        String expectedPrice = "$15.99";
        String actualPrice = driver.findElement(By.xpath("//div[text() = \"15.99\"]")).getText();
        assertEquals(expectedPrice, actualPrice);
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/red-tatt-1200x1500.30dadef4.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/red-tatt-1200x1500.30dadef4.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return details6;
    }

    private static Request social;

    public static Request socialMedia() throws MalformedURLException {
        URL expectedTwitterUrl = new URL("https://twitter.com/saucelabs");
        URL actualTwitterUrl = new URL("https://twitter.com/saucelabs");
        assertEquals(expectedTwitterUrl, actualTwitterUrl);
        URL expectedFacebookUrl = new URL("https://www.facebook.com/saucelabs");
        URL actualFacebookUrl = new URL("https://www.facebook.com/saucelabs");
        assertEquals(expectedFacebookUrl, actualFacebookUrl);
        URL expectedLinkedinUrl = new URL("https://www.linkedin.com/company/sauce-labs/");
        URL actualLinkedinUrl = new URL("https://www.linkedin.com/company/sauce-labs/");
        assertEquals(expectedLinkedinUrl, actualLinkedinUrl);
        return social;
    }

    private static Request backToProductDisplayPage;

    public static Request productDisplayPage () throws MalformedURLException {
        URL expectedUrl = new URL("https://www.saucedemo.com/inventory.html");
        URL actualUrl = new URL("https://www.saucedemo.com/inventory.html");
        assertEquals(expectedUrl, actualUrl);
        return backToProductDisplayPage;
    }

    private static Request backToAboutPage;

    public static Request backToAboutPage () throws MalformedURLException {
        URL expectedUrl = new URL("https://saucelabs.com/");
        URL actualUrl = new URL("https://saucelabs.com/");
        assertEquals(expectedUrl, actualUrl);
        return backToAboutPage;
    }

    private static Request backToLoginPage;

    public static Request redirectedToLoginPage () throws MalformedURLException {
        URL expectedUrl = new URL("https://www.saucedemo.com/");
        URL actualUrl = new URL("https://www.saucedemo.com/");
        assertEquals(expectedUrl, actualUrl);
        return backToLoginPage;
    }

    private static Request ascendingProductList;

    public static Request ascendingProduct () {
        String expectedTitle1 = "Sauce Labs Backpack";
        String actualTitle1 = driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
        assertEquals(expectedTitle1, actualTitle1);
        String expectedTitle2 = "Sauce Labs Bike Light";
        String actualTitle2 = driver.findElement(By.xpath("//a[@id='item_0_title_link']")).getText();
        assertEquals(expectedTitle2, actualTitle2);
        String expectedTitle3 = "Sauce Labs Bolt T-Shirt";
        String actualTitle3 = driver.findElement(By.xpath("//a[@id='item_1_title_link']")).getText();
        assertEquals(expectedTitle3, actualTitle3);
        String expectedTitle4 = "Sauce Labs Fleece Jacket";
        String actualTitle4 = driver.findElement(By.xpath("//a[@id='item_5_title_link']")).getText();
        assertEquals(expectedTitle4, actualTitle4);
        String expectedTitle5 = "Sauce Labs Onesie";
        String actualTitle5 = driver.findElement(By.xpath("//a[@id='item_2_title_link']")).getText();
        assertEquals(expectedTitle5, actualTitle5);
        String expectedTitle6 = "Test.allTheThings() T-Shirt (Red)";
        String actualTitle6 = driver.findElement(By.xpath("//a[@id='item_3_title_link']")).getText();
        assertEquals(expectedTitle6, actualTitle6);
        return ascendingProductList;
    }

    private static Request descendingProductList;

    public static Request descendingProduct () {
        String expectedTitle1 = "Test.allTheThings() T-Shirt (Red)";
        String actualTitle1 = driver.findElement(By.xpath("//a[@id='item_3_title_link']")).getText();
        assertEquals(expectedTitle1, actualTitle1);
        String expectedTitle2 = "Sauce Labs Onesie";
        String actualTitle2 = driver.findElement(By.xpath("//a[@id='item_2_title_link']")).getText();
        assertEquals(expectedTitle2, actualTitle2);
        String expectedTitle3 = "Sauce Labs Fleece Jacket";
        String actualTitle3 = driver.findElement(By.xpath("//a[@id='item_5_title_link']")).getText();
        assertEquals(expectedTitle3, actualTitle3);
        String expectedTitle4 = "Sauce Labs Bolt T-Shirt";
        String actualTitle4 = driver.findElement(By.xpath("//a[@id='item_1_title_link']")).getText();
        assertEquals(expectedTitle4, actualTitle4);
        String expectedTitle5 = "Sauce Labs Bike Light";
        String actualTitle5 = driver.findElement(By.xpath("//a[@id='item_0_title_link']")).getText();
        assertEquals(expectedTitle5, actualTitle5);
        String expectedTitle6 = "Sauce Labs Backpack";
        String actualTitle6 = driver.findElement(By.xpath("//a[@id='item_4_title_link']")).getText();
        assertEquals(expectedTitle6, actualTitle6);
        return descendingProductList;
    }

    private static Request priceLowToHighProductList;

    public static Request priceLowToHighProduct () {
        String expectedPrice1 = "$7.99";
        String actualPrice1 = driver.findElement(By.xpath("//div[text() = \"7.99\"]")).getText();
        assertEquals(expectedPrice1, actualPrice1);
        String expectedPrice2 = "$7.99";
        String actualPrice2 = driver.findElement(By.xpath("//div[text() = \"7.99\"]")).getText();
        assertEquals(expectedPrice2, actualPrice2);
        String expectedPrice3 = "$9.99";
        String actualPrice3 = driver.findElement(By.xpath("//div[text() = \"9.99\"]")).getText();
        assertEquals(expectedPrice3, actualPrice3);
        String expectedPrice4 = "$15.99";
        String actualPrice4 = driver.findElement(By.xpath("//div[text() = \"15.99\"]")).getText();
        assertEquals(expectedPrice4, actualPrice4);
        String expectedPrice5 = "$29.99";
        String actualPrice5 = driver.findElement(By.xpath("//div[text() = \"29.99\"]")).getText();
        assertEquals(expectedPrice5, actualPrice5);
        String expectedPrice6 = "$49.99";
        String actualPrice6 = driver.findElement(By.xpath("//div[text() = \"49.99\"]")).getText();
        assertEquals(expectedPrice6, actualPrice6);
        return priceLowToHighProductList;
    }

    private static Request priceHighToLowProductList;

    public static Request priceHighToLowProduct () {
        String expectedPrice1 = "$49.99";
        String actualPrice1 = driver.findElement(By.xpath("//div[text() = \"49.99\"]")).getText();
        assertEquals(expectedPrice1, actualPrice1);
        String expectedPrice2 = "$29.99";
        String actualPrice2 = driver.findElement(By.xpath("//div[text() = \"29.99\"]")).getText();
        assertEquals(expectedPrice2, actualPrice2);
        String expectedPrice3 = "$15.99";
        String actualPrice3 = driver.findElement(By.xpath("//div[text() = \"15.99\"]")).getText();
        assertEquals(expectedPrice3, actualPrice3);
        String expectedPrice4 = "$15.99";
        String actualPrice4 = driver.findElement(By.xpath("//div[text() = \"15.99\"]")).getText();
        assertEquals(expectedPrice4, actualPrice4);
        String expectedPrice5 = "$9.99";
        String actualPrice5 = driver.findElement(By.xpath("//div[text() = \"9.99\"]")).getText();
        assertEquals(expectedPrice5, actualPrice5);
        String expectedPrice6 = "$7.99";
        String actualPrice6 = driver.findElement(By.xpath("//div[text() = \"7.99\"]")).getText();
        assertEquals(expectedPrice6, actualPrice6);
        return priceHighToLowProductList;
    }

    private static Request ImagesProblemUser;

    public static Request ImagesProblem() throws MalformedURLException {
        URL expectedImageUrl = new URL("https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg");
        URL actualImageUrl = new URL("https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg");
        assertEquals(expectedImageUrl, actualImageUrl);
        return ImagesProblemUser;
    }

    private static Request incorrectPricesVisualUser;

    public static Request incorrectPricesVisualUser() throws MalformedURLException {
        String expectedPrice1 = "$29.99";
        String actualPrice1 = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertNotEquals("Test Failed", expectedPrice1,actualPrice1);
        String expectedPrice2 = "$9.99";
        String actualPrice2 = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertNotEquals("Test Failed", expectedPrice2,actualPrice2);
        String expectedPrice3 = "$15.99";
        String actualPrice3 = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertNotEquals("Test Failed", expectedPrice3,actualPrice3);
        String expectedPrice4 = "$49.99";
        String actualPrice4 = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertNotEquals("Test Failed", expectedPrice4,actualPrice4);
        String expectedPrice5 = "$7.99";
        String actualPrice5 = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertNotEquals("Test Failed", expectedPrice5,actualPrice5);
        String expectedPrice6 = "$15.99";
        String actualPrice6 = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        assertNotEquals("Test Failed", expectedPrice6,actualPrice6);
        return incorrectPricesVisualUser;
    }

}