package String_test;

public class ProveImmutable {
    public static void main(String[] args) {
        String s=new String("test");
        s.concat("string");
        System.out.println(s);
    }
}
