public class ExcTwo {
    public static void main(String[] args) {
        String vanBan = "hello moi nguoi";
        int[] arr = new int[256];
        for (char ab: vanBan.toCharArray()) {
            arr[ab]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && vanBan != " " ) {
                System.out.println((char) i + " : " + arr[i]);
                arr[i] = 0;
            }
        }
    }
}
