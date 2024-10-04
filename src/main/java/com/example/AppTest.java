package com.example;

public import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testApp() {
    Application myApp = new Application();
    String result = myApp.getStatus();
    assertEquals("OK", result);
  }
}
 AppTest {
    
}