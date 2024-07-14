package Inheritance;

public class Client {
    public static void main(String[] args) {
        demoInheritance();
    }

    private static void demoInheritance() {
        Lion lion = new Lion();
        System.out.println("This is CONSTRUCTOR CHAINING: child class constructor calling " +
                "parents class constructor IMPLICITLY");
    }
}
