package edu.hogwarts;

import java.util.Arrays;
import java.util.ArrayList;

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
        String houseInfo = (house != null) ? "House: " + house.getName() : "No House Assigned";
        String prefectInfo = "Prefect: " + prefect;
        String teamsInfo = "Teams: " + teams.toString();
        String name = "Name: " + getFirstName() + " " + getLastName();

        return "Object \"HogwartsStudent\":\n{\n" +
                name + "\n" +
                houseInfo + "\n" +
                prefectInfo + "\n" +
                teamsInfo + "\n}";
    }

    public static void main(String[] args) {

    }
}