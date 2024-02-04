package edu.hogwarts;

public class Student extends Person {
    private int enrollmentYear;
    private int graduationYear;
    private boolean graduated;

    public Student() {}

    public Student(int enrollmentYear, String firstName, String middleName,
                   String lastName, int graduationYear, boolean graduated) {
        super(firstName, middleName, lastName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public Student(String fullName, int enrollmentYear, int graduationYear, boolean graduated) {
        super(fullName);
        this.enrollmentYear = enrollmentYear;
        this.graduationYear = graduationYear;
        this.graduated = graduated;
    }

    public Student(String fullName) {
        this.setFullName(fullName);
    }

    public void setSchoolYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public int getSchoolYear() {
        return this.enrollmentYear;
    }

    public static void main(String[] args) {

    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public void setGraduated(boolean graduated) {
        this.graduated = graduated;
    }
    @Override
    public String toString() {
        String name = getFirstName() + " " + getLastName();

        return "Object \"Student\":\n{\n" +"Name: "+ name + "EnrollmentYear: " + enrollmentYear + "\nGraduationYear: "
                + graduationYear + "\nGraduated: " + graduated + "\n}";
    }
}
