package case_study.common;

import case_study.model.Custumer;

import java.time.LocalDate;
import java.util.Comparator;

public class CustumerSort implements Comparator<Custumer> {
    public LocalDate convertBirth(String birth){
        String[] arrBirth=birth.split("/");
        return LocalDate.of(Integer.parseInt(arrBirth[2]), Integer.parseInt(arrBirth[1]), Integer.parseInt(arrBirth[0]));
    }

    @Override
    public int compare(Custumer o1, Custumer o2) {
        return o1.getName().compareTo(o2.getName()) == 0 ?  convertBirth(o1.getBirth()).compareTo(convertBirth(o2.getBirth())):0;

    }
}
