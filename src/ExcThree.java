public class ExcThree {
    public static void main(String[] args) {
        int soLuongSinhVien = 30;
        String[] danhSach = new String[soLuongSinhVien];
        for (int i = 0; i < soLuongSinhVien; i++) {
            danhSach[i] = "SinhVien " + (i + 1);
        }
        tenTheoThuTuTuDien(danhSach);
        System.out.println("Danh sach theo tu dien la : ");
        for (String hoTen : danhSach) {
            System.out.println(hoTen);
        }
        }
        static void tenTheoThuTuTuDien(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int a = i + 1; a < arr.length; a++) {
                if (arr[i].compareTo(arr[a]) > 0) {
                }
            }
        }
    }
}
