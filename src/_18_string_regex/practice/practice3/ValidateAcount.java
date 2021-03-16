package _18_string_regex.practice.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateAcount {
    private final static String ACOUNT_REGE="^[_a-z0-9]{6,}$";

    public ValidateAcount() {
    }
    public static Boolean validateEmail(String email){
        Pattern pattern=Pattern.compile(ACOUNT_REGE);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }
}
