package Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
public class selenium_amazon {
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        Actions action=new Actions(driver);
        driver.get("https://www.amazon.in/");
        WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        search.click();
        action.sendKeys("iphone 17 pro").sendKeys(Keys.ENTER).perform();
    }
}
