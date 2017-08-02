
import org.junit.Test;
import org.openqa.selenium.By;
import support.SelenideSupportClass;

public class TestMain extends SelenideSupportClass {

    @Test
    public void firstTest(){
        open("https://phptravels.org/clientarea.php");
        $(By.id("Primary_Navbar-Announcements")).click();
        System.out.println();
    }
}
