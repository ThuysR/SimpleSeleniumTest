package support;

import com.codeborne.selenide.Configuration;
import org.junit.Before;

public class SupportIE extends SelenideSupportClass {


    public static void beforeClass(){
        Configuration.browser = "ie";
    }


}
