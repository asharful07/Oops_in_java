

// Create a class Employee and use the getter & setter to set Employee name and id and salary

package Getter_Setter;
class Employee{
    String name;
    int id;
    int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String n){
        name=n;
    }
    public String getname(){
        return name;
    }
    public void setId(int E_id){
        id=E_id;
    }
    public int getId(){
        return id;
    }


}
public class Question_02 {
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.setName("Karan");
        obj.setId(17);
        obj.setSalary(50000);
        System.out.println("The name of Employee is: "+obj.getname());
        System.out.println("THe id of Employee is: "+obj.getId());
        System.out.println("The salary of Employee is: "+obj.getSalary());
    }
}
