

// print the Good HEllO and Hi continuously

package Threads;
class NewThread1 extends Thread{
    public void run(){
        for (int i=0;i<=20;i++){
                System.out.println("Hello");
        }
    }
}
class NewThread2 extends Thread{
    public void run(){
        for (int i=0; i<=20;i++){
            System.out.println("Hi");
        }
    }
}
public class Question_01 {
    public static void main(String[] args) {
      NewThread1 obj1 =new NewThread1();
      NewThread2 obj2 =new NewThread2();
      obj1.start();
      obj2.start();
    }
}
