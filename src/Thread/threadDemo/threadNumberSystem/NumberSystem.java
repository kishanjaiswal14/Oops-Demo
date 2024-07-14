package Thread.threadDemo.threadNumberSystem;

public class NumberSystem implements Runnable{
    private int number;

    public NumberSystem(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println( number + "thread name : " + Thread.currentThread().getName());
    }
}
