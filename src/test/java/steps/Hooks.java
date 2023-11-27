package steps;

import com.myTeck.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks extends Base {

    @Before
    public void beforeAllMethode(){
        System.out.println("**** STARTING TEST ****");

    }

    @After
    public void afterALlMethode(Scenario sc){
        final byte[]
                screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        sc.attach(screenshot,"image/png","image");
        driver.quit();
    }
}
