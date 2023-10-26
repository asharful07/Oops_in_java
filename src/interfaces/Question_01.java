

// Create an interface phone and implement a class smartPhone
package interfaces;
interface phone {
    abstract void ring();

    abstract void calling();

    class smartPhone implements phone{
         public void ring() {
            System.out.println("Ringing....");
        }
         public void calling() {
            System.out.println("Calling.....");
        }
    }
}
public class Question_01 {
    public static void main(String[] args) {
        phone obj= new phone.smartPhone();
        obj.calling();
        obj.ring();
    }
}