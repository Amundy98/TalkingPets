package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pet {
    Scanner myObj = new Scanner(System.in);
    ArrayList<String> nameList = new ArrayList<String>();
    ArrayList<String> typeList = new ArrayList<String>();

    private int numberOfPets;
    private String name;
    private String petType;
//    public Cat myCat = new Cat("");
//    public Dog myDog = new Dog("");
//    public Turtle myTurtle = new Turtle("");

    public Pet(String namePet){
        this.name=namePet;

    }



    public void petCheck() {

        System.out.println("How many pets do you have?");
        this.numberOfPets = myObj.nextInt();
        myObj.nextLine();

        for (int i = 0; i < numberOfPets; i++) {

            System.out.println("What is the type of pet: ?");
            this.petType = myObj.nextLine();
            typeList.add(petType);

            System.out.println("What is your pet name?");
            this.name = myObj.nextLine();
            nameList.add(name);

            if (petType.equalsIgnoreCase("cat")) {
                Cat myCat = new Cat(name);
                myCat.speak();
            } else if(petType.equalsIgnoreCase("dog")){
                Dog myDog = new Dog(name);
                myDog.speak();
            } else if(petType.equalsIgnoreCase("turtle")){
                Turtle myTurtle = new Turtle(name);
                myTurtle.speak();
            } else {
                System.out.println("Invalid entry.");
            }
        }
        System.out.println("Number of pets: " + numberOfPets);
        System.out.println("Pet type: " + typeList);
        System.out.println("Pet name: " + nameList);

    }





    public abstract void speak();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}






