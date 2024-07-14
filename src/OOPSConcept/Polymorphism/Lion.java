package OOPSConcept.Polymorphism;

public class Lion extends Animal{

    @Override //optional we write it to show this is an override method
    public void whoAmI(){
        System.out.println("I am a Lion");
    }

    public void speed(){
        System.out.println("Average speed of a Lion");
    }

    public void speed(int speed){
        System.out.println(speed + " is the speed of this Lion");
    }
}
