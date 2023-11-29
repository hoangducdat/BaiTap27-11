public class BaiTap6 {
    public static void main(String[] args) {
        int[] soNguyen = {1,3,5,6,12,44,11,22,78};
        int soCanTim = 3;
        int ketQua = linerSearch(soNguyen,soCanTim);
        if (ketQua != -1) {
            System.out.println("so can tim " + soCanTim + " duoc tim thay tai vi tri " + ketQua);
        } else {
            System.out.println("khong tim thay so can tim");
        }
    }
    static int linerSearch(int[] arr, int z) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == z) {
                return index; //. neu tim thay thi tra ve phan tu
            }
        }
        return -1; // neu khong tim thay
    }
}
