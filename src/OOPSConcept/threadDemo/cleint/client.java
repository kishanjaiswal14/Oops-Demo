package OOPSConcept.threadDemo.cleint;

import OOPSConcept.threadDemo.helloWorld.helloWorld;
import OOPSConcept.threadDemo.threadNumberSystem.NumberSystem;

public class client {
    public static void main(String[] args) {
        helloWorld hello = new helloWorld();
        hello.printHelloWorld();

        for(int i=0; i<100; i++){
            NumberSystem numberSystem = new NumberSystem(i);

            Thread thread = new Thread(numberSystem);

            thread.start();
        }
    }
}
