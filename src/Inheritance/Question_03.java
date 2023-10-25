


// Create a class rectangle with method area & volume and create another class  from it

package Inheritance;
class rectangle{
    float area(float l,float b){
        return l*b;
    }
    float volume( float l, float b,float h){
        return l*b*h;
    }
}
class square extends rectangle{

}
public class Question_03 {
    public static void main(String[] args) {
    square obj = new square();
        System.out.println("Area is: "+obj.area(2,3));
        System.out.println("Volume is: "+obj.volume(2,3,4));
    }
}
