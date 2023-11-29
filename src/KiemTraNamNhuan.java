public class KiemTraNamNhuan {
    public static void main(String[] args) {
        int year = 2030;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("la nam nhuan");
        } else {
            System.out.println("khong phai la nam nhuan");
        }
    }
}
