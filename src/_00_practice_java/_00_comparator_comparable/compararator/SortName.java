package _00_practice_java._00_comparator_comparable.compararator;

import java.util.Comparator;

public class SortName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
