public class ExcOne {
    public static void main(String[] args) {
        String str1 = "xin chao, minh la Dat";
        String str2 =  " minh la Dat";
        String kiemtra = nhandoi(str1, str2);
        System.out.println("ket qua la " + kiemtra);
    }
    public static String nhandoi(String str1, String str2) {
        if (str1.contains(str2)) {
            str1 = str1.replace(str2, str2 + str2);
            return str1;
        }else {
            return null;
        }
    }
}
