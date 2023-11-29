public class BaiTap5 {
    public static void main(String[] args) {
        int[] soNguyen = {3, 1, 4, 6, 2, 45, 25, 9};
        int giaTri1 = toiThieu(soNguyen);
        int giaTri2 = toiDa(soNguyen);
        System.out.println("gia tri toi thieu la " + giaTri1);
        System.out.println("gia tri toi da la " + giaTri2);
    }

    static int toiThieu(int[] arr) {
        int giaTri1 = arr[0]; // coi nhu 0 la gia tri nho nhat
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < giaTri1) {
                giaTri1 = arr[i];
            }
        }
        return giaTri1;
    }
    static int toiDa(int[] arr) {
        int giaTri2 = arr[0]; // coi nhu 0 la gia tri lon nhat
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > giaTri2) {
                giaTri2 = arr[i];
            }
        }
        return giaTri2;
    }
}

