package amazon;

public class Entrepreneur extends Person {
    private int income;

    public Entrepreneur(String name, int income) {
        super(name);
        this.income = income;
    }

   @Override
    public void printPay(Employee employee) {
        System.out.println("I am an entrepreneur and my income is : " + getIncome());
    }


    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }



}
