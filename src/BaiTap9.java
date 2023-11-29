
public class BaiTap9 {
    public static void main(String[] args) {
        int[] soNguyen = {1,3,5,6,9,11};
        for (int i = 0; i < soNguyen.length / 2; i++) {
            int sum = soNguyen[i];
            soNguyen[i] = soNguyen[soNguyen.length - 1 - i];
            soNguyen[soNguyen.length - 1 - i] = sum;
        }
        for (int element : soNguyen) {
            System.out.println(element + " ");
        }
    }
}
