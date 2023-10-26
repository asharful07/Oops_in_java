

// Create an abstract class pen with method write(); and refill(); as abstract method and inherit smartPen class

package abstractClasses;
abstract class pen{
    abstract void write();

    abstract void refill();
}
 class smartPen extends pen{
     void write(){
        System.out.println("Writing...");
    }
     void refill(){
         System.out.println("Refilling...");
    }
}
public class Question_01 {
    public static void main(String[] args) {
    smartPen obj = new smartPen();
    obj.write();
    obj.refill();
    }
}
