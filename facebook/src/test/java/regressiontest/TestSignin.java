package regressiontest;

import org.testng.annotations.Test;
import regression.Login;

public class TestSignin extends Login {

    public static void validlogin(){
        signin("rabah","111111");

        getScreenshot(driver);
        sleepFor(5);
    }
    @Test
    public static void novalidlogin(){
        signin("rabah","111111");
        getScreenshot(driver);
        sleepFor(5);
    }


}
