package com.danielle.testeautomatizado;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest extends BaseTest {

    @Test
    public void devePesquisarNoGoogle(){
        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("Batata frita" + Keys.ENTER);

        String resultado = driver.findElement(By.id("result-stats")).getText("Aproximadamente")

    }
}
