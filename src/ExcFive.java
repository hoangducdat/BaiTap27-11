public class ExcFive {
    public static void main(String[] args) {
        String arr = "minh ten la x";
        char kiTu = 'x';
        int viTri = canTim(arr, kiTu);
        if (viTri == -1) {
            System.out.println("khong xuat hien");
        } else {
            System.out.println("ki tu " + kiTu + " xuat hien o vi tri " + viTri);
        }
    }
    static int canTim(String arr, char a ) {
        int viTri = -1;
        for (int i = arr.length() - 1; i >= 0; i--) {
            if (arr.charAt(i) == a) {
                viTri = i;
                break;
            }
        }
        return viTri;
    }
}
