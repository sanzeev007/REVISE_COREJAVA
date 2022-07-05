package Hello_Inhertance;

public class Problem_Seven {
    void m71()
    {
        System.out.println("M71 in problem seven ");
    }
}
class B71 extends Problem_Seven{
    void m71()
    {
        super.m71();
        System.out.println(" m71 in class B71");
    }
}
class C71 extends B71{
    void m71()
    {
        System.out.println(" m71 in class c71");
        super.m71();
    }
}
class Test71{
    public static void main(String[] args) {
        C71 c71=new C71();
        c71.m71();
    }
}