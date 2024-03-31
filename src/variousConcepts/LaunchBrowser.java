package variousConcepts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//What is Java associated with?
//Classes
//Objects

public class LaunchBrowser {

	// What is Class associated with?
	// Statements
	// Variable //Attribute //Field
	// methods

	public static void main(String[] args) throws InterruptedException {

//		Scanner scn = new Scanner(System.in);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium"); //
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[text()='About']")).click();
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
