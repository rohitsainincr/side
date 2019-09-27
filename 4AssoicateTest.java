// Generated by Selenium IDE
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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class 4AssoicateTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void 41LoginPage() {
    driver.get("https://192.168.0.100:8443/index.jsp");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.name("email")).sendKeys("techsale1@salesken.ai");
    driver.findElement(By.name("password")).sendKeys("test123");
    driver.findElement(By.cssSelector(".btn")).click();
  }
  @Test
  public void 42Calender() {
    driver.get("https://192.168.0.100:8443/SALES_ASSOCIATE/dashboard.jsp");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.linkText("Calendar")).click();
  }
  @Test
  public void 43Product() {
    driver.get("https://192.168.0.100:8443/SALES_ASSOCIATE/dashboard.jsp");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.linkText("Product")).click();
    driver.findElement(By.id("productExpand_608")).click();
  }
  @Test
  public void 44AddLead() {
    driver.get("https://192.168.0.100:8443/SALES_ASSOCIATE/dashboard.jsp");
    driver.findElement(By.linkText("Leads")).click();
    driver.findElement(By.cssSelector(".btn-danger")).click();
    driver.findElement(By.id("lead_company_name")).click();
    driver.findElement(By.id("lead_company_name")).sendKeys("Micro");
    driver.findElement(By.id("lead_city")).click();
    driver.findElement(By.id("lead_city")).sendKeys("delhi");
    driver.findElement(By.id("lead_country")).sendKeys("India");
    driver.findElement(By.id("lead_state")).click();
    driver.findElement(By.id("lead_state")).sendKeys("karanataka ");
    driver.findElement(By.id("lead_pincode")).click();
    driver.findElement(By.id("lead_pincode")).sendKeys("123");
    driver.findElement(By.cssSelector(".istar_modal-btn-danger")).click();
    driver.findElement(By.cssSelector("#editLeadModel .close > span")).click();
    driver.findElement(By.linkText("Dashboard")).click();
    driver.findElement(By.id("addmorelead")).click();
    driver.findElement(By.name("lead_name")).sendKeys("pavan");
    driver.findElement(By.name("company_name")).sendKeys("micro");
    driver.findElement(By.name("phone_no")).sendKeys("+919568301040");
    driver.findElement(By.name("email")).sendKeys("tech@salesken1.ai");
    driver.findElement(By.name("address")).sendKeys("delhi");
    driver.findElement(By.cssSelector(".istar_lead-submit-btn")).click();
    driver.findElement(By.cssSelector(".swal-button")).click();
  }
  @Test
  public void 45Reports() {
    driver.get("https://192.168.0.100:8443/SALES_ASSOCIATE/dashboard.jsp");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.linkText("Reports")).click();
    driver.findElement(By.id("Statistics-tab")).click();
    driver.findElement(By.id("Analytics-tab")).click();
    driver.findElement(By.id("Productivity-tab")).click();
    driver.findElement(By.id("SignalAnalysis-tab")).click();
    driver.findElement(By.cssSelector(".from_icon")).click();
    driver.findElement(By.linkText("18")).click();
    driver.findElement(By.id("signal-analysis-date2")).click();
    driver.findElement(By.linkText("28")).click();
    driver.findElement(By.cssSelector(".pb-3:nth-child(2) > div")).click();
    driver.findElement(By.cssSelector(".pt-4:nth-child(1) > div")).click();
  }
  @Test
  public void 46Help() {
    driver.get("https://192.168.0.100:8443/SALES_ASSOCIATE/dashboard.jsp");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.cssSelector(".icon-block__text")).click();
    driver.findElement(By.id("help-reasontype")).click();
    driver.findElement(By.id("help-description")).sendKeys("i will call later");
    driver.findElement(By.cssSelector(".istar-btn-primary")).click();
  }
  @Test
  public void 47Notifications() {
    driver.get("https://192.168.0.100:8443/SALES_ASSOCIATE/dashboard.jsp");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.cssSelector(".istar_font-28")).click();
    driver.findElement(By.id("notification_read_more")).click();
  }
  @Test
  public void 48LogOut() {
    driver.get("https://192.168.0.100:8443/auth");
    driver.manage().window().setSize(new Dimension(1280, 728));
    driver.findElement(By.cssSelector(".ml-auto")).click();
    driver.findElement(By.cssSelector(".dropdown-item:nth-child(3)")).click();
  }
}