import com.blp.regex.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class TestUserRegistration {

     @Test
     public void checkValidName(){
      boolean check = UserRegistration.firstName("Darshana");
          Assert.assertSame(true,check);
     }
}
