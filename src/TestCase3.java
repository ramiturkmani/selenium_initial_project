import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement heading2 = driver.findElement(By.xpath("//h2[@data-aid='CONTACT_SECTION_TITLE_REND']/span"));

        if (heading2.isDisplayed() && heading2.getText().equals("Contact Us")) System.out.println("Heading 2 validation PASSED");
        else System.out.println("Heading 2 validation FAILED!!!");

        WebElement heading4 = driver.findElement(By.xpath("//h4[text()='Send Us a Message']"));

        if (heading4.isDisplayed() && heading4.getText().equals("SEND US A MESSAGE")) System.out.println("Heading 4 validation PASSED");
        else System.out.println("Heading 4 validation FAILED!!!");

        Driver.quitDriver();
    }
}
