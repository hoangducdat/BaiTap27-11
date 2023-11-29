public class Exc13 {
    public static void main(String[] args) {
        int point = 90;
        switch (point) {
            case 10,20 : {
                System.out.println("loai F");
                break;
            }
            case 30,40,50 : {
                System.out.println("loai D");
                break;
            }
            case 60,70 : {
                System.out.println("loai C");
                break;
            }
            case 80 : {
                System.out.println("loai B");
                break;
            }
            case 90,100 : {
                System.out.println("loai A");
                break;
            }
        }
    }
}
