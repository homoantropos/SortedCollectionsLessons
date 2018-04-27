import jdk.nashorn.api.tree.Tree;

import java.util.TreeSet;
import java.util.*;

public class Main {
    public static void main (String[] args) {

        Integer howMuch = ScannerHelper.inputInt();

        Comparator<Person> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());

        TreeSet<Person> persons = new TreeSet(pcomp);
        for (int i=0; i<=howMuch; i++) {
            String name = ScannerHelper.inputString();
            Integer age = ScannerHelper.inputInt();
            persons.add(new Person(name, age));
        }

        Iterator iterator = persons.iterator();
        while (iterator.hasNext()) {
         Person person = (Person) iterator.next();
         System.out.println(person.toString());
        }
    }
}
