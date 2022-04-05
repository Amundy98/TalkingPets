package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Pet {
    Scanner myObj = new Scanner(System.in);
    ArrayList<String> nameList = new ArrayList<String>();

    private int numberOfPets;
    private String name;
    private String petType;


    public Pet(String namePet){
        this.name=namePet;

    }


    public void petCheck() {
        for (int i = 0; i <3; i++){
            System.out.println("How many pets do you have?");
            this.numberOfPets = myObj.nextInt();
            myObj.nextLine();

            System.out.println("What kind of pet do you have?");
            this.petType= myObj.nextLine();

            System.out.println("What is your pet name?");
            this.name = myObj.nextLine();

            System.out.println("Number of pets: " + numberOfPets);
            System.out.println("Pet type: " + petType);
            System.out.println("Pet name: " + name);

            if (this.name.equals("")){
                nameList.add(this.name);
                System.out.println("Name added: " + this.name);
            }

        }
        for (String i:nameList
             ) {
            System.out.println();
        }
    }


    public abstract void speak();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}






