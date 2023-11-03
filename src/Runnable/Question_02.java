

//Working of Runnable

package Runnable;
class newthread implements Runnable
{
    Thread t;
    newthread()
    {
        t = new Thread(this,"My Thread");
        t.start();
    }
    public void run()
    {
        System.out.println(t.getName());
    }
}
class multithreaded
{
    public static void main(String args[])
    {
        new newthread();
    }
}
