package amazon;

public class SalariedEmployee extends Employee implements IPayable {
    private double salary;


    public SalariedEmployee(double salary, String name){
        super(name);
        this.salary=salary;
    }

    @Override
    public void calculatePay() {
        System.out.println(salary);
    }

    @Override
    public void printPay(Employee employee){
        System.out.println("I am a salary employee.");
    }

    @Override
    public void issueBadge(Employee[] emp) {
        super.issueBadge(emp);
    }



    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
