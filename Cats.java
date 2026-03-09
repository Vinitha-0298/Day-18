package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cats {
	 static WebDriver driver;
	
	 public static void main(String[] args) throws InterruptedException {
		Catdemo demo = new Catdemo();
        driver =new ChromeDriver();
        driver.get(demo.url);
        printURL();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        WebElement catclick=driver.findElement(By.xpath(demo.cat));
		catclick.click();
		Thread.sleep(1000);
		printURL();
		
		WebElement persian=driver.findElement(By.linkText(demo.persianid));
		persian.click();
		Thread.sleep(1000);
		printURL();
		
		WebElement returns=driver.findElement(By.id(demo.returntocatsid));
		returns.click();
		Thread.sleep(1000);
		printURL();
	
		WebElement persian1=driver.findElement(By.linkText(demo.persianid));
		persian1.click();
		Thread.sleep(1000);
		
		WebElement addtoCarts=driver.findElement(By.xpath(demo.addtoCart));
		addtoCarts.click();
		Thread.sleep(1000);
		printURL();
		
		WebElement qty=driver.findElement(By.xpath(demo.quantity));
		qty.clear();
		printURL();
		qty.sendKeys("3");
		Thread.sleep(1000);
		
		WebElement update=driver.findElement(By.xpath(demo.updateXpath));
		update.click();
		Thread.sleep(1000);
		printURL();
		
		WebElement checkout=driver.findElement(By.linkText(demo.proceed));
		checkout.click();
		Thread.sleep(1000);
		printURL();
		
		driver.close();
     }
   
	   private static void printURL() {
		   
		  System.out.println(driver.getCurrentUrl());
		
	}

}
