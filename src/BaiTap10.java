public class BaiTap10 {
    public static void main(String[] args) {
       String[] vanBan =  {" hello everyone "};
       char char1 = 'a';
       int sum = 0;
       for (String ab : vanBan) {
           for (int i = 0; i < vanBan.length; i++) {
             if (ab.charAt(i) == char1) {
                 sum++;
             }
           }
       }
        System.out.println("sum = " + sum);
    }
}
