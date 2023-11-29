public class ExcSix {
    public static void main(String[] args) {
        String str = "chuc moi nguoi ngay moi tot lanh";
        String vanBanDaoNguoc = daoNguoc(str);
        System.out.println("ket qua : " + vanBanDaoNguoc);
    }
    static String daoNguoc(String str) {
        String[] arr = str.split("\\s+");
        for (int i = 0; i < arr.length / 2; i++) {
            String sum = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = sum;
        }
        return String.join(" " ,arr) ;
    }
}
