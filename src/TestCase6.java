import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement sendButton = driver.findElement(By.xpath("//button[text()='Send']"));

        sendButton.click();
        System.out.println(sendButton.isDisplayed() && sendButton.isEnabled() && sendButton.getText().equals("SEND") ?
                "Send button validation PASSED" : "Send button valdiation FAILED!!!");

        Driver.quitDriver();
    }
}
