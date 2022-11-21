package application.journal;

public class Student {

    private String fullName;
    private String date;
    private int grade;
    private int phoneNumber;
    private String teacher;

    public Student(String fullName, String date, int grade, int phoneNumber, String teacher) {
        this.fullName = fullName;
        this.date = date;
        this.grade = grade;
        this.phoneNumber = phoneNumber;
        this.teacher = teacher;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
