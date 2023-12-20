import java.util.*;

public class StudentManagementSystem {
    private List<Student> studentList;

    public StudentManagementSystem() {
        this.studentList = new ArrayList<>();
    }
    public void displayStudentList() {
        System.out.println("Student List:");
        System.out.println("\n");
        for (Student student : studentList) {
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Name: " + student.getName());
            System.out.println("Gender: " + student.getGender());
            System.out.println("Date Of Birth: " + student.getDateOfBirth());
            System.out.println("Address: " + student.getAddress());
            System.out.println("Contact Number: " + student.getNumberPhone());
            System.out.println("----------");
        }
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
    public void addGrade(String studentId, String course, double grade) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                student.getCourses().add(course);
                student.getGrades().put(course, grade);
                break;
            }
        }
    }
    public void displayGrades(String studentId) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println("DIEM CUA  " + studentId + ":");
                for (HashMap.Entry<String, Double> entry : student.getGrades().entrySet()) {
                    System.out.println(entry.getKey() + ": " + entry.getValue());
                }
                break;
            }
        }
    }
    public double calculateAverageGrade(String studentId) {
        double sum = 0;
        int count = 0;
        for (Student student : studentList) {
            if (student.getStudentId().equals(studentId)) {
                for (double grade : student.getGrades().values()) {
                    sum += grade;
                    count++;
                }
                break;
            }
        }
        return count > 0 ? sum / count : 0;
    }
    public void displayHighestGradeStudent() {
        Student highestGradeStudent = null;
        double highestGrade = Double.MIN_VALUE;

        for (Student student : studentList) {
            double averageGrade = calculateAverageGrade(student.getStudentId());
            if (averageGrade > highestGrade) {
                highestGrade = averageGrade;
                highestGradeStudent = student;
            }
        }

        if (highestGradeStudent != null) {
            System.out.println("HOC SINH CO DIEM TRUNG BINH CAO NHAT : ");
            System.out.println("Student ID: " + highestGradeStudent.getStudentId());
            System.out.println("TEM : " + highestGradeStudent.getName());
            System.out.println("DIEM TRUNG BINH: " + highestGrade);
        } else {
            System.out.println("No students found.");
        }
    }
}

