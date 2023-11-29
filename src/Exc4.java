public class Exc4 {

    static void method(int num1) {
        int index = 1;
        do {
            System.out.println((index * num1) + " ");
            index++;
        }
        while (index <= 10);
    }

    public static void main(String[] args) {
        method(3);
    }
}