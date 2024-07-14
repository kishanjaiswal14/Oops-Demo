package OOPSConcept.Polymorphism;

public class Client {
    public static void main(String[] args) {
        Lion lion = new Lion();

        //Method Overloading
        lion.speed();
        lion.speed(10);

        //Method Overriding
        Animal animal = new Lion();
        //Lion lion2 = new Animal(); //cant do this
        animal.whoAmI();
    }
}
