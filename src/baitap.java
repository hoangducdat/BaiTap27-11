public class BaiTap {
    public static void main(String[] args) {
        double a = 2;
        double b = 1;
        double c = 3;
        double delta = (b*b) - (4*a*c);
        Double x = null;
        double x1 = -b / (2*a);
        double x2 = (-b + Math.sqrt(delta)) / (2*a);
        double x3 = (-b - Math.sqrt(delta)) / (2*a);
        if (delta < 0) {
            System.out.println("Phuong trinh vo nghiem x =" + x);
        } else if (delta == 0) {
            System.out.println("Phuong trinh co nghiem x =" + x1);
        } else {
            System.out.println("Phuong trinh co 2 nghiem phan biet x2 =" + x2 + " va x3 =" + x3);
        }
    }
}
