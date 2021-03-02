package com.quinbay.qa.training.test;
//import com.quinbay.qa.training.pages.HomePage;
//import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
public class SeleniumExample {
    public static void main(String []args) throws InterruptedException
    {
        String searchBoxPath="//input[@id='woocommerce-product-search-field-0']";
        String click="//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/vneck-tee.jpg']";
        String dismiss="//a[@href='#'][@class='woocommerce-store-notice__dismiss-link']";
        String addToCart="//button[@name='add-to-cart']";
        String viewCart="//a[@href='https://www.edgewordstraining.co.uk/demo-site/cart/']";
        String firstName="//input[@name='billing_first_name']";
        String lastName="//input[@name='billing_last_name']";
        String countryid="billing_country";
        String addressXpath="//input[@name='billing_address_1']";
        String statePath="//input[@name='billing_city']";
        String state="billing_state";
        String postCode="//input[@name='billing_postcode']";
        String phoneNumber="//input[@name='billing_phone']";
        String email="//input[@name='billing_email']";
        String createAccountId="createaccount";
        String proceedToCheckout="//a[@href='https://www.edgewordstraining.co.uk/demo-site/checkout/'][@class='checkout-button button alt wc-forward']";
        String password="account_password";
        String payment="//input[@id='payment_method_cod']";
        String order="//button[@name='woocommerce_checkout_place_order']";

        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.edgewordstraining.co.uk/demo-site/");

        SeleniumMethodsExample seleniumMethodsExample=new SeleniumMethodsExample(driver);

        List<WebElement> list=driver.findElements(By.xpath("//img[@src='https://www.edgewordstraining.co.uk/demo-site/wp-content/uploads/2018/03/tshirt.jpg']"));
        if (list.isEmpty())
            System.out.println("Not found");
        else
            System.out.println("Found");


        seleniumMethodsExample.click("Dismiss",dismiss);
        seleniumMethodsExample.click("s",searchBoxPath);
        Thread.sleep(1000);
        seleniumMethodsExample.clickOnImage(click);
        seleniumMethodsExample.addToCart(addToCart);
        seleniumMethodsExample.click("View cart",viewCart);
        seleniumMethodsExample.click("Proceed to checkout",proceedToCheckout);
        seleniumMethodsExample.setFirstName(firstName);
        seleniumMethodsExample.setLastName(lastName);
        seleniumMethodsExample.selectCountry(countryid);
        seleniumMethodsExample.setAddress1(addressXpath);
        seleniumMethodsExample.setCity(statePath);
        seleniumMethodsExample.selectState(state);
        seleniumMethodsExample.postCode(postCode);
        seleniumMethodsExample.setPhoneNumber(phoneNumber);
        seleniumMethodsExample.setEmail(email);
        seleniumMethodsExample.clickCreateAccount(createAccountId);
        seleniumMethodsExample.createPassword(password);
        seleniumMethodsExample.payment(payment);
        seleniumMethodsExample.placeOrder(order);

    }
}