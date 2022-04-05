package polymorphism;

public class Turtle extends Pet{

    public Turtle(String name){
        super(name);
    }

    public void speak(){
        System.out.println("Meep,meep");
    }
}
