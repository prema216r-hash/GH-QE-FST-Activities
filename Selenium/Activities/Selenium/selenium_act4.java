package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
public class selenium_act4 {
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("title of the page"+driver.getTitle());
        WebElement checkbox=driver.findElement(By.id("checkbox"));
        System.out.println(checkbox.isDisplayed());
        driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
        //driver.sleep(3000);
         driver.findElement(By.xpath("//*[@id=\"checkbox\"]")).click();
         driver.quit();
    }
}
