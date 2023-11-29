public class BaiTap13 {
    public static void main(String[] args) {
        int num = 123456789;
        int sum = 0;
        while (num > 0 ) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("tong cac so la " + sum);
    }
}
