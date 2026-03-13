package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class selenium_act2 {
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/login-form/");
        System.out.println("title of the page:"+driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("####");
        driver.quit();
    }
}
