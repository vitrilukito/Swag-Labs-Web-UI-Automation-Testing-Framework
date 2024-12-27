package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;
import java.net.MalformedURLException;

public class WebStep {

    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("open web login page")
    public void openWebLoginPage(){
        webPage.openBrowser();
    }

    @And("user inputs username {string}")
    public void userInputsUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user inputs password {string}")
    public void userInputsPassword(String password) {
        webPage.inputPassword(password);
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        webPage.clickLoginButton();
    }

    @Then("user will see the cart icon in the homepage")
    public void userWillSeeTheCartIconInTheHomepage() {
        webPage.assertLoginPage();
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String error_message) {
        webPage.assertErrorMessage(error_message);
    }

    @And("user adds items to cart")
    public void userAddsItemsToCart() {
        webPage.clickAddToCart();
    }

    @Then("verify that the items in the cart matches {string}")
    public void verifyThatTheItemsInTheCartMatches(String cartItem) {
        webPage.assertCartItem(cartItem);
    }

    @And("user removes item from cart")
    public void userRemovesItemFromCart() {
        webPage.remove();
    }

    @Then("password will be masked")
    public void passwordWillBeMasked() {
        webPage.maskedPassWord();
    }

    @Then("verify that the details of the first product are displayed correctly")
    public void verifyThatTheDetailsOfTheFirstProductAreDisplayedCorrectly() throws MalformedURLException {
        webPage.productDetails1();
    }

    @Then("verify that the details of the second product are displayed correctly")
    public void verifyThatTheDetailsOfTheSecondProductAreDisplayedCorrectly() throws MalformedURLException {
        webPage.productDetails2();
    }

    @Then("verify that the details of the third product are displayed correctly")
    public void verifyThatTheDetailsOfTheThirdProductAreDisplayedCorrectly() throws MalformedURLException {
        webPage.productDetails3();
    }

    @Then("verify that the details of the fourth product are displayed correctly")
    public void verifyThatTheDetailsOfTheFourthProductAreDisplayedCorrectly() throws MalformedURLException {
        webPage.productDetails4();
    }

    @Then("verify that the details of the fifth product are displayed correctly")
    public void verifyThatTheDetailsOfTheFifthProductAreDisplayedCorrectly() throws MalformedURLException {
        webPage.productDetails5();
    }

    @Then("verify that the details of the sixth product are displayed correctly")
    public void verifyThatTheDetailsOfTheSixthProductAreDisplayedCorrectly() throws MalformedURLException {
        webPage.productDetails6();
    }

    @And("user will click the social media buttons")
    public void userWillClickTheSocialMediaButtons() throws MalformedURLException {
        webPage.socialMediaButtons();
    }

    @Then("user will be directed to each social media page")
    public void userWillBeDirectedToEachSocialMediaPage() throws MalformedURLException {
        webPage.socialMediaPages();
    }

    @And("user will click the three lines on the sidebar")
    public void userWillClickTheThreeLinesOnTheSidebar() {
        webPage.ThreeLinesSidebar();
    }

    @Then("user will see the Logout menu")
    public void userWillSeeTheLogoutMenu() {
        webPage.LogoutMenu();
    }

    @And("user will click All Items")
    public void userWillClickAllItems() {
        webPage.AllItems();
    }

    @Then("user will be directed to the product display page")
    public void userWillBeDirectedToTheProductDisplayPage() throws MalformedURLException {
        webPage.directedToProductDisplayPage();
    }

    @And("user will click About")
    public void userWillClickAbout() {
        webPage.about();
    }

    @Then("user will be directed to the About page")
    public void userWillBeDirectedToTheAboutPage() throws MalformedURLException {
        webPage.aboutPage();
    }

    @And("user will click Reset App State")
    public void userWillClickResetAppState() {
        webPage.resetAppState();
    }

    @Then("the cart will be reset")
    public void theCartWillBeReset(){
        webPage.cartReset();
    }

    @And("user will click Logout")
    public void userWillClickLogout() {
        webPage.logout();
    }

    @Then("user will be back to the login page")
    public void userWillBeBackToTheLoginPage() throws MalformedURLException {
        webPage.backToLoginPage();
    }

    @And("user will choose to sort the products from A-Z")
    public void userWillChooseToSortTheProductsFromAZ() {
        webPage.ascendingAlphabeticalOrder();
    }

    @Then("products will be displayed in ascending alphabetical order")
    public void productsWillBeDisplayedInAscendingAlphabeticalOrder() {
        webPage.ascendingProductList();
    }

    @And("user will choose to sort the products from Z-A")
    public void userWillChooseToSortTheProductsFromZA() {
        webPage.descendingAlphabeticalOrder();
    }

    @Then("products will be displayed in descending alphabetical order")
    public void productsWillBeDisplayedInDescendingAlphabeticalOrder() {
        webPage.descendingProductList();
    }

    @And("user will click the title of Sauce Labs Backpack")
    public void userWillClickTheTitleOfSauceLabsBackpack() {
        webPage.firstProductClick();
    }

    @Then("user will see Sauce Labs Backpack photo, description and image")
    public void userWillSeeSauceLabsBackpackPhotoDescriptionAndImage() throws MalformedURLException {
        webPage.firstProductDisplay();
    }

    @And("user will click Add to cart")
    public void userWillClickAddToCart() {
        webPage.bigAddToCart();
    }

    @And("user will click Remove")
    public void userWillClickRemove() {
        webPage.bigRemove();
    }

    @Then("verify that the cart is empty")
    public void verifyThatTheCartIsEmpty() {
        webPage.assertLoginPage();
    }

    @And("user will choose to sort the products based on price, from low to high")
    public void userWillChooseToSortTheProductsBasedOnPriceFromLowToHigh() {
        webPage.priceLowToHigh();
    }

