package _18_string_regex.practice.practice2;

import java.net.PortUnreachableException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static Pattern patten;
    private static Matcher matcher;
    private static final String EMAIL_REGEX="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public ValidateEmail() {
        patten=Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher=patten.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {

    }
}
