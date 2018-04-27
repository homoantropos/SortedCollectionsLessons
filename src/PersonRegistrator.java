import java.util.Scanner;

public class PersonRegistrator {

    static private Person person;

    PersonRegistrator () {}

    static Person personcreator () {
        String name = askName();
        Integer age = askAge();
        person = new Person(name, age);
        return person;
    }

    static String askName () {
        String name = ScannerHelper.inputString();
        return name;
    }

    static Integer askAge () {
        Integer age = ScannerHelper.inputInt();
        return age;
    }
}
