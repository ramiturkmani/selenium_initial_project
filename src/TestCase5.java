import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement emailListInput = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']"));
        WebElement emailCheckBox = driver.findElement(By.xpath("//label[@data-aid='CONTACT_FORM_EMAIL_OPT_IN']/div"));

        emailCheckBox.click();
        System.out.println(emailListInput.isSelected() ?
                "Email check box selection PASSED" : "Email check box selection FAILED!!!");

        emailCheckBox.click();
        System.out.println(!emailListInput.isSelected() ?
                "Email check box deselection PASSED" : "Email check box deselection FAILED!!!");

        Driver.quitDriver();
    }
}
