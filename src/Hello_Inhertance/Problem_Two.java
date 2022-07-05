package Hello_Inhertance;

public class Problem_Two {
    void m2()
    {
     System.out.println("M2 in class problem two");
    }
}
class B2 extends Problem_Two
{ void m2()
{
    System.out.println("M2 in class B2");
}
}
class Test2
{
    public static void main(String[] args) {

        B2 b2=new B2();
        b2.m2();

        Problem_Two p2=new Problem_Two();
        p2.m2();

        Problem_Two p3=new B2();
                p3.m2();
    }
}
