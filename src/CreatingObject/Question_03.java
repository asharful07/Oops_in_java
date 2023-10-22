

// Create a class square with method to initialize its side, to calculate its area and perimeter

package CreatingObject;
class square{
    int side;
    public void area(){
        System.out.println("The area of square is: "+(side*side));
    }
    public void perimeter(){
        System.out.println("The perimeter of square is: "+(4*side));
    }
}
public class Question_03 {
    public static void main(String[] args) {
    square obj = new square();
    obj.side = 5;
    obj.area();
    obj.perimeter();
    }
}
