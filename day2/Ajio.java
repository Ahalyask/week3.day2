package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("searchVal")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		String noItems = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Total number of items : "+noItems);
		List<WebElement> brandnames = driver.findElements(By.xpath("//div[@class='brand']"));
		System.out.println(" Size of Brands :" + brandnames.size());
		System.out.println("Brand Names are:");
		for(WebElement webele:brandnames) {
			String brandname = webele.getText();
			System.out.println(brandname);
		}
		List<WebElement> bagnames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		System.out.println(" Size of Bag Names :" + bagnames.size());
		System.out.println("Bag Names are:");
		for(WebElement webele : bagnames) {
			String bagname = webele.getText();			
			System.out.println(bagname);
		}
	}

}
