package pages;
import static helper.Model.*;
import static helper.Utility.driver;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.runner.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.time.Duration;

public class WebPage {

    Request req;

    By input_username = By.id("user-name");
    By input_password = By.id("password");
    By login_button = By.id("login-button");
    By icon_cart = By.id("shopping_cart_container");

    By text_error_message(String message) {
        return By.xpath("//*[contains(text (), '" + message + "')]");
    }

    By addToCart = By.xpath("(//*[text()=\"Add to cart\"])[1]");
    By remove = By.xpath("(//*[text()=\"Remove\"])[1]");
    By icon_cart_item = By.xpath("//span[@class=\"shopping_cart_badge\"]");
    By masked_password = By.xpath("//input[@type='password' and @placeholder='Password']");
    By unmasked_password = By.xpath("//input[@type='text' and @placeholder='Password']");
    By twitter_icon = By.xpath("//*[@href='https://twitter.com/saucelabs']");
    By facebook_icon = By.xpath("//*[@href='https://www.facebook.com/saucelabs']");
    By linkedin_icon = By.xpath("//*[@href='https://www.linkedin.com/company/sauce-labs/']");
    By three_lines_sidebar = By.xpath("//button[@id='react-burger-menu-btn']");
    By all_items = By.id("inventory_sidebar_link");
    By about = By.id("about_sidebar_link");
    By reset_app_state = By.id("reset_sidebar_link");
    By logout = By.id("logout_sidebar_link");
    By ascending_order = By.xpath("//option[@value='az']");
    By descending_order = By.xpath("//option[@value='za']");
    By first_product_click = By.xpath("//a[@id='item_4_title_link']");
    By big_add_to_cart = By.xpath("//button[@id='add-to-cart']");
    By big_remove = By.xpath("//button[@id='remove']");
    By price_low_to_high = By.xpath("//option[@value='lohi']");
    By price_high_to_low = By.xpath("(//option[@value='hilo'])");
    By second_product_click = By.xpath("//a[@id='item_0_title_link']");
    By third_product_click = By.xpath("//a[@id='item_1_title_link']");
    By fourth_product_click = By.xpath("//a[@id='item_5_title_link']");
    By fifth_product_click = By.xpath("//a[@id='item_2_title_link']");
    By sixth_product_click = By.xpath("//a[@id='item_3_title_link']");
    By cart_click = By.xpath("//a[@class='shopping_cart_link']");
    By order_detail = By.xpath("//div[@class='cart_list']");
    By remove_button = By.xpath("//button[@id='remove-sauce-labs-backpack']");
    By order_details_removed = By.xpath("//div[@class='cart_list']");
    By continue_shopping = By.xpath("//button[@id='continue-shopping']");
    By checkout_button = By.xpath("//button[@id='checkout']");
    By cancel_button = By.xpath("//button[@id='cancel']");
    By continue_button = By.xpath("//input[@id='continue']");
    By fill_in_data = By.xpath("//div[@class='checkout_info']");
    By order_confirmation= By.xpath("//div[@id='checkout_summary_container']");
    By first_name = By.xpath("//input[@id='first-name']");
    By last_name = By.xpath("//input[@id='last-name']");
    By zip_code = By.xpath("//input[@id='postal-code']");
    By finish_button = By.xpath("//button[@id='finish']");
    By purchase_page = By.xpath("//div[@id='checkout_complete_container']");
    By back_home = By.xpath("//button[@id='back-to-products']");

