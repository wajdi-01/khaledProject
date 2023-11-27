package com.myTeck.Pages;

import com.myTeck.Base;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage extends Base {
    public loginPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[contains(text(),'Connexion')]")
    WebElement connexionButton;
    @FindBy(xpath = "//input[@id='email']")
    WebElement email;
    @FindBy(xpath = "//input[@id='pass']")
    WebElement password;
    @FindBy(xpath = "//body[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[2]/form[1]/fieldset[1]/div[5]/div[1]/button[1]/span[1]")
    WebElement loginButton;

    @FindBy(xpath = "//body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[1]/span[1]")
    WebElement loginCheckAssertion;
    public void loginAuth(String mail,String pass) throws InterruptedException {
        connexionButton.click();
        email.sendKeys(mail);
        password.sendKeys(pass);
        loginButton.click();
        Thread.sleep(5000);
    }

    public void loginAssertion() throws InterruptedException {
        Assert.assertTrue((loginCheckAssertion).isDisplayed());


    }

}
