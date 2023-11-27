package com.myTeck.Pages;

import com.myTeck.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPage extends Base {
    public TestPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//textarea[@id='APjFqb']")
    WebElement Button;
    @FindBy(xpath = "//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")
    WebElement searchBtn;
    @FindBy(xpath = "//div[@role='heading'][normalize-space()='Hello']")
    WebElement result;

    public void testperform()  {
        Button.sendKeys("Hello");
        searchBtn.click();

    }
    public void displayedAssert() {
        Assert.assertTrue((result).isDisplayed());
    }

}
