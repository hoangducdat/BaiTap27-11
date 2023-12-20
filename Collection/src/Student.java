import java.util.HashMap;
import java.util.HashSet;


public class Student {
    private String studentId;
    private String name;
    private String gender;
    private String dateOfBirth;
    private String address;
    private String numberPhone;
    private HashSet<String> courses;
    private HashMap<String, Double> grades;

    public Student(String studentId, String name, String gender, String dateOfBirth, String address, String numberPhone) {
        this.studentId = studentId;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.numberPhone = numberPhone;
        this.courses = new HashSet<>();
        this.grades = new HashMap<>();
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getAddress() {
        return address;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getNumberPhone() {
        return numberPhone;
    }

    public HashSet<String> getCourses() {
        return courses;
    }

    public HashMap<String, Double> getGrades() {
        return grades;
    }

}
