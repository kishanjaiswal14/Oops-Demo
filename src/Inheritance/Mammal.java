package Inheritance;

public class Mammal extends Animal{
    public Mammal() {
        //super(); this is calling its parent implicitly, this function calls the parent object
        System.out.println("this is Mammal");
    }
}
