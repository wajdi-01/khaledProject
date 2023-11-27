package steps;

import com.myTeck.Base;
import com.myTeck.Pages.TestPage;
import io.cucumber.java.en.When;

public class TestSteps extends Base {
    TestPage testPage;
    @When("User click on button")
    public void user_click_on_button()  {
        testPage =new TestPage();
        testPage.testperform();

    }
}
