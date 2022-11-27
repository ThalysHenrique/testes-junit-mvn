package com.automacaodetestes.automacaoDeTestes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomacaoDeTestesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutomacaoDeTestesApplication.class, args);

		WebDriver driver = new ChromeDriver();
	}

}
