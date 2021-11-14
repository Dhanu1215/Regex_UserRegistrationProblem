import com.blp.regex.CheckValidEmails;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TestEmails {

    @Test
    public void checkValidEmail() {

        boolean check = CheckValidEmails.checkEmails();
        Assert.assertSame(true, check);
    }

    @Test
    public void checkValidEmail1() {

        boolean check = CheckValidEmails.checkInvalidEmails();
        Assert.assertSame(false, check);
    }
}