    @Then("products will be sorted from the lowest to the highest price")
    public void productsWillBeSortedFromTheLowestToTheHighestPrice() {
        webPage.priceLowToHighProductList();
    }

    @And("user will choose to sort the products based on price, from high to low")
    public void userWillChooseToSortTheProductsBasedOnPriceFromHighToLow() {
        webPage.priceHighToLow();
    }

    @Then("products will be sorted from the highest to the lowest price")
    public void productsWillBeSortedFromTheHighestToTheLowestPrice() {
        webPage.priceHighToLowProductList();
    }

    @And("user will click the title of Sauce Labs Bike Light")
    public void userWillClickTheTitleOfSauceLabsBikeLight() {
        webPage.secondProductClick();
    }

    @Then("user will see Sauce Labs Bike Light photo, description and image")
    public void userWillSeeSauceLabsBikeLightPhotoDescriptionAndImage() throws MalformedURLException {
        webPage.secondProductDisplay();
    }

    @And("user will click the title of Sauce Labs Bolt T-Shirt")
    public void userWillClickTheTitleOfSauceLabsBoltTShirt() {
        webPage.thirdProductClick();
    }

    @Then("user will see Sauce Labs Bolt T-Shirt photo, description and image")
    public void userWillSeeSauceLabsBoltTShirtPhotoDescriptionAndImage() throws MalformedURLException {
        webPage.thirdProductDisplay();
    }

    @And("user will click the title of Sauce Labs Fleece Jacket")
    public void userWillClickTheTitleOfSauceLabsFleeceJacket() {
        webPage.fourthProductClick();
    }

    @Then("user will see Sauce Labs Fleece Jacket photo, description and image")
    public void userWillSeeSauceLabsFleeceJacketPhotoDescriptionAndImage() throws MalformedURLException {
        webPage.fourthProductDisplay();
    }

    @And("user will click the title of Sauce Labs Onesie")
    public void userWillClickTheTitleOfSauceLabsOnesie() {
        webPage.fifthProductClick();
    }

    @Then("user will see Sauce Labs Fleece Onesie photo, description and image")
    public void userWillSeeSauceLabsFleeceOnesiePhotoDescriptionAndImage() throws MalformedURLException {
        webPage.fifthProductDisplay();
    }

    @And("user will click the title of Test allTheThings T-Shirt Red")
    public void userWillClickTheTitleOfTestAllTheThingsTShirtRed() {
        webPage.sixthProductClick();
    }

    @Then("user will see Test allTheThings T-Shirt Red photo, description and image")
    public void userWillSeeTestAllTheThingsTShirtRedPhotoDescriptionAndImage() throws MalformedURLException {
        webPage.sixthProductDisplay();
    }

    @Then("the images for all products are displayed incorrectly")
    public void theImagesForAllProductsAreDisplayedIncorrectly() throws MalformedURLException {
        webPage.ImagesProblemUser();
    }

    @Then("the image for Sauce Labs Backpack is incorrectly displayed")
    public void theImageForSauceLabsBackpackIsIncorrectlyDisplayed() throws MalformedURLException {
        webPage.firstIncorrectImage();
    }

    @Then("the prices of all products are incorrectly displayed")
    public void thePricesOfAllProductsAreIncorrectlyDisplayed() throws MalformedURLException {
        webPage.incorrectPrices();
    }

    @And("user will click on the cart icon")
    public void userWillClickOnTheCartIcon() {
        webPage.cartIconClick();
    }

    @Then("user will see the order details page")
    public void userWillSeeTheOrderDetailsPage() {
        webPage.orderDetailsDisplay();
    }

    @And("user will click the Remove button")
    public void userWillClickTheRemoveButton() {
        webPage.removeButton();
    }

    @Then("the order detail of the product will disappear")
    public void theOrderDetailOfTheProductWillDisappear() {
        webPage.orderDetailsRemoved();
    }

    @And("user will click the Continue Shopping button")
    public void userWillClickTheContinueShoppingButton() {
        webPage.continueShoppingButton();
    }

    @And("user will click the Checkout button")
    public void userWillClickTheCheckoutButton() {
        webPage.checkoutButton();
    }

    @Then("user will be directed to fill in their data")
    public void userWillBeDirectedToFillInTheirData() {
        webPage.fillInData();
    }

    @And("user will click the Cancel button")
    public void userWillClickTheCancelButton() {
        webPage.cancelButton();
    }

    @And("user will click the Continue button")
    public void userWillClickTheContinueButton() {
        webPage.continueButton();
    }

    @Then("user will be directed to the order confirmation page")
    public void userWillBeDirectedToTheOrderConfirmationPage() {
        webPage.orderConfirmationPage();
    }

    @And("user will fill in {string} in first name")
    public void userWillFillInInFirstName(String firstname) {
        webPage.firstName(firstname);
    }

    @And("user will fill in {string} in last name")
    public void userWillFillInInLastName(String lastname) {
        webPage.lastName(lastname);
    }

    @And("user will fill in {string} in zip code")
    public void userWillFillInInZipCode(String zipcode) {
        webPage.zipCode(zipcode);
    }

    @And("user will click the Finish button")
    public void userWillClickTheFinishButton() {
        webPage.finishButton();
    }

    @Then("user will be directed to the successful purchase page")
    public void userWillBeDirectedToTheSuccessfulPurchasePage() {
        webPage.purchasePage();
    }

    @And("user clicks the Back Home button")
    public void userClicksTheBackHomeButton() {
        webPage.backHomeButton();
    }

    @And("user is not active for 5 minutes")
    public void userIsNotActiveFor5Minutes() {
        webPage.notActive();
    }
}