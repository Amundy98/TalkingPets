package amazon;

public class HourlyEmployee extends Employee implements IPayable {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee (double hourlyRate, double hoursWorked, String name){
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public void calculatePay() {
        System.out.println(this.getHourlyRate() * this.getHoursWorked());
    }

    @Override
    public void issueBadge(Employee[] emp) {
        super.issueBadge(emp);
    }

    @Override
    public void printPay(Employee employee) {
        System.out.println("I am a hourly employee.");
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


}
