public class Exc7 {
    public static void main(String[] args) {
        int num = 5678;
        int reversed = 0;
        while (num != 0) {
            int degit = num % 10;
            reversed = reversed * 10 + degit;
            num /= 10;
        }
        System.out.println("so 5678 sau khi dao nguoc la:" + reversed);
    }
}