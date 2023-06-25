package Day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class study02 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");
        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        String actualTitle = driver.getTitle();
        String expectedWord="Teknoloji";
        if (actualTitle.contains(expectedWord)){
            System.out.println("testTitle PASSED");
        }else System.out.println("testTitle failed"+actualTitle);

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        String actualurl = driver.getCurrentUrl();
        String expected="teknosa";
        if (actualurl.contains(expected)){
            System.out.println("testUrl PASSED");
        }else System.out.println("testUrl failed"+actualurl);
        // "https://medunna.com/" adresine gidiniz
        driver.navigate().to("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        String actualTitle1=driver.getTitle();
        String expectedWord1="MEDUNNA";
        if (actualTitle1.contains(expectedWord1)){
            System.out.println("testTitle1 PASSED");
        }else System.out.println("testTitle1 FAİLED");
        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        String actualUrl2=driver.getTitle();
        String expectedWordurl1="MEDUNNA";

        if (actualUrl2.contains(expectedWordurl1)){
            System.out.println("testUrl2 PASSED");
        }else System.out.println("testUrl2 FAİLED"+actualUrl2);
        // teknosa adresine geri donunuz
        driver.navigate().back();
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        // medunna adresine ilerleyiniz
        driver.navigate().forward();
        // Sayfayı yenileyiniz
        driver.navigate().refresh();
        // pencereyi kapat
        driver.close();
    }
}
