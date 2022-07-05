package Hello_Inhertance;

public class Problem_One
{
    int x=20;
}
class B1 extends Problem_One
{
    int x=32;
}
class Test1
{
    public static void main(String[] args) {
        B1 b=new B1();
        System.out.println(b.x);

        Problem_One one=new Problem_One();
        System.out.println(one.x);

        Problem_One two=new B1();
        System.out.println(two.x);

    }
}