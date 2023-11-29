public class Exc10 {
    public static void main(String[] args) {
        System.out.println("10 so dau cua bang fibonacci la: ");
        for (int index = 0; index < 10; index++) {
            int num = fibonacci(index);
            System.out.println("fibonacci" + " ");
            System.out.println(num);
        }
    }
    public static int fibonacci(int number) {
        if (number < 0) {
            return -1;
        } else if (number == 0 || number ==1 ) {
            return number;
        }else {
            return fibonacci(number - 1) + fibonacci(number - 2) ;
        }
    }
}
