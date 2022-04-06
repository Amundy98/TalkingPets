package amazon;

public class Employee extends Person{

    public Employee(String name) {
        super(name);
    }

    @Override
    public void printPay(Employee employee) {
        System.out.println("I am an employee");
    }
}
