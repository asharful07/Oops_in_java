

// Create a class of circle with a method to initialize its radius and calculate its area and perimeter

package CreatingObject;
class circle{
    int radius;
    public void area(){
        System.out.println("Area of circle is: "+(3.14f*radius*radius));
    }
    public void perimeter(){
        System.out.println("Perimeter of circle is: "+(2*3.14f*radius));
    }
}
public class Question_05 {
    public static void main(String[] args) {
    circle obj = new circle();
    obj.radius=5;
    obj.area();
    obj.perimeter();

    }
}
