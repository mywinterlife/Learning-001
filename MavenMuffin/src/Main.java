import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.List;

public class Main {
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
/*
Check the first  Checkbox and verify if it is successfully checked and Uncheck it again to verify if it is successfully Unchecked
driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True
driver.findElement(By.id("checkBoxOption1")).click();
System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

How to get the Count of number of check boxes present in the page
driver.findElements(By.cssSelector("input[value='checkbox']")).size();

string cb1 = "checkBoxOption1";
boolean isChecked = false;

driver.findElement(By.id(cb1)).click();
isChecked = driver.findElement(By.id(cb1)).isSelected();
System.out.println(isChecked);

driver.findElement(By.id(cb1)).click();
isChecked = driver.findElement(By.id(cb1)).isSelected();
System.out.println(isChecked);

string cb = driver.findElements(By.cssSelector("input[value='checkbox']"));
int cbCount = cb.size();
*/