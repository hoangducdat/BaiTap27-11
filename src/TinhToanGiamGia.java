public class TinhToanGiamGia {
    public static void main(String[] args) {
        double hoadon = 700;
        double voucher = 0 ;
        if (hoadon > 500 ) {
            voucher = hoadon * 0.2;
        } else if (hoadon < 100 ) {
            voucher = hoadon * 0.1;
        }
        double tonghoadon = hoadon - voucher;
        System.out.println("so tien phai thanh toan la: $" + (tonghoadon));
    }
}
