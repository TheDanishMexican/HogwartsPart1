package edu.hogwarts.data;

import edu.generic.Teacher;

import java.time.LocalDate;
import java.time.Period;

public class HogwartsTeacher extends Teacher implements HogwartsPerson {
    House house;
    boolean headOfHouse;

    private LocalDate dateOfBirth;

    public HogwartsTeacher() {}

    public HogwartsTeacher(LocalDate dateOfBirth, String name, House house, boolean headOfHouse, EmploymentType employmentType,
                           LocalDate employmentStart, LocalDate employmentEnd) {

        super(name, employmentType, employmentStart, employmentEnd);
        this.house = house;
        this.headOfHouse = headOfHouse;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String getRole() {
        return "Teacher";
    }

    public int getAge() {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and current date
        Period period = Period.between(dateOfBirth, currentDate);

        // Extract the years from the period
        return period.getYears();
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
        return  String.format("%20s \t\t\t\t| %-17s | %-15s | %-10s | %-46s | %-15s |\n",
                getFirstName(),
                getMiddleName(),
                getLastName(),
                getAge(),
                getHouseName(),
                getRole()
        );
    }


}
