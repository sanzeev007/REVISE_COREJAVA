package Interview_problems;

public class ABC{

    public void display(){
        System.out.println("Class ABC");
    }
}
class XYZ
//public  class XYZ
//only class can be public
{
    public void display()
    {
        System.out.println("Class ABC");
    }
    public static void main(String[] args)
    {  //not correct way to crete object
       // XYZ obj1=new ABC();

        ABC obj1=new ABC();
        obj1.display();

    }
}
