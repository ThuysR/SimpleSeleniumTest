package support;

import com.codeborne.selenide.Selenide;
import org.junit.After;


public class SelenideSupportClass extends Selenide {

    @After
    public  void afterClass(){
        close();
    }
}
