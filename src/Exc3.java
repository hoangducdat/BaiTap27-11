public class Exc3 {
    public static void main(String[] args) {
        int index = 0;
        int sum = 0;
        while (index < 50) {
            System.out.println(index);
            index += 2;
            if (index % 2 == 0) {
                System.out.println("la so chan");
                sum = sum + index;
            } else if (index % 2 !=0) {
                System.out.println("khong phai so chan");

            }
        }
        System.out.println("tong cac so chan =" + sum);
    }
}
