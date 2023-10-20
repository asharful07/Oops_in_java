

// create a class cylinder and use getter and setter to set its radius and height

package Getter_Setter;
class cylinder{
    int radius;
    int height;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public void setHeight(int h){
        height=h;
    }
    public int getHeight(){
        return height;
    }
}
public class Question_01 {
    public static void main(String[] args) {
    cylinder obj=new cylinder();
    obj.setRadius(5);
    obj.setHeight(10);
        System.out.println("The radius of cylinder is: "+obj.getRadius());
        System.out.println("THe height of cylinder is: "+obj.getHeight());
    }
}
