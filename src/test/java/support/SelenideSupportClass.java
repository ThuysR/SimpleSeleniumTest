package support;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Before;

public class SelenideSupportClass extends Selenide {

    @Before
    public  void beforeClass(){
        Configuration.browser = "chrome";
    }

    @After
    public  void afterClass(){
        close();
    }
}
