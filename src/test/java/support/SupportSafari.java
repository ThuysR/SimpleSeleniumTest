package support;

import com.codeborne.selenide.Configuration;

public class SupportSafari extends SelenideSupportClass {


    public static void beforeClass(){
        Configuration.browser = "safari";
    }


}
