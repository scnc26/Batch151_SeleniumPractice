package Day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class study01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // "https://www.amazon.com/" adresine gidiniz.
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(2000);

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");
        Thread.sleep(2000);
        // amazon adresine geri donunuz
        driver.navigate().back();
        Thread.sleep(2000);
        // n11 adresine ilerleyiniz
        driver.navigate().forward();
        Thread.sleep(2000);
        // sayfayi yenileyiniz
        driver.navigate().refresh();
        Thread.sleep(2000);
        // pencereyi kapat
        driver.close();
        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");


    }
}
