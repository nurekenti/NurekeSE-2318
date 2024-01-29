
public class Person implements Payable, Comparable<Person> {
    private static int idCounter = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }



    public double getPaymentamount() {
        return 0.0;
    }

    public String getPosition() {
        return "Student";
    }

    public int compareTo(Person other) {
        return Double.compare(this.getPaymentamount(), other.getPaymentamount());
    }

    public String toString() {
        return getPosition() + ": " + getId() + ". " + getName() + " " + getSurname();
    }
}