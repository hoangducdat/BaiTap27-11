public class ToanTuLogic {
    public static void main(String[] args) {
        int human = 16;
        String country = "cong dan VietNam";
        if (human >= 18 && country == "cong dan VietNam") {
            System.out.println("du dieu kien bau cu");
        } else if (human < 18) {
            System.out.println("khong du dieu kien bau cu");
            
        }
    }
}
