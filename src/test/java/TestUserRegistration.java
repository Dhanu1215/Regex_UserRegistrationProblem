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
}
