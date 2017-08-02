package support;

import com.codeborne.selenide.Configuration;

public class SupportMozzila extends SelenideSupportClass {


    public static void beforeClass(){
        Configuration.browser = "gecko";
    }


}
