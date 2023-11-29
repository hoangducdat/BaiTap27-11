public class BaiTap14 {
    public static void main(String[] args) {
        //a.
        int[][] maTran = {
                {1, 3, 5},
                {3, 1, 4},
                {2, 4, 8},
        };
        int kichThuoc = maTran.length;
        int duongCheoChinh = 0;
        int duongCheoPhu = 0;
        for (int i =0; i < kichThuoc; i++){
            duongCheoChinh += maTran[i][i];
            duongCheoPhu += maTran[i][kichThuoc - 1 - i];
        }
        System.out.println("ma tran vuong : ");
        printMaTran(maTran);
        System.out.println("tong duong cheo chinh = " + duongCheoChinh);
        System.out.println("tong duong cheo phu = " + duongCheoPhu);
    }
    static void printMaTran(int[][] maTran) {
        for (int[] hang : maTran) {
            for (int phanTu : hang) {
                System.out.println(phanTu + " ");
            }
        }
    }
}
