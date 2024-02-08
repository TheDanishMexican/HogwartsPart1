package edu.hogwarts.data;

import edu.generic.Student;

import java.util.ArrayList;
import java.util.Objects;

public class HogwartsStudent extends Student implements HogwartsPerson {
    private House house;
    private boolean prefect;
    private ArrayList<String> teams;

    public HogwartsStudent() {}

    public HogwartsStudent(String name, int enrollmentYear, House house, boolean prefect, ArrayList<String> teams, int graduationYear, boolean graduated){
        super(name, enrollmentYear, graduationYear, graduated);
        this.house = house;
        this.prefect = prefect;
        this.teams = teams;
    }

    public House getHouse() {
        return house;
    }

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
        return String.format("\t\t\t\t%-19s | %-17s | %-15s | %-10s | %-46s | %-15s | %s",
                getFullName(),
                getSchoolYear(),
                getHouseName(),
                isPrefect(),
                teams.toString(),
                getSchoolYear(),
                isGraduated()
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
