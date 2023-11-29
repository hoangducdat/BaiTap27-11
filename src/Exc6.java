import java.util.Enumeration;

public class Exc6 {

    public static void main(String[] args) {
        method(3);
    }
    static void method(int num) {
        int factorial = 3;
        for (int index = num ; index < factorial; index++) {
            factorial *=  index;
        }
        System.out.println(factorial );
    }
}

