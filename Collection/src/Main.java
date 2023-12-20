public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Student student1 = new Student("S120", "Nam", "Male", "01/07/2000", "Ha Noi", "1234567890");
        system.addStudent(student1);

        Student student2 = new Student("S123", "Hoa", "Female", "12/4/2000", "Ha Noi", "9876543210");
        system.addStudent(student2);

        system.displayStudentList();  // Hiển thị thông tin sinh viên

        system.addGrade("S120", "Math", 85.5); // Thêm điểm
        system.addGrade("S123", "Math", 87.6); // Thêm điểm
        system.addGrade("S120", "literature", 86.1); // Thêm điểm
        system.addGrade("S123", "literature", 87.2); // Thêm điểm
        system.addGrade("S120", "English", 83.5); // Thêm điểm
        system.addGrade("S123", "English", 81.6); // Thêm điểm





        system.displayGrades("S120"); // Hiển thị điểm
        system.displayGrades("S123"); // Hiển thị điểm

        // Tính trung bình điểm
        System.out.println("Diem Trung binh S120 la : " + system.calculateAverageGrade("S120"));
        System.out.println("Diem Trung binh S123 la : " + system.calculateAverageGrade("S123"));

        System.out.println("\n");
        system.displayHighestGradeStudent(); // Hiển thị sinh viên có điểm trung bình cao nhất
    }
}