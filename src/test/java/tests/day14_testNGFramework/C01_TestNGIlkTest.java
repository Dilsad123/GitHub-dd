package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {
    /*
    TestNG test methodlarini isim sirasina gore calistirir.
    Priority degeri verilen methodlar priority degeri kucukten buyuge dogru calisir
    Esit olan priority degerlerinde harf sirasina gore calisir
    Eger priority degeri yazmazsak priority=0 kabul edilir
     */

    @Test(priority = 6)
    public void ilkTest(){
        System.out.println("ilk test calisti");
    }

    @Test(priority = 9)
    public void ikinciTest(){
        System.out.println("ikinci test calisti");

    }

    @Test(priority = 44)
    public void ucuncuTest(){
        System.out.println("ucuncu test calisti");
    }




















}
