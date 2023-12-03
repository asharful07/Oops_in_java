

//Example of inheritance


package Inheritance;
class One {
    public void print_geek()
    {
        System.out.println("Asharful");
    }
}
class Two extends One {
    public void print_for() {
        System.out.println("Khan");
    }
}
public class Question_07 {
        public static void main(String[] args)
        {
            Two g = new Two();
            g.print_geek();
            g.print_for();
        }
    }