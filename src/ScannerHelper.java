import java.util.Scanner;

public class ScannerHelper {
    static private Scanner inPut = new Scanner (System.in);
    static private String name;
    static private Integer age;

    ScannerHelper () {}

    public String getName() {
        return name;
    }

    static public String inputString() {
        System.out.println("Ім'я:");
        name = inPut.nextLine();
        return name;
    }
    static public Integer inputInt() {
        System.out.println("Число:");
        age = Integer.parseInt(inPut.nextLine());
        return age;
    }

}
