public class BaiTap2 {
    // 1.
    public static void main(String[] args) {
        int n = 10;
        int giaiThua = 1;
        for (int index = 1; index <= 10; index++) {
            giaiThua *= index;
        }
        System.out.println("giai thua cua n la: " + giaiThua);

        // 2.
        int tich = 1;
        for (int index = 1; index <= n; index++) {
            tich *= index;
        }
        System.out.println("giai thua cua n la" + tich);
    }
}


