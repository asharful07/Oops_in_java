

// create a base class with a constructor and inherit derived1 & derived2 class with constructor

package Inheritance;
class base{
    base(){
        System.out.println("I am a base class constructor!");
    }
}
class derived1 extends base{
    derived1(){
        System.out.println("I am a derived1 class constructor!");
    }
}
class derived2 extends derived1{
    derived2(){
        System.out.println("I am a derived2 class constructor!");
    }
}
public class Question_04 {
    public static void main(String[] args) {
        derived2 obj = new derived2();


    }
}
