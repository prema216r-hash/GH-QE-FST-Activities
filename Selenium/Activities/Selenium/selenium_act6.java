package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
public class selenium_act6{
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page Title:"+driver.getTitle());
        WebElement textField=driver.findElement(By.id("textInput"));
       // System.out.println(textField);
        System.out.println("is text field enabled:"+textField.isEnabled());
        driver.findElement(By.xpath("//*[@id=\"textInputButton\"]")).click();
        System.out.println(textField.isEnabled());
    }
}