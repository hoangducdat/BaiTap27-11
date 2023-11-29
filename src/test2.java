public class test2 {
    public static void main(String[] args) {
        // Khởi tạo biến chuỗi với một đoạn văn bản
        String vanBan = "Hello, this is a sample text with vowels.";

        // Gọi hàm đếm số nguyên âm và in kết quả
        int soLuongNguyenAm = demSoNguyenAm(vanBan);
        System.out.println("So luong nguyen am trong van ban la: " + soLuongNguyenAm);
    }

    // Hàm đếm số nguyên âm trong chuỗi
    static int demSoNguyenAm(String chuoi) {
        int dem = 0;
        chuoi = chuoi.toLowerCase(); // Chuyển đổi tất cả thành chữ thường để kiểm tra nguyên âm

        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            if (kyTu == 'a' || kyTu == 'e' || kyTu == 'i' || kyTu == 'o' || kyTu == 'u') {
                dem++;
            }
        }

        return dem;
    }
}
