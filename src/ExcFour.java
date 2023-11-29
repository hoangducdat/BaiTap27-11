public class ExcFour {
    public static void main(String[] args) {
        String arr = " minh      la nguoi " +
                "  lap trinh java ";
        int soTu = demSoTu(arr);
        System.out.println("so tu trong xau la : " + soTu);
    }
    static int demSoTu(String str ) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] sum = str.trim().split("\\s+");
        return sum.length;
        }
}

