package Interview_problems;

public class One {

    public void method1(Object obj){
        System.out.println("Object method");
    }
    public void method1(String str){
        System.out.println("String method");
    }

    public static void main(String[] args){
        One one=new One();
        one.method1(new Object());
        one.method1("Ashish");
        one.method1(null);
    }
}
