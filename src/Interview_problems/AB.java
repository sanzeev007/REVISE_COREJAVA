package Interview_problems;


import java.io.IOException;

public class AB {
        void method() throws IOException {
            System.out.println("A");
        }
        }
        class B extends AB {
        void method()
        {
            System.out.println("B");
        }
        public static void main(String[] args)
        {
            AB a = new B();
            try {
                a.method();
            } catch (IOException e) {
            e.printStackTrace();
        }
        }
    }


