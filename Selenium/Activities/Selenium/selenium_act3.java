package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
public class selenium_act3 {
    public static void main(String args[])
    {
        WebDriver driver=new FirefoxDriver();
        driver.get(" https://training-support.net/webelements/target-practice");
        System.out.println("title of the page:"+driver.getTitle());
        String thirdHeader=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h3[1]")).getText();
        System.out.println(thirdHeader);
        String fifthColor=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/h5")).getCssValue("color");
        System.out.println(fifthColor);
        String purpleClasses=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[5]")).getDomAttribute("class");
        System.out.println("classes of the purple button:"+purpleClasses);
        String slateButton=driver.findElement(By.xpath("/html/body/div/main/div/div/div/div/div[2]/button[6]")).getText();
        System.out.println("Slate Button:"+slateButton);
        driver.quit();
    }
}
