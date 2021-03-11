package _00_practice_java._00_comparator_comparable.compararator;

import java.util.Comparator;

public class SortID implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getId()-o2.getId();
    }
}
