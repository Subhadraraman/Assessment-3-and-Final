package mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SFcreateInd {


	   public static void main(String[] args) {
	        // TODO Auto-generated method stub

		   WebDriverManager.chromedriver().setup();
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://login.salesforce.com");
	        
	        ChromeOptions options=new ChromeOptions();
	        options.addArguments("disable-notifications");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	        driver.findElement(By.id("password")).sendKeys("India$321");
	        driver.findElement(By.id("Login")).click();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        //Thread.sleep(3000);
	        driver.findElement(By.className("slds-icon-waffle")).click();
	        //driver.findElement(By.className("slds-r4")).click();
	        driver.findElement(By.xpath("//button[text()='View All']")).click();
	        driver.findElement(By.xpath("//input[@placeholder='Search apps or items...']")).sendKeys("individuals");
	        driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
	        
	        driver.findElement(By.xpath("//div[@title='New']")).click();
	        driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys("Raman");
	        driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
	        
	        String surName = driver.findElement(By.xpath("//span[@class='uiOutputText']")).getText();
	        Assert.assertEquals(surName, "Raman");
	        System.out.println(surName);
	        
	        driver.findElement(By.xpath("//div[@title='Edit']")).click();
	        
	        driver.findElement(By.xpath("//a[@class='select']")).click();
	        driver.findElement(By.xpath("//a[text()='Mrs.']")).click();
	        //Select drpdownSal = new Select(driver.findElement(By.xpath("//a[@class='select']")));
	        //drpdownSal.selectByVisibleText("Mrs.");
	        
	        driver.findElement(By.xpath("//input[contains(@class,'firstName compoundBorderBottom')]")).sendKeys("Subhadra");
	        driver.findElement(By.xpath("(//span[text()='Save'])[4]")).click();
	        
	        String nameSal = driver.findElement(By.xpath("//span[text()='Mrs. Subhadra Raman']")).getText();
	         Assert.assertEquals(nameSal, "Mrs. Subhadra Raman");
	         System.out.println(nameSal);
	        
	        driver.close();
	        
	    }

	}
