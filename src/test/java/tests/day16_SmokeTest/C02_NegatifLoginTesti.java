package tests.day16_SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class C02_NegatifLoginTesti {




    QualitydemyPage qualitydemyPage=new QualitydemyPage();


    @Test
    public void yanlisEmailTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerlipassword"));
        qualitydemyPage.loginButonu.click();

        Assert.assertTrue(qualitydemyPage.kullaniciEmailKutusu.isDisplayed());

        ReusableMethods.bekle(3);
        Driver.closeDriver();



    }








}
