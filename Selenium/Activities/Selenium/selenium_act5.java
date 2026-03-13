package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
public class selenium_act5 {
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page Title:"+driver.getTitle());
        WebElement checkbox=driver.findElement(By.id("checkbox"));
        System.out.println(checkbox.isSelected());
        try {
            Thread.sleep(3000);   // wait for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("checkbox")).click();
        System.out.println(checkbox.isSelected());
    }
}
