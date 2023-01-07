package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    // Page sayfalari o web sayfasinda kullanilacak locateler ve varsa
    // login islemi gibi basit methodlar icin kullanilir

    // *** page class olusturur olusturmaz ilk yapmamız gereken islem
    // parametresiz constructor olusturup icinde

     //""PageFactory.initElements(webdriver, this)""//
    // ile driver'a page sayfasinda ilk deger atamasini yapmak olmalidir.***

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
     public WebElement amazonAramaKutusu;

    @FindBy (xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucuElementi;


}
