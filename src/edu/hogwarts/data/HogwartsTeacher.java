package edu.hogwarts.data;

import edu.generic.Teacher;

import java.time.LocalDate;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    House house;
    boolean headOfHouse;

    public HogwartsTeacher() {}

    public HogwartsTeacher(String name, House house, boolean headOfHouse, EmploymentType employmentType,
                           LocalDate employmentStart, LocalDate employmentEnd) {

        super(name, employmentType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
    }

    public String getHouseName() {
        return house.getName();
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isHeadOfHouse() {
        return headOfHouse;
    }

    public void setHeadOfHouse(boolean headOfHouse) {
        this.headOfHouse = headOfHouse;
    }

    @Override
    public String toString() {
        String name = getFirstName() + " " + getLastName();
        return "\nHogwarts teacher: {" +
                "\n  Name: " + name +
                "\n  Employment Type: " + getEmploymentType() +
                "\n  Employment Start: " + getEmploymentStart() +
                "\n  Employment End: " + getEmploymentEnd() +
                "\n  Head of House: " + headOfHouse +
                "\n  House: " + house.getName() +
                "\n}";
    }
}
