package com.juaracoding.appium.authentications;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.juaracoding.appium.DriverSingleton;
import com.juaracoding.appium.screens.LoginScreen;

import io.appium.java_client.android.AndroidDriver;

public class SignInTest {
  AndroidDriver driver;
  LoginScreen loginScreen;

  @BeforeClass
  public void setup() throws MalformedURLException {
    driver = DriverSingleton.createOrGetDriver();
    loginScreen = new LoginScreen(driver);
  }

  @Test
  public void signInShouldBeSuccess() throws InterruptedException {
    loginScreen.login("standard_user", "secret_sauce");
    Thread.sleep(4000);
  }
}
