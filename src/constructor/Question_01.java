
// using a constructor find the area and perimeter of Rectangle
package constructor;
class rectangle{
    int length;
    int breadth;
   public rectangle(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    public int area(int l,int b){
        return l*b;
    }
    public int perimeter(int l,int b){
        return 2*(l+b);
    }
}
public class Question_01 {
    public static void main(String[] args) {
    rectangle obj = new rectangle(1,4);
        System.out.println(obj.area(2,4));
        System.out.println(obj.perimeter(1,4));
    }
}
