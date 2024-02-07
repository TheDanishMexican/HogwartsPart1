package edu.generic;

import edu.hogwarts.data.EmploymentType;

import java.time.LocalDate;

public class Teacher extends Person {
    private EmploymentType employmentType;
    private LocalDate employmentStart;
    private LocalDate employmentEnd;

    public Teacher() {}

    public Teacher(String name, EmploymentType employmentType, LocalDate employmentStart, LocalDate employmentEnd) {
        super(name);
        this.employmentType = employmentType;
        this.employmentStart = employmentStart;
        this.employmentEnd = employmentEnd;
    }


    public EmploymentType getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(EmploymentType employmentType) {
        this.employmentType = employmentType;
    }

    public LocalDate getEmploymentStart() {
        return employmentStart;
    }

    public void setEmploymentStart(LocalDate employmentStart) {
        this.employmentStart = employmentStart;
    }

    public LocalDate getEmploymentEnd() {
        return employmentEnd;
    }

    public void setEmploymentEnd(LocalDate employmentEnd) {
        this.employmentEnd = employmentEnd;
    }

    @Override
    public String toString() {
        String name = getFirstName() + " " + getLastName();
        return "Teacher {" +
                "\n  Name: " + name +
                "\n  Employment Type: " + employmentType +
                "\n  Employment Start: " + employmentStart +
                "\n  Employment End: " + employmentEnd +
                "\n}";
    }


    public static void main(String[] args) {

    }
}
