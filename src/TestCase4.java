import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();

        WebElement firstName = driver.findElement(By.xpath("//label[text()='First Name*']"));
        WebElement lastName = driver.findElement(By.xpath("//label[text()='Last Name*']"));
        WebElement email = driver.findElement(By.xpath("//label[text()='Email*']"));

        WebElement firstNameInput = driver.findElement(By.xpath("//input[@data-aid='First Name']"));
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@data-aid='Last Name']"));
        WebElement emailInput = driver.findElement(By.xpath("//input[@data-aid='CONTACT_FORM_EMAIL']"));
        WebElement messageInput = driver.findElement(By.xpath("//*[@data-aid='CONTACT_FORM_MESSAGE']"));

        System.out.println(firstName.isDisplayed() && firstName.getText().equals("First Name*") ?
                "First name label validation PASSED" : "First name label validation FAILED!!!");
        System.out.println(lastName.isDisplayed() && lastName.getText().equals("Last Name*") ?
                "Last name label validation PASSED" : "Last name label validation FAILED!!!");
        System.out.println(email.isDisplayed() && email.getText().equals("Email*") ?
                "Email label validation PASSED" : "Email label validation FAILED!!!");
        System.out.println(messageInput.isDisplayed() && messageInput.getAttribute("placeholder").equals("Message*") ?
                "Message label validation PASSED" : "Message label validation FAILED!!!");

        firstNameInput.sendKeys("Rami");
        lastNameInput.sendKeys("Turkmani");
        emailInput.sendKeys("123@outlook.com");
        messageInput.sendKeys("Test message!");

        System.out.println(firstNameInput.isDisplayed() && firstNameInput.getAttribute("value").equals("Rami") ?
                "First name input validation PASSED" : "First name input validation FAILED!!!");
        System.out.println(lastNameInput.isDisplayed() && lastNameInput.getAttribute("value").equals("Turkmani") ?
                "Last name input validation PASSED" : "Last name input validation FAILED!!!");
        System.out.println(emailInput.isDisplayed() && emailInput.getAttribute("value").equals("123@outlook.com") ?
                "Email input validation PASSED" : "Email input validation FAILED!!!");
        System.out.println(messageInput.isDisplayed() && messageInput.getText().equals("Test message!") ?
                "Message input validation PASSED" : "Message input validation FAILED!!!");

        Driver.quitDriver();
    }
}
