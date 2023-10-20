
// Print the details of students by creating an object

package CreatingObject;
class student{
    String name;
    int roll_no;
    int age;
    public void details(){
        System.out.println("Name of student is: "+name);
        System.out.println("Roll no of student is: "+roll_no);
        System.out.println("Age of student is: "+age);
    }
}
public class Question_01 {
    public static void main(String[] args) {
        student obj=new student();
        obj.name= "Rahul";
        obj.roll_no=10;
        obj.age=20;
        obj.details();


    }
}
