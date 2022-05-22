package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private Driver(){

    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "/Users/ramiturkmani/IdeaProjects/selenium_initial_project/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get("https://comfyelite.com/");
            WebElement contact = driver.findElement(By.xpath("//a[text() = 'Contact Us']"));
            contact.click();
            System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                    "Contact us navigation PASSED" : "Contact us navigation FAILED!!!");
        }
        return driver;
    }

    public static void quitDriver(){
        if (driver != null){
            driver.manage().deleteAllCookies();
            driver.quit();
            driver = null;
        }
    }
}
