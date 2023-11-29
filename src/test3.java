 import java.util.Scanner;

    public class test3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Nhập mảng chuỗi từ người dùng
            System.out.print("Nhập số lượng chuỗi trong mảng: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau nextInt()

            String[] stringArray = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Nhập chuỗi thứ " + (i + 1) + ": ");
                stringArray[i] = scanner.nextLine();
            }

            // Nhập ký tự cần đếm
            System.out.print("Nhập ký tự cần đếm: ");
            char targetChar = scanner.next().charAt(0);

            // Đếm số lần xuất hiện của ký tự trong mảng chuỗi
            int totalOccurrences = countOccurrences(stringArray, targetChar);

            // In kết quả ra màn hình
            System.out.println("Tổng số lần xuất hiện của ký tự '" + targetChar + "': " + totalOccurrences);
        }

        // Hàm để đếm số lần xuất hiện của ký tự trong mảng chuỗi
        public static int countOccurrences(String[] stringArray, char targetChar) {
            int totalOccurrences = 0;

            for (String str : stringArray) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == targetChar) {
                        totalOccurrences++;
                    }
                }
            }

            return totalOccurrences;
        }
    }
