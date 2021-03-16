package _18_string_regex.practice.practice2;

public class ValidateEmailTest {
    public static ValidateEmail validateEmail;
    public final static String[] valiEmail=new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

    public static void main(String[] args) {
        validateEmail=new ValidateEmail();
        for(String email:valiEmail){
            boolean isvalid = validateEmail.validate(email);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
