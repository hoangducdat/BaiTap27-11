public class BaiTap8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("bang cuu chuong " + i + " : ");
            bangCuuChuong(i);
        }
    }

    static int bangCuuChuong(int num) {
        for (int i = 1; i <= 10; i++) {
            int ketQua = num * i;
            System.out.println(num + " * " + i + " = " + ketQua);
        }
        return num;
    }
}
