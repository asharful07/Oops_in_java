

// Find The Details of students by creating an object

package CreatingObject;
class students{
    String name;
    int roll_no;
    int age;
    public void Details(){
        System.out.println("Name of student is: "+name);
        System.out.println("Roll no of student is: "+roll_no);
        System.out.println("Age of student is: "+age);
    }
}
public class Question_01 {
    public static void main(String[] args) {
        students obj = new students();
        obj.name="Aman";
        obj.roll_no=123;
        obj.age=20;
        obj.Details();
    }
}
