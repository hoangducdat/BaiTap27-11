public class BaiTap12 {
    public static void main(String[] args) {
        String str = "xin chao moi nguoi";
        int [] arr= new int [255];
        for(char ch : str.toCharArray()) {
            arr[ch]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && str != "  ") {
                System.out.println((char)i + ": " + arr[i]);
                arr[i] = 0;
            }
        }
    }
}
