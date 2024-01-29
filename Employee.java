
public class Employee extends Person {
    private String position;
    private double salary;


    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }





    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }


    public double getPaymentamount() {
        return getSalary();
    }


    public String toString() {
        return "Employee: " + super.toString() + " earns " + getPaymentamount() + " tenge";
    }
}