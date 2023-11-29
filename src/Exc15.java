public class Exc15 {
    public static void main(String[] args) {
        int countDigits = 0;
        int num = 99999;
        while (num > 0) {
            int digit = num % 10;
            countDigits++;
            num = num / 10;
        }
        System.out.println(countDigits);
    }
}
