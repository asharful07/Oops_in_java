package Inheritance;

public class Question_01 {
    public static void main(String[] args) {
        B obj = new B();
        obj.printA();
        obj.printB();
    }
}

//Creating a new class A
class A{
    int a=5;
    void printA(){
        System.out.println(a);
    }
}

//Inherited from class A
class B extends A{
    int b=10;
    void printB(){
        System.out.println(b);
    }
}