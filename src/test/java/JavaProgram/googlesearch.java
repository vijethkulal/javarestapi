package javaprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class googlesearch {


    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vkulal\\Downloads\\drivers\\chromedriver.exe");
        options.addArguments("disable-infobars");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);


        driver.get("http://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("Gandhi");

        List<WebElement> parent = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
        System.out.println(parent.size());
        System.out.println(parent);

        for (WebElement i : parent) {
            System.out.println(i.getText());
            Thread.sleep(2000);


            if (i.getText().contains("gandhi death")) {
                i.click();
                break;
            }

        }


        driver.close();
        driver.quit();


    }

}
