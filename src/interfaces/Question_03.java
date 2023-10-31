

// Working of interface

package interfaces;
interface P
{
    String p = "PPPP";

    String methodP();
}
interface Q extends P
{
    String q = "QQQQ";

    String methodQ();
}
class R implements P, Q
{
    public String methodP()
    {
        return q+p;
    }
    public String methodQ()
    {
        return p+q;
    }
}
public class Question_03
{
    public static void main(String[] args)
    {
        R r = new R();

        System.out.println(r.methodP());

        System.out.println(r.methodQ());
    }
}
