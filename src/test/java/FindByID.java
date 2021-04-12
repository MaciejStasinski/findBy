import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class FindByID {

    @Test
    public void googleOpenTest() {
        String driverPath = "D:\\Programowanie\\JAVA\\Nowy folder\\Selenium\\findById\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C://Users//mstas//Desktop//Tests//selUdemy//Test.html");
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        WebElement firstNameInput2 = driver.findElement(By.name("fname"));
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement clickOnMeButton2 = ((ChromeDriver) driver).findElementById("clickOnMe");

        WebElement w3SchoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement w3SchoolLink2 = driver.findElement(By.partialLinkText("Visit W3Schools"));
        WebElement topSecretParagraph = driver.findElement(By.className("topSecret"));
        WebElement firstInput = driver.findElement(By.tagName("input"));

        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement linki = driver.findElement(By.cssSelector("a"));
        WebElement topSecretCss = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdFirstChild = driver.findElement(By.cssSelector("td:first-child"));

        WebElement clickOnMeXPathButton = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeXPathButton2 = driver.findElement(By.xpath("//button"));
        WebElement linksXPath = driver.findElement(By.xpath("//a"));
        WebElement linksXPath2 = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));
        WebElement topSecretXPath = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretXPath2 = driver.findElement(By.xpath("//*[@class='topSecret']"));

        WebElement firstLink = driver.findElement(By.tagName("a"));
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Znaleziono "+ links.size()+ " linków");
        //Jeśli nie znajdziemy żadnego linku pasującego do wyszukiwania to lista zostanie pusta i nie otrzymamy błędu



    }
}
