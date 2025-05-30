package com.juaracoding.appium.listeners;

import java.net.MalformedURLException;
import java.time.Duration;

// import org.openqa.selenium.WebDriver;
import org.testng.IExecutionListener;

import com.juaracoding.appium.DriverSingleton;
import com.juaracoding.appium.utils.EmailSender;

import io.appium.java_client.android.AndroidDriver;

// import com.juaracoding.test.DriverSingleton;

public class Hook implements IExecutionListener {
  public static AndroidDriver driver;

  @Override
  public void onExecutionStart() {
    System.err.println("TestNG is commencing execution");
    try {
      driver = DriverSingleton.createOrGetDriver();

      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.hideKeyboard();
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void onExecutionFinish() {
    System.err.println("TestNG is finished execution");
    DriverSingleton.quitDriver();
    EmailSender.send();
  }
}
