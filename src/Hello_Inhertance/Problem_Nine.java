package Hello_Inhertance;

public class Problem_Nine {
    int x=50;
    //constructor is private so class can not inheritance
    private A(){
        System.out.println(x);
    }
}
class B91 extends Problem_Nine{
    public static void main(String[] args) {
        B91 b91=new B91();
    }
}