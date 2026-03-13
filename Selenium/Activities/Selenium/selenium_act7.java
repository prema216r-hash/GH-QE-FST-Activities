package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
public class selenium_act7{
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        Actions builder=new Actions(driver);
        driver.get("  https://training-support.net/webelements/mouse-events");
        System.out.println("Page Title:"+driver.getTitle());


        WebElement CargoLockButton=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div[1]/div[1]/div"));
        WebElement CargoTom=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[2]/div"));
        WebElement srcButton=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[3]/div"));
        WebElement target=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/div/div[4]/div"));


        builder.click(CargoLockButton).pause(1000).moveToElement(CargoTom).pause(3000)
        .click(CargoTom).build().perform();
        String actionMessage=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
        System.out.println(actionMessage);


        builder.doubleClick(srcButton).pause(1000).moveToElement(target).pause(1000)
        .contextClick(target).pause(1000).build().perform();
        
        WebElement open=driver.findElement(By.xpath
            ("/html/body/div/main/div/div/div/div/div[2]/div[2]/div/ul/li[1]/button"));
        builder.click(open).build().perform();
        actionMessage=driver.findElement(By.id("result")).getText();
       System.out.println(actionMessage);
    }
}
