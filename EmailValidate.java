import java.util.regex.Pattern;

/**
 * Validating some sample emails using regular expression(regEx)
 * @author Tushar Akhade
 * @since 28 Jun 2021
 */
public class EmailValidate {
    public static void main(String[] args) {
        String[] validEmailSample = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] invalidEmailSample = {"abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au" };

        System.out.println("Valid email :");
        emailValidate(validEmailSample);
        System.out.println("\nInvalid emails :");
        emailValidate(invalidEmailSample);
    }

    public static void emailValidate(String[] emails) {
        for (String email : emails) {
            System.out.print(Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email) + " ");
        }
    }
}