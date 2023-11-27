package com.myTeck.Pages;

import com.myTeck.Base;
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
    @FindBy(xpath = "//body[1]/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")
    WebElement Button;

    public void testperform()  {
        Button.click();

    }

}
