package ShettyStuff;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class Angular1
{
        public static void main(String[] args)
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\i63914\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
//            Go to form - rahulshettyacademy.com/angularpractice
            driver.get("https://rahulshettyacademy.com/angularpractice/");

//            1. enter name, email, pw, check checkbox
            driver.findElement(By.name("name")).sendKeys("Goo"  );
            driver.findElement(By.name("email")).sendKeys("email@email.com");
            driver.findElement(By.id("exampleInputPassword1")).sendKeys("password123");
            driver.findElement(By.id("exampleCheck1")).click();

//            select female in dropdown
            WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));  //or CssSelector
            Select dropdown = new Select(gender);
            dropdown.selectByContainsVisibleText("Female");

//            2. Select Student radio button
            driver.findElement(By.id("inlineRadio1")).click();

//            3. Date of birth send keys
            driver.findElement(By.name("bday")).sendKeys("01/01/2000");

//            4. click Submit
            driver.findElement(By.cssSelector("input[type='submit']")).click();
//
//            5. Capture text for success message and print it in the output
            System.out.println(driver.findElement(By.className("alert")).getText());

//            6.  "Success! The Form has been submitted successfully!"
            Assert.assertEquals(driver.findElement(By.className("alert")).getText(), "×\n" +
                    "Success! The Form has been submitted successfully!.");


        }


}


