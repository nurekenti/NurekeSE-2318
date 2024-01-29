import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        Employee Nursultan = new Employee("Nursultan", "Zhumagali", "Manager", 37445.78);
        Employee Aldiyar = new Employee("Aldiyar", "Kuandyk", "Designer", 53250.00);
        Student Vladimir = new Student("Vladimir", "Efimov", 2.1);
        Student Aitas = new Student("Aitas", "Zhakhan", 3.3);
        people.add(Nursultan);
        people.add(Aldiyar);
        people.add(Vladimir);
        people.add(Aitas);


        Collections.sort(people);
        printData(people);

    }

    public static void printData(Iterable<Person>people) {
        for (Person person : people) {
            System.out.println(person);
        }
    }
}