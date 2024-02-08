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

    public String getName() {
        return  getFullName();
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
        return String.format("\t\t\t\t%-19s | %-17s | %-20s | %-20s | %-20s | %s",
                getName(),
                getEmploymentType(),
                getEmploymentStart(),
                getEmploymentEnd(),
                headOfHouse,
                house.getName()
        );
    }


}
