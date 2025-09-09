package main.java.ShettyStuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

class ShettyCheckboxDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\i63914\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement bmw = driver.findElement(By.id("checkBoxOption1"));
        if (!bmw.isSelected()) {
            bmw.click();
        }
        Assert.assertTrue(bmw.isSelected());
        bmw.click();
        Assert.assertFalse(bmw.isSelected());
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        int checkboxCount = checkboxes.size();
        System.out.println("There are " + checkboxCount + " checkboxes on the page.");
        driver.close();
    }
}

