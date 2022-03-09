package Contructor;

public class ConstructorOverload {
    ConstructorOverload(double d)
    {
        this(10);
        System.out.println("double args cons");
    }
    ConstructorOverload(int i){
        this();
        System.out.println("int args constructor");
    }
    ConstructorOverload()
    {
        System.out.println("no args constructor");
    }

    public static void main(String[] args) {
      ConstructorOverload c1=new ConstructorOverload(10.5);
        ConstructorOverload c2=new ConstructorOverload(10);
        ConstructorOverload c3=new ConstructorOverload();
    }
}
