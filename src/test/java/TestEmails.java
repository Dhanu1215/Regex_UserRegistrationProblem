import com.blp.regex.CheckValidEmails;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class TestEmails {

    @Test
    public void checkValidEmail() {
        List<String> emails = new ArrayList<String>();
        emails.add("abc@yahoo.com");
        emails.add("abc-100@yahoo.com");
        emails.add("abc.100@yahoo.com");
        emails.add("abc111@abc.com");
        emails.add("abc-100@abc.net");
        emails.add("abc.100@abc.com.au");
        emails.add("abc@1.com");
        emails.add("abc@gmail.com.com");
        emails.add("abc+100@gmail.com");
        for (String email : emails) {
            boolean check = CheckValidEmails.checkEmails(email);
            Assert.assertSame(true, check);
        }
    }

    @Test
    public void checkValidEmail1() {
        List<String> emails = new ArrayList<String>();
        emails.add("abc");
        emails.add("abc@.com.my");
        emails.add("abc123@gmail.a");
        emails.add("abc123@.com");
        emails.add("abc123@.com.com");
        emails.add(".abc@abc.com");
        emails.add("abc()*@gmail.com");
        emails.add("abc@%*.com");
        emails.add("abc..2002@gmail.com");
        emails.add("abc.@gmail.com");
        emails.add("abc@abc@gmail.com");
        emails.add("abc@gmail.com.1a");
        emails.add("abc@gmail.com.aa.au");
        for (String email : emails) {
            boolean check = CheckValidEmails.checkInvalidEmails(email);
            Assert.assertSame(false, check);
        }
    }
}

