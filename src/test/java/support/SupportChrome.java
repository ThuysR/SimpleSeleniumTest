package support;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class SupportChrome extends SelenideSupportClass {

    public  static void beforeClass(){
        Configuration.browser = "chrome";
    }


}
