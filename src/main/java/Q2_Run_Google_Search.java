package task_15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_Run_Google_Search {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "D:\\Driver\\Chromedriver116\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchbox = driver.findElement(By.id("APjFqb"));
        searchbox.sendKeys("Selenium Browser Driver");
        searchbox.submit();
        String name = driver.getTitle();
        System.out.println(name);
    }
}
