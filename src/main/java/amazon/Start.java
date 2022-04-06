package amazon;

public class Start {
    public static void main(String[] args) {
        Employee frankie = new Employee("frankie");  /* Creating  three Employee object */
        Employee beverly = new Employee("beverly");
        Employee maze = new Employee("maze");

        Employee[] emps = new Employee[3];  // We make an array and fill it with the employee objects
        emps[0] = frankie;
        emps[1] = beverly;
        emps[2] = maze;

        Employee DrMundy = new Employee("DrMundy"); // Dr. Mundy object is used to call issueBadges()
        DrMundy.issueBadge(emps); // prints out array of employees

        HourlyEmployee blueCollar = new HourlyEmployee(25.00, 20,"cindy");
        blueCollar.calculatePay();

        SalariedEmployee whiteCollar = new SalariedEmployee(75000.00, "sally");
        whiteCollar.calculatePay();

        System.out.println("Here I am");
        maze.printPay(maze);

//        Entrepreneur bezos = new Entrepreneur("bob", 7500);
//        bezos.printPay(bezos);



    }
}
