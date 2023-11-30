package Runnable;

public class Question_04 {

    static class ExampleClass implements Runnable {

        @Override
        public void run() {
            System.out.println("Thread has ended");
        }

        public static void main(String[] args) {
            ExampleClass ex = new ExampleClass();
            Thread t1= new Thread(ex);
            t1.start();
            System.out.println("Hi");
        }
    }
}
