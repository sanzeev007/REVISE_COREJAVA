package Contructor;

import java.io.IOException;

public class ConsException {
    ConsException()throws IOException
    {
        System.out.println("parent");
    }

}
class Child extends ConsException
{
    Child() throws Exception{
        super();
        System.out.println("child case");
    }

    public static void main(String[] args) {
        System.out.println("handling exception in constructor");
    }
}
