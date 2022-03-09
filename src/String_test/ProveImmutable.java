package String_test;

public class ProveImmutable {
    public static void main(String[] args) {
        String s=new String("test");
        String s2="hello";
        s.concat("string");
        System.out.println(s);
    }
}
