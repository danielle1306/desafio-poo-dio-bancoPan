package com.danielle.testeautomatizado;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseTest {
    protected static webDriver driver;
    private static final String URL BASE = "https://www.google.com/";
    private static final String CAMINHO DRIVER = "testeAutomatizado/testeAutomatizado/src/main/resources";

    @BeforeClass
    protected static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

    @AfterClass
    protected static void finalizar(){
        driver.quit();
    }
}
