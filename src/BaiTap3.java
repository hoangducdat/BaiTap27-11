
public class BaiTap3 {
    public static void main(String[] args) {
        int[] soNguyen = new int[10] ;
        //.1
        for (int i = 0; i < soNguyen.length; i++) {
            System.out.println("phan tu " + i + " = " + soNguyen[i]);
        }
        //.2
        for (int i = 0; i < soNguyen.length; i++) {
            soNguyen[i] = i +1;
        }
    }
}
