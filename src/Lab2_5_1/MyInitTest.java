package Lab2_5_1;

/**
 * Created by Alex on 22.02.2016.
 */
public class MyInitTest {

        static {
            System.out.println("static initialization block 1");
        }

        static {
            System.out.println("static initialization block 2");
        }

        public int a;

        {
            System.out.println("non-static initialization block 1");
        }

        public int b;
        {
            System.out.println("non-static initialization block 2");
        }

        public MyInitTest (){
            this (0);
            System.out.println("constructor 2");
        }
        public MyInitTest (int b){
            b = 45;
            System.out.println("constructor 1");
        }
}
