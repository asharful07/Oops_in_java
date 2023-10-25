


// Create a class circle and use inheritance to create another class cylinder from it

package Inheritance;
class circle{
    void sum(){
        System.out.println("From base class: "+(2+3));
    }
}
class cylinder extends circle{
    void mul(){
        System.out.println("From inherit class: "+(2*3));
    }
}
public class Question_02 {
    public static void main(String[] args) {
    cylinder obj = new cylinder();
    obj.sum();
    obj.mul();
    }
}
