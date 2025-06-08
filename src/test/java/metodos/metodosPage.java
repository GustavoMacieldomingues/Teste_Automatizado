package metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class metodosPage {

	WebDriver driver;
	
	public void abrirNavegador (String url) { 
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	
	
	}

	public void clicar (By elemento) {
		driver.findElement(elemento).click();
		
	}

	public void escrever (By elemento) {
		driver.findElement(elemento).sendKeys("iphone 15");
	}

	 public void pausar (int tempo) throws InterruptedException{
		 Thread.sleep(tempo);
	 }
 
}
