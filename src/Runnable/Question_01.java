

// print the Hello and Hi continuously using Runnable

package Runnable;
class NewRunnable1 implements Runnable {
    public void run() {
        for(int i=0;i<=20;i++){
            System.out.println("Hello");
        }
    }
}
class NewRunnable2 implements Runnable{
    public void run(){
        for(int i=0;i<=20;i++){
            System.out.println("Hi");
        }
    }
}
public class Question_01 {
    public static void main(String[] args) {
        NewRunnable1 obj1 =new NewRunnable1();
        Thread t1 = new Thread(obj1);
        NewRunnable2 obj2 = new NewRunnable2();
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();

    }
}
