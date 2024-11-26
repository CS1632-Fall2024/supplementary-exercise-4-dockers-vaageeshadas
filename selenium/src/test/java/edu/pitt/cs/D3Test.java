package edu.pitt.cs;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import static org.hamcrest.MatcherAssert.assertThat;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.*;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeOptions;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST1LINKS() {
    driver.get("http://localhost:8080");
    driver.findElement(By.linkText("Catalog")).click();
    {
      WebElement element = driver.findElement(By.linkText("Catalog"));
      String attribute = element.getAttribute("href");
      vars.put("catalogLink", attribute);
    }
    System.out.println("Catalog link: " + vars.get("catalogLink").toString());
    assertEquals(vars.get("catalogLink").toString(), "http://localhost:8080");
    {
      WebElement element = driver.findElement(By.linkText("Rent-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("rentACatLink", attribute);
    }
    assertEquals(vars.get("rentACatLink").toString(), "http://localhost:8080rent-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Feed-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("feedACatLink", attribute);
    }
    assertEquals(vars.get("feedACatLink").toString(), "http://localhost:8080feed-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Greet-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("greetACatLink", attribute);
    }
    assertEquals(vars.get("greetACatLink").toString(), "http://localhost:8080greet-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("resetLink", attribute);
    }
    assertEquals(vars.get("resetLink").toString(), "http://localhost:8080reset");
  
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      WebElement element = driver.findElement(By.linkText("Catalog"));
      String attribute = element.getAttribute("href");
      vars.put("catalogLink", attribute);
    }
    assertEquals(vars.get("catalogLink").toString(), "http://localhost:8080");
    {
      WebElement element = driver.findElement(By.linkText("Rent-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("rentACatLink", attribute);
    }
    assertEquals(vars.get("rentACatLink").toString(), "http://localhost:8080rent-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Feed-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("feedACatLink", attribute);
    }
    assertEquals(vars.get("feedACatLink").toString(), "http://localhost:8080feed-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Greet-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("greetACatLink", attribute);
    }
    assertEquals(vars.get("greetACatLink").toString(), "http://localhost:8080greet-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("resetLink", attribute);
    }
    assertEquals(vars.get("resetLink").toString(), "http://localhost:8080reset");
      driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      WebElement element = driver.findElement(By.linkText("Catalog"));
      String attribute = element.getAttribute("href");
      vars.put("catalogLink", attribute);
    }
    assertEquals(vars.get("catalogLink").toString(), "http://localhost:8080");
    {
      WebElement element = driver.findElement(By.linkText("Rent-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("rentACatLink", attribute);
    }
    assertEquals(vars.get("rentACatLink").toString(), "http://localhost:8080rent-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Feed-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("feedACatLink", attribute);
    }
    assertEquals(vars.get("feedACatLink").toString(), "http://localhost:8080feed-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Greet-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("greetACatLink", attribute);
    }
    assertEquals(vars.get("greetACatLink").toString(), "http://localhost:8080greet-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("resetLink", attribute);
    }
    assertEquals(vars.get("resetLink").toString(), "http://localhost:8080reset");

    driver.findElement(By.linkText("Greet-A-Cat")).click();
    {
      WebElement element = driver.findElement(By.linkText("Catalog"));
      String attribute = element.getAttribute("href");
      vars.put("catalogLink", attribute);
    }
    assertEquals(vars.get("catalogLink").toString(), "http://localhost:8080");
    {
      WebElement element = driver.findElement(By.linkText("Rent-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("rentACatLink", attribute);
    }
    assertEquals(vars.get("rentACatLink").toString(), "http://localhost:8080rent-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Feed-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("feedACatLink", attribute);
    }
    assertEquals(vars.get("feedACatLink").toString(), "http://localhost:8080feed-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Greet-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("greetACatLink", attribute);
    }
    assertEquals(vars.get("greetACatLink").toString(), "http://localhost:8080greet-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("resetLink", attribute);
    }
    assertEquals(vars.get("resetLink").toString(), "http://localhost:8080reset");
    driver.findElement(By.linkText("Reset")).click();
    {
      WebElement element = driver.findElement(By.linkText("Catalog"));
      String attribute = element.getAttribute("href");
      vars.put("catalogLink", attribute);
    }
    assertEquals(vars.get("catalogLink").toString(), "http://localhost:8080");
    {
      WebElement element = driver.findElement(By.linkText("Rent-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("rentACatLink", attribute);
    }
    assertEquals(vars.get("rentACatLink").toString(), "http://localhost:8080rent-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Feed-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("feedACatLink", attribute);
    }
    assertEquals(vars.get("feedACatLink").toString(), "http://localhost:8080feed-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Greet-A-Cat"));
      String attribute = element.getAttribute("href");
      vars.put("greetACatLink", attribute);
    }
    assertEquals(vars.get("greetACatLink").toString(), "http://localhost:8080greet-a-cat");
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("resetLink", attribute);
    }
    assertEquals(vars.get("resetLink").toString(), "http://localhost:8080reset");

  }

  @Test
  public void tEST3CATALOG() {
    driver.get("https://cs1632.appspot.com");
    driver.findElement(By.linkText("Catalog")).click();
    {
      WebElement element = driver.findElement(By.cssSelector("ol li:nth-child(1) img"));
      String attribute = element.getAttribute("src");
      vars.put("imgSrc1", attribute);
    }
    assertEquals(vars.get("imgSrc1").toString(), "http://localhost:8080images/cat1.jpg");
    {
      WebElement element = driver.findElement(By.cssSelector("ol li:nth-child(3) img"));
      String attribute = element.getAttribute("src");
      vars.put("imgSrc2", attribute);
    }
    assertEquals(vars.get("imgSrc2").toString(), "http://localhost:8080images/cat2.jpg");
    {
      WebElement element = driver.findElement(By.cssSelector("ol li:nth-child(5) img"));
      String attribute = element.getAttribute("src");
      vars.put("imgSrc3", attribute);
    }
    assertEquals(vars.get("imgSrc3").toString(), "http://localhost:8080images/cat3.jpg");
    driver.close();
  }
 
  @Test
  public void tEST4LISTING() {
    driver.get("https://cs1632.appspot.com");
    driver.findElement(By.linkText("Catalog")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.findElement(By.linkText("Reset")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("ID 2. Old Deuteronomy"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    driver.findElement(By.linkText("Catalog")).click();
    assertThat(driver.findElement(By.id("cat-id1")).getText(), is("ID 1. Jennyanydots"));
    assertThat(driver.findElement(By.id("cat-id2")).getText(), is("Rented out"));
    assertThat(driver.findElement(By.id("cat-id3")).getText(), is("ID 3. Mistoffelees"));
    driver.findElement(By.linkText("Reset")).click();
    driver.close();
  }


  @Test
  public void tEST7RETURN() {
    driver.get("http://localhost:8080");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    driver.findElement(By.id("returnID")).click();
    driver.findElement(By.id("returnID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("cat-id2"));
      assert(elements.size() > 0);
    }

    driver.manage().window().setSize(new Dimension(1047, 874));
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("returnID")).click();
    driver.findElement(By.id("returnID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    assertThat(driver.findElement(By.id("returnResult")).getText(), is("Failure!"));
  }


  @Test
  public void tEST2RESET() {
      driver.get("http://localhost:8080");
      driver.findElement(By.linkText("Rent-A-Cat")).click();
      driver.findElement(By.id("rentID")).click();
      driver.findElement(By.id("rentID")).sendKeys("1");
      driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
      driver.findElement(By.id("rentID")).click();
      driver.findElement(By.id("rentID")).click();
      {
        WebElement element = driver.findElement(By.id("rentID"));
        Actions builder = new Actions(driver);
        builder.doubleClick(element).perform();
      }
      driver.findElement(By.id("rentID")).sendKeys("2");
      driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
      driver.findElement(By.id("rentID")).click();
      driver.findElement(By.id("rentID")).sendKeys("3");
      driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
      driver.findElement(By.linkText("Reset")).click();
      {
        List<WebElement> elements = driver.findElements(By.id("cat-id1"));
        assert(elements.size() > 0);
      }
      vars.put("cat1", driver.findElement(By.id("cat-id1")).getText());
      assertEquals(vars.get("cat1").toString(), "ID 1. Jennyanydots");
      {
        List<WebElement> elements = driver.findElements(By.id("cat-id2"));
        assert(elements.size() > 0);
      }
      vars.put("cat2", driver.findElement(By.id("cat-id2")).getText());
      assertEquals(vars.get("cat2").toString(), "ID 2. Old Deuteronomy");
      {
        List<WebElement> elements = driver.findElements(By.id("cat-id3"));
        assert(elements.size() > 0);
      }
      vars.put("cat3", driver.findElement(By.id("cat-id3")).getText());
      assertEquals(vars.get("cat3").toString(), "ID 3. Mistoffelees");

  }

  @Test
  public void tEST5RENTACAT() {
    driver.get("http://localhost:8080");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("rentID"));
      assert(elements.size() > 0);
    }
    {
      WebElement element = driver.findElement(By.id("rentID"));
      String attribute = element.getAttribute("type");
      vars.put("inputType", attribute);
    }
    assertEquals(vars.get("inputType").toString(), "text");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".form-group:nth-child(3) .btn"));
      assert(elements.size() > 0);
    }
    vars.put("labelOfButton", driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).getText());
    assertEquals(vars.get("labelOfButton").toString(), "Rent");


    driver.findElement(By.linkText("Rent-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("returnID"));
      assert(elements.size() > 0);
    }
    {
      WebElement element = driver.findElement(By.id("returnID"));
      String attribute = element.getAttribute("type");
      vars.put("inputType", attribute);
    }
    assertEquals(vars.get("inputType").toString(), "text");
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".form-group:nth-child(4) .btn"));
      assert(elements.size() > 0);
    }
    vars.put("labelOfButton", driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).getText());
    assertEquals(vars.get("labelOfButton").toString(), "Return");

  }
  

  @Test
  public void tEST6RENT() {
    driver.get("http://localhost:8080");
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    driver.findElement(By.id("rentID")).click();
    driver.findElement(By.id("rentID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    driver.findElement(By.id("returnID")).click();
    driver.findElement(By.id("returnID")).sendKeys("2");
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    assertThat(driver.findElement(By.id("returnResult")).getText(), is("Success!"));
  }

  @Test
  public void tEST8FEEDACAT() {
    driver.get("http://localhost:8080");
    driver.manage().window().setSize(new Dimension(784, 816));
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.id("catnips"));
      assert(elements.size() > 0);
    }
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector(".btn"));
      assert(elements.size() > 0);
    }
    driver.close();
  }


  @Test
  public void tEST9FEED() {
    driver.get("http://localhost:8080");
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("9");
    driver.findElement(By.cssSelector(".btn")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'feedResult\' and text()=\'Nom, nom, nom.\']")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'feedResult\' and text()=\'Nom, nom, nom.\']"));
      assert(elements.size() > 0);
    }
    vars.put("feedResult", driver.findElement(By.id("feedResult")).getText());
    assertEquals(vars.get("feedResult").toString(), "Nom, nom, nom.");
    
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("a");
    driver.findElement(By.cssSelector(".btn")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'feedResult\' and text()=\'Cat fight!\']")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'feedResult\' and text()=\'Cat fight!\']"));
      assert(elements.size() > 0);
    }
    vars.put("feedResult", driver.findElement(By.xpath("//*[@id=\'feedResult\' and text()=\'Cat fight!\']")).getText());
    assertEquals(vars.get("feedResult").toString(), "Cat fight!");
  
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    driver.findElement(By.id("catnips")).click();
    driver.findElement(By.id("catnips")).sendKeys("2");
    driver.findElement(By.cssSelector(".btn")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\'feedResult\' and text()=\'Cat fight!\']")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'feedResult\' and text()=\'Cat fight!\']"));
      assert(elements.size() > 0);
    }
    vars.put("feedResult", driver.findElement(By.xpath("//*[@id=\'feedResult\' and text()=\'Cat fight!\']")).getText());
    assertEquals(vars.get("feedResult").toString(), "Cat fight!");
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    driver.get("http://localhost:8080");

    driver.get("http://localhost:8080greet-a-cat/Jennyanydots");
    vars.put("greeting", driver.findElement(By.cssSelector("#greeting > h4")).getText());
    assertEquals(vars.get("greeting").toString(), "Meow! from Jennyanydots.");
  

    driver.get("http://localhost:8080greet-a-cat/bob");
    vars.put("greeting", driver.findElement(By.cssSelector("#greeting > h4")).getText());
    assertEquals(vars.get("greeting").toString(), "bob is not here.");
  
  
  }

  @Test
  public void tEST10GREETACAT() {
    driver.get("http://localhost:8080");
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    {
      List<WebElement> elements = driver.findElements(By.cssSelector("#greeting > h4"));
      assert(elements.size() > 0);
    }
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow!Meow!Meow!"));
    driver.close();
  }

}
