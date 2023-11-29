import java.util.Random;
public class BaiTap11 {
    public static void main(String[] args) {
        Random num = new Random();
        int nhoNhat = 1;
        int lonNhat = 100;
        int random = num.nextInt(lonNhat - nhoNhat + 1) + nhoNhat;
        System.out.println("Tro choi Doan So bat dau");
        int mayTinh = 79;
        int nguoiChoi = 28;
        System.out.println();
        System.out.println("toi chon so " +nguoiChoi);
        System.out.println();
        System.out.println("ket qua cua tro choi la so " +mayTinh);
        System.out.println();
        if (nguoiChoi < mayTinh) {
            System.out.println("ban da chon sai, so cua ban qua nho");
        } else if (nguoiChoi > mayTinh) {
            System.out.println("ban da chon sai, so cua ban qua lon");
        } else {
            System.out.println("chuc mung, ban da chon dung");
        }
    }
}

