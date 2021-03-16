package case_study.common;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustumerException extends Exception {
    public CustumerException() {
    }

    public CustumerException(String message) {
        super(message);
    }

        public void nameException(String string) throws CustumerException {
            String name_regex = "^([A-Z][]a-z]+\\s{1})+$";
            Pattern pattern = Pattern.compile(name_regex);
            Matcher matcher = pattern.matcher(string);
            boolean check = matcher.matches();
            if (!check) {
                throw new CustumerException("Customer's name is capitalized at the beginning of every word");
            }
        }

        public void mailException(String email) throws CustumerException {
            String email_regex = "^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
            Pattern pattern = Pattern.compile(email_regex);
            Matcher matcher = pattern.matcher(email);
            boolean check = matcher.matches();
            if (!check) {
                throw new CustumerException("Emai invalid!");
            }
        }

        public void GenderException(String gender) throws CustumerException {
            String gender_regex = "^(Male|Female|Unknow)$";
            Pattern pattern = Pattern.compile(gender_regex);
            Matcher matcher = pattern.matcher(gender);
            Boolean check = matcher.matches();
            if (!check) {
                throw new CustumerException("Male or Female or Unknow");
            }
        }

        public void idException(String id) throws CustumerException {
            String id_regex = "^[0-9]{3}\\s[0-9]\\s[0-9]$";
            Pattern pattern = Pattern.compile(id_regex);
            Matcher matcher = pattern.matcher(id);
            boolean check = matcher.matches();
            if (!check) {
                throw new CustumerException("Enter invalid:XXX XXX XXX");
            }
        }

        public void birthException(String string) throws CustumerException {
            String birth_regex = "^[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}$";
            Pattern pattern = Pattern.compile(birth_regex);
            Matcher matcher = pattern.matcher(string);
            boolean check = matcher.matches();
            if (!check) {
                throw new CustumerException("Invalid!");
            }
            String[] arr = string.split("/");
            int day = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int year = Integer.parseInt(arr[2]);
            if (year < 1990 && LocalDate.now().getYear() - year < 18) {
                throw new CustumerException("Invalid!");
            }
            if (month > 12) {
                throw new CustumerException("Month invalid !");
            }
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day > 31) {
                    throw new CustumerException("Day invalid!");
                }
            } else if (month == 2) {
                if (day != 28) {
                    throw new CustumerException("Day invalid!");
                }
            } else {
                if (day > 30) {
                    throw new CustumerException("Day invalid!");
                }
            }

        }

        public void phoneException(String phone) throws CustumerException {
            String phone_regex = "^0[0-9]{9,10}$";
            Pattern pattern = Pattern.compile(phone_regex);
            Matcher matcher = pattern.matcher(phone);
            boolean check = matcher.matches();
            if (!check) {
                throw new CustumerException("Ivalid");
            }
        }
}
