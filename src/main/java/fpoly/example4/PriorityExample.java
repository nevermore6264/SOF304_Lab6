package fpoly.example4;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test
    public void register() {
        System.out.println("Register");
    }

    @Test(priority = 2)
    public void sendEmail() {
        System.out.println("sendEmail");
    }

    @Test(priority = 1)
    public void login() {
        System.out.println("login");
    }
}
