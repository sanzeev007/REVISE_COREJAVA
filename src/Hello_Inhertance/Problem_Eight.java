package Hello_Inhertance;
//class declared with final can not extended
final class Problem_Eight {
void m81()
{
    System.out.println(" m81 in problem eight");
}
}
class B81 extends Problem_Eight{
    public static void main(String[] args) {
        B81 b81=new B81();
    }
}