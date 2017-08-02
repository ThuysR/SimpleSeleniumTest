package chrome;

import org.junit.Test;
import org.openqa.selenium.By;
import support.*;

public class TestMain extends SelenideSupportClass{

    private static void walkthrough(){

        open("https://phptravels.org/clientarea.php");
        $(By.id("Primary_Navbar-Announcements")).click();
    }

    @Test
    public void firstTestChrome(){
        SupportChrome.beforeClass();
        walkthrough();
    }

    @Test
    public void firstTestIe(){
        SupportIE.beforeClass();
        walkthrough();
    }

    @Test
    public void firstTestMozilla(){
        SupportMozzila.beforeClass();
        walkthrough();
    }
}
