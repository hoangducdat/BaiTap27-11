public class BaiTap7 {
    public static void main(String[] args) {
        System.out.println("Hello, tong so nguyen am trong van ban la : ");
        int[] vanBan = {-22,-17,-15,-9,-5,-2,-1};
        int soNguyenAm = demSo(vanBan);
        System.out.println( soNguyenAm + " so " );
    }
    static int demSo(int[] arr) {
        int read = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < 0) {
                read++;
            }
        }
        return read;
    }
}
