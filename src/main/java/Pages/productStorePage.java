package Pages;


import Infra.BrowserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class productStorePage {
    WebDriver driver;
    WebElement loginLink;
    WebElement loginUsername;
    WebElement loginPassword;


    public productStorePage() {
        driver = BrowserPage.getDriver();
        driver.navigate().to("https://www.demoblaze.com/");
    }

    public void navigateToLogin(String userName, String password) {
        loginLink = driver.findElement(By.id("login2"));
        loginLink.click();
        loginUsername = driver.findElement(By.id("loginusername"));
        loginPassword = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-body > form > div:nth-child(2) > input"));
        loginUsername.sendKeys(userName);
        loginPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary"));
        loginButton.click();
    }
    public void checkPhone(){
        WebElement phone = driver.findElement(By.cssSelector("a[href='prod.html?idp_=3']"));
        phone.click();
        WebElement addCartButton = driver.findElement(By.cssSelector("#tbodyid > div.row > div > a"));
        addCartButton.click();

    }

}
