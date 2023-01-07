package tests.day15;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

import java.util.Arrays;

public class C01_SoftAssert {
    @Test
    public void test01(){
        //amazon anasayfaya gidin
        Driver.getDriver().get("https://www.amazon.com");
        //amazon anasayfaya gittiginizi dogrulayin
        SoftAssert softAssert= new SoftAssert();
        String expectedUrlKelime="amazon";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        softAssert.assertTrue(actualUrl.contains(expectedUrlKelime));
        //Nutella aratin
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //arama sonuclarinin nutella icerdigini dogrulayin

        String aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        softAssert.assertTrue(aramaSonucYazisi.contains("Nutella"),"Arama sonucu Nutella içermiyor");
        //Java aratın
        amazonPage.amazonAramaKutusu.clear();
        amazonPage.amazonAramaKutusu.sendKeys("Java"+Keys.ENTER);
        //arama sonuclarının 1000'den fazla oldugunu dogrulayın
        System.out.println(amazonPage.aramaSonucuElementi.getText());
        aramaSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        String[] sonucArr=aramaSonucYazisi.split(" ");
        System.out.println(Arrays.toString(sonucArr));
        String javaSonucSayisiStr=sonucArr[3];
        javaSonucSayisiStr=javaSonucSayisiStr.replaceAll("\\W","");//6000
        int sonucSayisiInt=Integer.parseInt(javaSonucSayisiStr);
        softAssert.assertTrue(sonucSayisiInt>1000,"Arama sonucu 1000'den çok değil");
        softAssert.assertAll();
        Driver.closeDriver();










    }
























}
