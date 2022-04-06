package amazon;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void issueBadge(Employee[] emp){
        for (int i = 0; i < emp.length; i++){
            System.out.println(emp[i].getName());
        }
    }

    public abstract void printPay(Employee employee);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
