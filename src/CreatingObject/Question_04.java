

// create a class rectangle with method to initialize its length ,breadth,
// and calculate its area and perimeter.

package CreatingObject;
class rectangle{
    int length;
    int breadth;
    public void area(){
        System.out.println("The area of rectangle is: "+ (length*breadth));
    }
    public void perimeter(){
        System.out.println("The perimeter of rectangle is: "+(2*(length+breadth)));
    }
}
public class Question_04 {
    public static void main(String[] args) {
        rectangle obj = new rectangle();
        obj.length = 5;
        obj.breadth = 10;
        obj.area();
        obj.perimeter();
    }
}