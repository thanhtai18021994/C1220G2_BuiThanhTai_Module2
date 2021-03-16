package case_study.common;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceException extends Exception {
    public ServiceException(String message) {
        super(message);
    }

    public void checkString(String name, String regex) throws ServiceException {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean check = matcher.matches();
        if (!check) {
            throw new ServiceException("Invalid");
        }
    }
    public void checkArea(double area) throws ServiceException {
      if(area<30){
          throw new ServiceException("Invalid");
      }
    }
    public void checkPrice(double price) throws ServiceException {
        if(price<0){
            throw new ServiceException("Invalid");
        }
    }
    public void checkPeopleInRoom(byte number) throws ServiceException {
        if(number<0&&number>20){
            throw new ServiceException("Invalid");
        }
    }
    public void checkFreeService(String freeService) throws ServiceException {
        if(!(freeService == "massage" || freeService == "karaoke" || freeService == "car" || freeService == "food" || freeService == "drink")){
            throw new ServiceException("Invalid");
        }
    }
    public void checkDateRent(int day) throws ServiceException {
        if(day<0){
            throw new ServiceException("Invalid");
        }
    }

}
