

package abstractClasses;
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("rectangle is running...");
    }
}
class Circle1 extends Shape{
    void draw(){
        System.out.println("Circle is running...");
    }
}

class TestAbstraction1{
    public static void main(String[] args){
        Shape s=new Circle1();
        s.draw();

    }
}
