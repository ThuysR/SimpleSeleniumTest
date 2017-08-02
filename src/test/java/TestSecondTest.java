package chrome;

import org.junit.Test;
import org.openqa.selenium.By;
import support.SelenideSupportClass;

public class TestSecondTest extends SelenideSupportClass{

    @Test
    public void secondTest(){
        open("https://phptravels.org/clientarea.php");
        $(By.id("Primary_Navbar-Knowledgebase"));
    }
}
