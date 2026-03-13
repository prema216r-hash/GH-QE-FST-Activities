package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_act10 {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        Actions action=new Actions(driver);
        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println("Page Title:"+driver.getTitle());
        WebElement football=driver.findElement(By.xpath("//*[@id=\"ball\"]"));
        WebElement dropZone1=driver.findElement(By.xpath("//*[@id=\"dropzone1\"]"));
        WebElement dropZone2=driver.findElement(By.xpath("//*[@id=\"dropzone2\"]"));
        action.clickAndHold(football).pause(1000).dragAndDrop(football, dropZone1).build().perform();
        if(dropZone1.findElement(By.xpath("//*[@id=\"ball\"]")).getText().equals("Dropped"));
        {
            System.out.println("Ball Dropped at DropZone1");
        }
        action.pause(1000).dragAndDrop(dropZone1, dropZone2).build().perform();
        if(dropZone2.findElement(By.xpath("//*[@id=\"dropzone2\"]")).getText().equals("Dropped"));{
            System.out.println("Ball has entered Drop Zone 2");
        }
        driver.quit();
    }
}