package com.automacaodetestes.automacaoDeTestes;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class AutomacaoDeTestesApplicationTests {

	@Test
	void acessar() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thaly\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.casasbahia.com.br");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("Duvidas")).click();
		driver.close();
		driver.quit();
	}

	@Test
	void buscar(){
		String termoBusca = "panela";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thaly\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.casasbahia.com.br");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("strBusca")).sendKeys(termoBusca.toLowerCase());
		driver.findElement(By.id("btnOK")).click();
		String resultado = driver.findElement(By.className("nm-product-name")).getText();
		resultado = resultado.toLowerCase();

		boolean resultadoTeste; // por padrão o boolean será falso

		if (resultado.contains(termoBusca)){
			System.out.println("Teste OK!");
			resultadoTeste = true;
		} else {
			System.out.println("Erro na busca!");
			System.out.println("Erro encontrado foi: " + resultado);
			resultadoTeste = false;
		}

		Assert.assertTrue(resultadoTeste);

		driver.close();
		driver.quit();
	}

}
