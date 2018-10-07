package fpoly.example3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamatersTesting {
    @Parameters({"browserName"})
    @Test
    public void open(String browserName) {
        System.out.println("Browser Name : " + browserName);
    }

    @Parameters({"userName","passWord"})
    @Test
    public void login(String userName,String passWord) {
        System.out.println("User Name : " + userName);
        System.out.println("Password : " + passWord);
    }
}
