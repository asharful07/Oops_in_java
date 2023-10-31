

//Working of interface

package interfaces;
interface A
{
    void myMethod();
}
class B
{
    public void myMethod()
    {
        System.out.println("My Method is running...");
    }
}
class C extends B implements A
{

}
class Question_02
{
    public static void main(String[] args)
    {
        A a = new C();
        a.myMethod();
    }
}
