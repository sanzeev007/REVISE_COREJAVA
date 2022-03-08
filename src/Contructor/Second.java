package Contructor;

public class Second {
    String name;
    int roll;
    String city;

    Second(String name,int roll,String city){
        this.name=name;
        this.roll=roll;
        this.city=city;
    }

    public static void main(String[] args) {
        Second s1=new Second("MIKE",1001,"pune");
        Second s2=new Second("TYSON",1025,"gujrat");
        Second s3=new Second("JOHN",1036,"pune");
        Second s4=new Second("PRATEEK",1017,"noida");
        Second s5=new Second("MANOJ",1063,"gurugram");
        System.out.println(s1.name+"__"+s1.roll+"__"+s1.city);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
