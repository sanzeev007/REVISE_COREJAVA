package Hello_Inhertance;

public class Problem_Five {
    void m51()
    {
        System.out.println("M51 in problem five");
    }
}
class B51 extends Problem_Five
{
    void m51()
    {
        System.out.println("M51 in class B51");
    }
}
class C51 extends B51
{
    void m51()
    {
        System.out.println("M51 in class C51");
    }
}
class Test5
{
    public static void main(String[] args) {
        C51 c51=new C51();
        c51.m51();
    }
}