    public void openBrowser() {
        driver.get("https://www.saucedemo.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(input_password).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(login_button).click();
    }

    public void assertLoginPage() {
        driver.findElement(icon_cart).isDisplayed();
    }

    public void assertErrorMessage(String error_message) {
        driver.findElement(text_error_message(error_message)).isDisplayed();
    }

    public void clickAddToCart() {
        driver.findElement(addToCart).click();
    }

    public void remove() {
        driver.findElement(remove).click();
    }

    public void assertCartItem(String cartItem) {
        String itemExpected = cartItem;
        String itemActual = driver.findElement(icon_cart_item).getText();
        assertThat(itemActual).isEqualTo(itemExpected);
    }

    public void maskedPassWord() {
        driver.findElement(masked_password).isDisplayed();
    }

    public void productDetails1() throws MalformedURLException {
        req = firstProductDetails();
    }

    public void productDetails2() throws MalformedURLException {
        req = secondProductDetails();
    }

    public void productDetails3() throws MalformedURLException {
        req = thirdProductDetails();
    }

    public void productDetails4() throws MalformedURLException {
        req = fourthProductDetails();
    }

    public void productDetails5() throws MalformedURLException {
        req = fifthProductDetails();
    }

    public void productDetails6() throws MalformedURLException {
        req = sixthProductDetails();
    }

    public void socialMediaButtons() {
        driver.findElement(twitter_icon).click();
        driver.findElement(facebook_icon).click();
        driver.findElement(linkedin_icon).click();
    }

    public void socialMediaPages() throws MalformedURLException {
        req = socialMedia();
    }

    public void ThreeLinesSidebar() {
        driver.findElement(three_lines_sidebar).click();
    }

    public void AllItems() {
        driver.findElement(all_items).click();
    }

    public void directedToProductDisplayPage() throws MalformedURLException {
        req = productDisplayPage();
    }

    public void about() {
        driver.findElement(about).click();
    }

    public void aboutPage() throws MalformedURLException {
        req = backToAboutPage();
    }

    public void resetAppState() {
        driver.findElement(reset_app_state).click();
    }

    public void cartReset() {
        driver.findElement(icon_cart).isDisplayed();
    }

    public void logout() {
        driver.findElement(logout).click();
    }

    public void backToLoginPage() throws MalformedURLException {
        req = redirectedToLoginPage();
    }

    public void LogoutMenu() {
        driver.findElement(logout).isDisplayed();
    }

    public void ascendingAlphabeticalOrder() {
        driver.findElement(ascending_order).click();
    }

    public void ascendingProductList() {
        req = ascendingProduct();
    }

    public void descendingAlphabeticalOrder() {
        driver.findElement(descending_order).click();
    }

    public void descendingProductList() {
        req = descendingProduct();
    }

    public void firstProductClick() {
        driver.findElement(first_product_click).click();
    }

    public void firstProductDisplay() throws MalformedURLException {
        req = firstProductDetails();
    }

    public void bigAddToCart() {
        driver.findElement(big_add_to_cart).click();
    }

    public void bigRemove() {
        driver.findElement(big_remove).click();
    }

    public void priceLowToHigh() {
        driver.findElement(price_low_to_high).click();
    }

    public void priceLowToHighProductList() {
        req = priceLowToHighProduct();
    }

    public void priceHighToLow() {
        driver.findElement(price_high_to_low).click();
    }

    public void priceHighToLowProductList() {
        req = priceHighToLowProduct();
    }

    public void secondProductClick() {
        driver.findElement(second_product_click).click();
    }

    public void secondProductDisplay() throws MalformedURLException {
        req = secondProductDetails();
    }

    public void thirdProductClick() {
        driver.findElement(third_product_click).click();
    }

    public void thirdProductDisplay() throws MalformedURLException {
        req = thirdProductDetails();
    }

    public void fourthProductClick() {
        driver.findElement(fourth_product_click).click();
    }

    public void fourthProductDisplay() throws MalformedURLException {
        req = fourthProductDetails();
    }

    public void fifthProductClick() {
        driver.findElement(fifth_product_click).click();
    }

    public void fifthProductDisplay() throws MalformedURLException {
        req = fifthProductDetails();
    }

    public void sixthProductClick() {
        driver.findElement(sixth_product_click).click();
    }

    public void sixthProductDisplay() throws MalformedURLException {
        req = sixthProductDetails();
    }

    public void ImagesProblemUser() throws MalformedURLException {
        req = ImagesProblem();
    }

    public void firstIncorrectImage() throws MalformedURLException {
        req = ImagesProblem();
    }

    public void incorrectPrices() throws MalformedURLException {
        req = incorrectPricesVisualUser();
    }

    public void cartIconClick() {
        driver.findElement(cart_click).click();
    }

    public void orderDetailsDisplay() {
        driver.findElement(order_detail).isDisplayed();
    }

    public void removeButton() {
        driver.findElement(remove_button).click();
    }

    public void orderDetailsRemoved() {
        driver.findElement(order_details_removed).isDisplayed();
    }

    public void continueShoppingButton() {
        driver.findElement(continue_shopping).click();
    }

    public void checkoutButton() {
        driver.findElement(checkout_button).click();
    }

    public void fillInData() {
        driver.findElement(fill_in_data).isDisplayed();
    }

    public void cancelButton() {
        driver.findElement(cancel_button).click();
    }

    public void continueButton() {
        driver.findElement(continue_button).click();
    }

    public void orderConfirmationPage() {
        driver.findElement(order_confirmation).isDisplayed();
    }

    public void firstName(String firstname) {
        driver.findElement(first_name).sendKeys(firstname);
    }

    public void lastName(String lastname) {
        driver.findElement(last_name).sendKeys(lastname);
    }

    public void zipCode(String zipcode) {
        driver.findElement(zip_code).sendKeys(zipcode);
    }

    public void finishButton() {
        driver.findElement(finish_button).click();
    }

    public void purchasePage() {
        driver.findElement(purchase_page).isDisplayed();
    }

    public void backHomeButton() {
        driver.findElement(back_home).click();
    }

    public void notActive() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(300));
    }
}