package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class SearchPageStep {
    WebDriver driver = new ChromeDriver();
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Test
    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {
        driver.get("https://chase.truecar.com/");
        driver.manage().window().maximize();



        System.out.println(" Navigate Login Page ");

    }


    @And("^I enter the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterTheAnd(String username, String Password) throws Throwable {
        driver.findElement(By.name("acct")).click();
        driver.findElement(By.name("acct")).clear();
        driver.findElement(By.name("acct")).sendKeys("Neotest1");
        driver.findElement(By.name("pw")).click();
        driver.findElement(By.name("pw")).clear();
        driver.findElement(By.name("pw")).sendKeys("password");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='password:'])[1]/following::input[2]")).click();
        driver.findElement(By.id("me")).click();
        System.out.println("This step enter the Username and Password on the Login page" + username + Password);

    }

    @And("^The I should be able to update my \"([^\"]*)\"$")
    public void theIShouldBeAbleToUpdateMy(String arg0) throws Throwable {
        driver.findElement(By.name("uemail")).click();
        driver.findElement(By.name("uemail")).clear();
        driver.findElement(By.name("uemail")).sendKeys("neo_1@hotmail.com");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(shared)'])[1]/following::input[1]")).click();
        driver.findElement(By.linkText("Hacker News")).click();
    }

    @Then("^I should then log out of my account$")
    public void iShouldThenLogOutOfMyAccount() {
        driver.findElement(By.id("logout")).click();

    }

    @When("^I can enter a new \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iCanEnterANewAnd(String username, String Password) throws Throwable {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='password:'])[2]/following::input[2]")).click();
        driver.findElement(By.name("acct")).click();
        driver.findElement(By.name("acct")).clear();
        driver.findElement(By.name("acct")).sendKeys("Neotest2");
        driver.findElement(By.name("pw")).click();
        driver.findElement(By.name("pw")).clear();
        driver.findElement(By.name("pw")).sendKeys("password");
        System.out.println("This step enter the Username and Password on the Login page" + username + Password);
    }

    @And("^clicks the create account button$")
    public void clicksTheCreateAccountButton() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='password:'])[1]/following::input[2]")).click();
    }

    @Then("^a HackerNews account is created$")
    public void aHackerNewsAccountIsCreated() {
        driver.findElement(By.linkText("Hacker News")).click();

    }

    @And("^account name is set as Neotest(\\d+)$")
    public void accountNameIsSetAsNeotest(int arg0) {
        driver.findElement(By.id("logout")).click();

    }


    @Then("^should be able to update the about section$")
    public void shouldBeAbleToUpdateTheAboutSection() {
        driver.findElement(By.name("about")).click();
        driver.findElement(By.name("about")).clear();
        driver.findElement(By.name("about")).sendKeys("@Given(\"^that i am on the shopping website$\")\npublic void that_i_am_on_the_shopping_website() throws Throwable {\n    // Write code here that turns the phrase above into concrete actions\n    throw new PendingException();\n}\n\n@When(\"^i add an item to the basket$\")\npublic void i_add_an_item_to_the_basket() throws Throwable {\n    // Write code here that turns the phrase above into concrete actions\n    throw new PendingException();\n}\n\n@Then(\"^i can view the item in my basket$\")\npublic void i_can_view_the_item_in_my_basket() throws Throwable {\n    // Write code here that turns the phrase above into concrete actions\n    throw new PendingException();");
    }

    @And("^select from the drop list of showdead and noprocrast list$")
    public void selectFromTheDropListOfShowdeadAndNoprocrastList() {
        driver.findElement(By.name("showd")).click();
        new Select(driver.findElement(By.name("showd"))).selectByVisibleText("yes");
        driver.findElement(By.name("showd")).click();
        driver.findElement(By.name("nopro")).click();
        new Select(driver.findElement(By.name("nopro"))).selectByVisibleText("yes");
        driver.findElement(By.name("nopro")).click();
    }

    @And("^able to select my maxvisit$")
    public void ableToSelectMyMaxvisit() {
        driver.findElement(By.name("maxv")).clear();
        driver.findElement(By.name("maxv")).sendKeys("400");
    }

    @And("^change my minaway$")
    public void changeMyMinaway() {
        driver.findElement(By.name("mina")).click();
        driver.findElement(By.name("mina")).clear();
        driver.findElement(By.name("mina")).sendKeys("200");

    }

    @Given("^user as correct \"([^\"]*)\" with correct \"([^\"]*)\"$")
    public void userAsCorrectWithCorrect(String MakeType, String ZipCode) throws Throwable {
        driver.get("https://chase.truecar.com/");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New car buyers save an average of $3,221 off MSRP*'])[1]/following::div[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Acura'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).sendKeys("10110");
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::div[3]")).click();
        driver.manage().timeouts().pageLoadTimeout(300, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Alfa Romeo Models'])[1]/following::div[2]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$57,495'])[1]/following::div[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='See Pricing'])[1]/following::strong[1]")).click();
    }
    @Given("^user as correct make type and correct ZipCode$")
    public void userAsCorrectMakeTypeAndCorrectZipCode() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='New car buyers save an average of $3,221 off MSRP*'])[1]/following::div[5]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Acura'])[1]/following::button[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).clear();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).sendKeys("10110");
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::input[1]")).sendKeys(Keys.ENTER);

        System.out.println(" MakeType and Zipcode look up ");
    }

    @And("^user click the shop new cars$")
    public void userClickTheShopNewCars() {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Volvo'])[1]/following::div[3]")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println(" user click the shop new car link ");
    }

    @Then("^the user clicks AllStyles Link$")
    public void theUserClicksAllStylesLink() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://chase.truecar.com/prices-new/alfa-romeo/?zipcode=10110");
        driver.findElement(By.xpath("//div[@class='btn-inner'][contains(.,'All Styles')]")).click();
        System.out.println(" user click all styles link ");

     try{
         driver.get("https://chase.truecar.com/prices-new/alfa-romeo/?zipcode=10110");
         driver.findElement(By.xpath("//div[@class='btn-inner'][contains(.,'All Styles')]")).click();
    }
   catch(NoSuchElementException e)
    {
        System.out.println(e.getMessage());
        driver.close();
        driver.quit();
    }

    }

    @And("^Verify the user gets correct \"([^\"]*)\"$")
    public void verifyTheUserGetsCorrect(String MakeType) throws Throwable {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://chase.truecar.com/prices-new/alfa-romeo/?zipcode=10110");
        //driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='$57,495'])[1]/following::div[1]")).click();
        //driver.switchTo().frame("(//button[@type='button'][contains(.,'Build and Price')])[1]");
        driver.findElement(By.xpath("(//button[@type='button'][contains(.,'Build and Price')])[1]")).click();
        System.out.println(" user get correct make type ");
    }

    @Then("^selcet the \"([^\"]*)\" then click build and Price$")
    public void selcetTheThenClickBuildAndPrice(String arg0) throws Throwable {
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='SUVs'])[1]/following::h4[1]")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Go'])[1]/following::div[3]")).click();
    }


    @Then("^select the \"([^\"]*)\" then click build and Price$")
    public void selectTheThenClickBuildAndPrice(String arg0) throws Throwable {
        driver.get("https://chase.truecar.com/prices-new/alfa-romeo/?zipcode=10110");

        if(driver.getPageSource().contains("Alfa Romeo")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

    }

    @Then("^verify the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void verifyTheAnd(String arg0, String arg1) throws Throwable {
        driver.get("https://chase.truecar.com/prices-new/alfa-romeo/?zipcode=10110");

        if(driver.getPageSource().contains("2018")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }

    @Then("^select my delay$")
    public void selectMyDelay() {
        driver.findElement(By.name("delay")).clear();
        driver.findElement(By.name("delay")).sendKeys("2");
    }
    @Given("^user navigates to the HomePage$")
    public void userNavigatesToTheHomePage() {
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();



        System.out.println(" Navigate Google Page ");

    }
    @And("^user clicks the Advertising link on HomePage and Verify$")
    public void userClicksTheAdvertisingLinkOnHomePageAndVerify() {
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Advertising")).click();


        if(driver.getPageSource().contains("Advertising")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

    }
    @And("^user clicks Overview link on HomPage and Verify$")
    public void userClicksOverviewLinkOnHomPageAndVerify() {
        driver.findElement(By.xpath("//span[@class='h-c-header__nav-li-link h-is-active']")).click();

        if(driver.getPageSource().contains("Overview")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }

    }
    @And("^user clicks HowItWorks link on the HomePage and Verify$")
    public void userClicksHowItWorksLinkOnTheHomePageAndVerify() {
        driver.get("https://ads.google.com/intl/en_uk/home/");
        driver.findElement(By.linkText("How it works")).click();

        if(driver.getPageSource().contains("How it works")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }
    @And("^user clicks Cost link on the HomePage and Verify$")
    public void userClicksCostLinkOnTheHomePageAndVerify() {
        driver.findElement(By.linkText("Cost")).click();

        if(driver.getPageSource().contains("Cost")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }
    @And("^user click FAQ Link on the HomePage and Verify$")
    public void userClickFAQLinkOnTheHomePageAndVerify() {
        driver.findElement(By.linkText("FAQ")).click();

        if(driver.getPageSource().contains("FAQ")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }
    @Then("^user click the GDPR Link and Verify$")
    public void userClickTheGDPRLinkAndVerify() {
        driver.findElement(By.linkText("GDPR")).click();

        if(driver.getPageSource().contains("GDPR")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }
    @And("^user click the SuccessStories Link and Verify$")
    public void userClickTheSuccessStoriesLinkAndVerify() {
        driver.findElement(By.linkText("Success stories")).click();

        if(driver.getPageSource().contains("Success stories")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }
    @And("^user clicks the Resources Link and Verify BasicsOfOlineMarketing HowGoogleAdsWorks Cost&BUdgets Advanced links$")
    public void userClicksTheResourcesLinkAndVerifyBasicsOfOlineMarketingHowGoogleAdsWorksCostBUdgetsAdvancedLinks() {
        driver.findElement(By.linkText("Resources")).click();
        driver.findElement(By.linkText("How Google Ads works")).click();
        driver.findElement(By.linkText("Costs & budgets")).click();
        driver.findElement(By.linkText("Advanced")).click();
    }
    @Then("^user clicks Contact Links and Verify$")
    public void userClicksContactLinksAndVerify() {
        driver.findElement(By.linkText("Contact")).click();

        if(driver.getPageSource().contains("Contact")){
            System.out.println("Element is Present");
        }else{
            System.out.println("Element is Absent");
        }
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }

    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }

    }



}

