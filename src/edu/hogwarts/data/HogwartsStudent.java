package edu.hogwarts.data;

import edu.generic.Student;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Objects;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean prefect;
    private ArrayList<String> teams;

    private LocalDate dateOfBirth;

    public HogwartsStudent() {}

    public HogwartsStudent(LocalDate dateOfBirth, String name, int enrollmentYear, House house, boolean prefect, ArrayList<String> teams, int graduationYear, boolean graduated){
        super(name, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
        this.dateOfBirth = dateOfBirth;
    }
    @Override
    public String getRole() {
        return "Student";
    }
    @Override
    public int getAge() {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the birthdate and current date
        Period period = Period.between(dateOfBirth, currentDate);

        // Extract the years from the period
        return period.getYears();
    }


    public House getHouse() {
        return house;
    }
    @Override
    public String getName() {
        return getFullName();
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public boolean isPrefect() {
        return prefect;
    }

    public void setPrefect(boolean prefect) {
        this.prefect = prefect;
    }

    public ArrayList<String> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<String> teams) {
        this.teams = teams;
    }

    @Override
    public String getHouseName() {
        return house.getName();
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return isPrefect() == that.isPrefect() && Objects.equals(getHouse(), that.getHouse()) && Objects.equals(getTeams(), that.getTeams());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHouse(), isPrefect(), getTeams());
    }
}
