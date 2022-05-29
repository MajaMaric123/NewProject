import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Domaci2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Petar\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.stealmylogin.com/demo.html");

        WebElement inputUserName = driver.findElement(By.name("username"));
        inputUserName.sendKeys("maja");
        WebElement inputPassword = driver.findElement(By.name("password"));
        inputPassword.sendKeys("698749");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/form/input[3]"));
        loginButton.click();

        if(driver.getCurrentUrl().equals("https://example.com/")){
            System.out.println("Nice");
        }else{
            System.out.println("Not nice");
        }
    }
}
