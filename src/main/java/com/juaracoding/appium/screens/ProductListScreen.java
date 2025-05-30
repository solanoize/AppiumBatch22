package com.juaracoding.appium.screens;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ProductListScreen {
  private AndroidDriver driver;

  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"]")
  private List<WebElement> cartButtons;

  @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
  private WebElement title;

  @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"][1]")
  private WebElement cartButton1;

  @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"1\"]")
  private WebElement cartCount;

  public ProductListScreen(AndroidDriver androidDriver) {
    driver = androidDriver;
    PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
  }

  public String getTitle() {
    return title.getText();
  }

  public String getCartCount() {
    return cartCount.getText();
  }

  public void addToCartProduct1() {
    cartButton1.click();
  }

  public void addToCartProducts() throws InterruptedException {
    Thread.sleep(1000);
    System.out.println("Size " + cartButtons.size());
    for (WebElement cartButton : cartButtons) {
      cartButton.click();
      System.out.println("test test test");
      Thread.sleep(1000);
    }
  }
}
