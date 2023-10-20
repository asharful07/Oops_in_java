
// Create a class cellphone with method, print to "ringing..." and "vibrating...."

package CreatingObject;
class cellphone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating....");
    }
}
public class Question_02 {
    public static void main(String[] args) {
    cellphone obj = new cellphone();
    obj.ring();
    obj.vibrate();
    }
}
