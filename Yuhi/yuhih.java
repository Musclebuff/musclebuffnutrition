package musclebuffnutrition.Yuhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class yuhih {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver","D:\\Study\\Selenium Jars and drivers\\Drivers\\chromedriver.exe");
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("desable-notifications");
        WebDriver drvr = new ChromeDriver(opt);
//        drvr.manage().deleteAllCookies();
        drvr.manage().window().maximize();
        drvr.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=610644601173&hvpos=&hvnetw=g&hvrand=5200137554650585959&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061782&hvtargid=kwd-10573980&hydadcr=14453_2316415");
        WebElement search = drvr.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]"));
        search.sendKeys("iphone14");
        search.sendKeys(Keys.ENTER);
//
//        WebElement iphone1 = drvr.findElement(By.xpath("//*[text()='Apple iPhone 14 (128 GB) - Blue'][1]"));
//        iphone1.click();
        WebElement price = drvr.findElement(By.xpath("//*[text()='Apple iPhone 14 (256 GB) - (Product) RED'][1]/parent::a/parent::h2/parent::div/following-sibling::div/descendant::span[@class=\"a-price-whole\"]"));
        System.out.println(price.getText());
    }


}
