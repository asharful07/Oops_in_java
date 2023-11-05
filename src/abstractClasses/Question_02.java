

// Create an abstract class Bike and extend the another class Honda
package abstractClasses;
abstract class Bike{
    abstract void run();
}
class HondaBike extends Bike{
    void run(){
        System.out.println("Honda is running...");
    }
    public static void main(String[] args){
        Bike obj = new HondaBike();
        obj.run();
    }
}
