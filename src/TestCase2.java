import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase2 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement heading1 = driver.findElement(By.xpath("//span[text()='Connect With Us']"));

        System.out.println(heading1.getText().equals("Connect With Us") ?
                "Heading 1 validation PASSED" : "Heading 1 validation FAILED!!!");

        WebElement fbLogo = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']/*/*"));

        System.out.println(fbLogo.isDisplayed() ? "FB logo validation PASSED" : "FB logo validation FAILED!!!");

        WebElement fbLink = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_FACEBOOK_LINK']"));

        System.out.println(fbLink.getAttribute("href").equals("https://www.facebook.com/103179127717601") ?
                "FB link validation PASSED" : "FB link validation FAILED!!!");

        WebElement igLogo = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']/*/*"));

        System.out.println(igLogo.isDisplayed() ? "IG logo validation PASSED" : "IG logo validation FAILED!!!");

        WebElement igLink = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));

        System.out.println(igLink.getAttribute("href").equals("https://www.instagram.com/comfyelite") ?
                "IG link validation PASSED" : "IG link validation FAILED!!!");

        Driver.quitDriver();
    }
}
