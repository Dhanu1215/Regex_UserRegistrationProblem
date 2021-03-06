import com.blp.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {

    @Test
    public void checkValidName() {
        boolean check = UserRegistration.firstName("Darshana");
        Assert.assertSame(true, check);
    }

    @Test
    public void checkValidName1() {
        boolean check = UserRegistration.lastName("Hakke");
        Assert.assertSame(true, check);
    }
    @Test
    public void checkValidEmail() {
        boolean check = UserRegistration.emailId("abc.xyz@bl.co.in");
        Assert.assertSame(true, check);
    }
    @Test
    public void checkValidMobNumber() {
        boolean check = UserRegistration.mobileNumber("91 9765721521");
        Assert.assertSame(true, check);
    }

    @Test
    public void checkValidPassword() {
        boolean check = UserRegistration.password("Dhan@123");
        Assert.assertSame(true, check);
    }

    @Test
    public void checkValidPassword1() {
        boolean check = UserRegistration.password1("Dhan@123");
        Assert.assertSame(true, check);
    }

    @Test
    public void checkValidPassword2() {
        boolean check = UserRegistration.password2("Dhanuu@1");
        Assert.assertSame(true, check);
    }

    @Test
    public void checkValidPassword3() {
        boolean check = UserRegistration.password3("Dhanuu@1");
        Assert.assertSame(true, check);
    }
}
