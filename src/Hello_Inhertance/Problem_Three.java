package Hello_Inhertance;

public class Problem_Three {
    private int x=50;
    void m22()
    {
        System.out.println(x);
    }
}
 class B3 extends Problem_Three
{

}
class Test3
{
    public static void main(String[] args) {
        Problem_Three p33=new B3();
        p33.m22();

    }

}

