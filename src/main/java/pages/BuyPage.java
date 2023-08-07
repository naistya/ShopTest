package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPage extends BasePage {
    WebDriver driver;
    public BuyPage(WebDriver driver) {super(driver);}

    public BuyPage() {
        super();
    }

    public WebElement backpack (){return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));}
    public WebElement bikelight (){return driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]"));}
    public WebElement bolttshirt (){return driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]"));}
    public WebElement shoppingcart (){return driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]"));}
    public WebElement removebolttshirt (){return driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));}
    public WebElement chechoutshoppingcart (){return driver.findElement(By.id("checkout"));}
    public WebElement continueshoppingcart (){return driver.findElement(By.id("continue"));}
    public WebElement finishshopping (){return driver.findElement(By.id("finish"));}

}


