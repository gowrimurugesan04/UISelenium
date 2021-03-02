package com.quinbay.qa.training.test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.InterruptedException;
public class SeleniumMethodsExample {
    WebDriver driver;
    public SeleniumMethodsExample(WebDriver Driver) {
        driver = Driver;
    }

    public void clickOnImage(String xpath) {
        WebElement clickOnImage = driver.findElement(By.xpath(xpath));
        clickOnImage.click();
    }

    public void addToCart(String xpath) {
        WebElement addToCart = driver.findElement(By.xpath(xpath));
        addToCart.click();
    }

    public void click(String id, String xpath) throws InterruptedException {
        switch (id) {

            case "s":
                WebElement searchBox = driver.findElement(By.xpath(xpath));
                searchBox.click();
                searchBox.sendKeys("Tshirt");
                searchBox.sendKeys(Keys.RETURN);
                break;

            case "Dismiss":
                WebElement dismiss = driver.findElement(By.xpath(xpath));
                dismiss.click();
                break;

//            case "Add to cart": WebElement addToCart = driver.findElement(By.xpath(xpath));
//                    addToCart.click();
//                    Thread.sleep(1000);
//                    break;

            case "View cart":
                WebElement viewCart = driver.findElement(By.xpath(xpath));
                viewCart.click();
                Thread.sleep(1000);
                break;

            case "Proceed to checkout":
                WebElement proceedToCheckout = driver.findElement(By.xpath(xpath));
                proceedToCheckout.click();
                Thread.sleep(1000);
                break;
        }
    }

    public void setFirstName(String xpath) {
        WebElement firstName = driver.findElement(By.xpath(xpath));
        firstName.sendKeys("Gowri");
    }

    public void setLastName(String xpath) {
        WebElement lastName = driver.findElement(By.xpath(xpath));
        lastName.sendKeys("Murugesan");
    }

    public void selectCountry(String xpath) {
        Select select = new Select(driver.findElement(By.id(xpath)));
        select.selectByVisibleText("India");
    }

    public void setAddress1(String xpath) {
        WebElement address1 = driver.findElement(By.xpath(xpath));
        address1.sendKeys("2, Ponmuthu Nagar, Veerakeralam");
    }

    public void setCity(String xpath) {
        WebElement city = driver.findElement(By.xpath(xpath));
        city.sendKeys("Coimbatore");
    }

    public void selectState(String xpath) {
        Select selectState = new Select(driver.findElement(By.id(xpath)));
        selectState.selectByVisibleText("Tamil Nadu");
    }

    public void postCode(String xpath) {
        WebElement postCode = driver.findElement(By.xpath(xpath));
        postCode.sendKeys("641007");
    }

    public void setPhoneNumber(String xpath) {
        WebElement phoneNumber = driver.findElement(By.xpath(xpath));
        phoneNumber.sendKeys("8870222810");
    }

    public void setEmail(String xpath) {
        WebElement email = driver.findElement(By.xpath(xpath));
        email.sendKeys("poojagowri99@gmail.com");
    }

    public void clickCreateAccount(String xpath) {
        WebElement createAccount = driver.findElement(By.id(xpath));
        createAccount.click();
    }

    public void createPassword(String xpath) {
        WebElement password=driver.findElement(By.id(xpath));
        password.sendKeys("Loginpassword");
        //Thread.sleep(1000);
    }
    public void payment(String xpath) {
        WebElement payment = ((ChromeDriver) driver).findElementByXPath(xpath);
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", payment);
    }
    public void placeOrder(String xpath)
    {
        WebElement placeOrder=driver.findElement(By.xpath(xpath));
        placeOrder.submit();
    }
}