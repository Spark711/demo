package com.example.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SampleTest {

    static String url = "https://www.mailtravel.co.uk/";


    public static void main(String args[]) throws Exception{
        System.setProperty("webdriver.chrome.driver", "C:\\SDET\\drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        //Thread.sleep(5000);
        driver.manage().window().fullscreen();
        driver.get(url);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
        Thread.sleep(5000);
        String title= driver.getTitle();
        //Assert.assertTrue(title.equalsIgnoreCase("Home Page | Mail Travel")); // verify the title
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("searchtext_freetext_search_form")).click();
        driver.findElement(By.id("searchtext_freetext_search_form")).sendKeys("India");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='as_searchtext_freetext_search_form']/ul[@id='as_ul']/li[1]/a")).click();
        Thread.sleep(5000);
// Select noOfGuestSelect = new Select(driver.findElement(By.xpath("//*[@id='numAdults-f0050aa159413059b0d39248658bdb50']")));
// noOfGuestSelect.selectByVisibleText("1");
        driver.findElement(By.xpath("(//button//div[contains(text(),'Book Online')])[last()]")).click();
        Thread.sleep(15000);
        Select roomType = new Select(driver.findElement(By.id("room-1673565-numselect")));
        roomType.selectByVisibleText("1");
        Thread.sleep(8000);
        driver.findElement(By.xpath("(//button//div[contains(text(),'Select your room and continue')])[last()]")).click();
        Thread.sleep(5000);
        Select title1Select = new Select(driver.findElement(By.xpath("//*[@id='pax-a-title-1']")));
        Select title2Select = new Select(driver.findElement(By.xpath("//*[@id='pax-a-title-2']")));
        Select dobGuest1DaySelect = new Select(driver.findElement(By.id("pax-a-dobd-1")));
        Select dobGuest1MonthSelect = new Select(driver.findElement(By.id("pax-a-dobm-1")));
        Select dobGuest1YearSelect = new Select(driver.findElement(By.id("pax-a-doby-1")));
        Select dobGuest2DaySelect = new Select(driver.findElement(By.id("pax-a-dobd-2")));
        Select dobGuest2MonthSelect = new Select(driver.findElement(By.id("pax-a-dobm-2")));
        Select dobGuest2YearSelect = new Select(driver.findElement(By.id("pax-a-doby-2")));
        Select hearAboutSelect = new Select(driver.findElement(By.id("contact-hearabout")));
        WebElement fName1 = driver.findElement(By.id("pax-a-first-1"));
        WebElement lName1 = driver.findElement(By.id("pax-a-last-1"));
        WebElement fName2 = driver.findElement(By.id("pax-a-first-2"));
        WebElement lName2 = driver.findElement(By.id("pax-a-last-2"));
        WebElement mobileNumber = driver.findElement(By.id("contact-mobile"));
        WebElement emailAddress = driver.findElement(By.id("contact-email"));
        WebElement addressLine1 = driver.findElement(By.id("contact-address1"));
        WebElement addressLine2 = driver.findElement(By.id("contact-address2"));
        WebElement city = driver.findElement(By.id("contact-city"));
        WebElement postcode = driver.findElement(By.id("contact-postcode"));
        title1Select.selectByVisibleText("Mr");
        fName1.sendKeys("Andrew");
        lName1.sendKeys("Symonds");
        dobGuest1DaySelect.selectByVisibleText("11");
        dobGuest1MonthSelect.selectByVisibleText("January");
        dobGuest1YearSelect.selectByVisibleText("1990");
        title2Select.selectByVisibleText("Mr");
        fName2.sendKeys("Harbhajan");
        lName2.sendKeys("Singh");
        dobGuest2DaySelect.selectByVisibleText("11");
        dobGuest2MonthSelect.selectByVisibleText("August");
        dobGuest2YearSelect.selectByVisibleText("1990");
        mobileNumber.sendKeys("9999998888121");
        emailAddress.sendKeys("SymSingh@gmail.com");
        addressLine1.sendKeys("123 Main St");
        addressLine2.sendKeys("Marque");
        city.sendKeys("Manchester");
        postcode.sendKeys("M2 4WU");
        hearAboutSelect.selectByIndex(2);
        driver.findElement(By.xpath("(//button//div[contains(text(),'Continue')])[last()]")).click();
        Thread.sleep(5000);
        driver.close();

        //Assert.assertTrue(driver.findElement(By.xpath("//*[@id='nbf_product_pricingsummary']//div[contains(text(),'£2,998')]")).getText().equalsIgnoreCase("£2,998"));
// noOfGuestSelect.selectByVisibleText("1");
// WebElement searchToolbarElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='search']")));
// //WebElement searchToolbarElement = driver.findElement(By.id("search"));
// searchToolbarElement.sendKeys("old skool");
// //driver.findElement(By.id("search")).sendKeys("Happiness");
// WebElement searchButtonElement = driver.findElement(By.id("search-icon-legacy"));
// searchButtonElement.click();
// Thread.sleep(5000);
// driver.findElement(By.xpath("//a[@id='video-title']")).click();
// Thread.sleep(120000);

    }

}

