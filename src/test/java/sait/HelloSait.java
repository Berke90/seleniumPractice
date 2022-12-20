package sait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloSait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
    }
}
