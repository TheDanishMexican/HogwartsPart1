package edu.hogwarts.data;

import edu.generic.Student;

import java.time.LocalDate;
import java.util.ArrayList;

public class YearGroup {
    private int schoolYear;
    private LocalDate beginningOfSchoolYear;
    private ArrayList<Student> students;

    public YearGroup() {}

    public YearGroup(int schoolYear, LocalDate beginningOfSchoolYear, ArrayList<Student> students) {
        this.schoolYear = schoolYear;
        this.beginningOfSchoolYear = beginningOfSchoolYear;
        this.students = students;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public LocalDate getBeginningOfSchoolYear() {
        return beginningOfSchoolYear;
    }

    public void setBeginningOfSchoolYear(LocalDate beginningOfSchoolYear) {
        this.beginningOfSchoolYear = beginningOfSchoolYear;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        String studentNames = "";

        for(Student student : students) {
            String studName = student.getFullName();
            studentNames += studName + ", ";
        }

        return "Year Group:\n" +
                "{" +
                "\nSchool Year: " + schoolYear +
                "\nBeginning of School Year: " + beginningOfSchoolYear +
                "\nStudents: " + studentNames +
                "\n}";
    }

    public static void main(String[] args) {

    }
}
