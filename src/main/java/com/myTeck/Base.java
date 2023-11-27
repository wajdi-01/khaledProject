package com.myTeck;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties props =new Properties();

    public Base(){
        try {
            File file=new File("src/main/java/com/myTeck/Properties/config.Properties");
            FileInputStream fis =new FileInputStream(file);
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void luncher(){
        if(props.getProperty("browser").equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();}

        else if(props.getProperty("browser").equalsIgnoreCase("Edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
            }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get(props.getProperty("url"));



        }


}
