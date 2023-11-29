public class BaiTap4 {
    public static void main(String[] args) {
        int[] soNguyen = {1,2,3,4,5,6,7,};
        int tinhTong = tong(soNguyen);
        System.out.println("tong cac so nguyen la :" + tinhTong );
    }
    static int tong(int[] arr) {
        int tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
    }
    return tong;
    }
}
