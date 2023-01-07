package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.invoke.SwitchPoint;
import java.time.Duration;

public class Driver {

    static WebDriver driver;

    public static WebDriver getDriver() {

        String browser= ConfigReader.getProperty("browser");

        if (driver==null){

            switch (browser){
                case "chrome" :

                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }


        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

        return driver;

    }

    public static void closeDriver(){
    if (driver != null){
        driver.close();
        driver=null;
    }



    }
}
