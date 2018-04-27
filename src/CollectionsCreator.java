import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsCreator {
    static private String name;
    static private Integer age;
    static private Person person;
    static private Set <Person> persons;

    static Set<Person> collectionscreation () {
        PersonRegistrator secretar = new PersonRegistrator();
        person = secretar.personcreator();
        persons.add(person);
        return persons;
    }
}
