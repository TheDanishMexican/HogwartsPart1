package edu.hogwarts.data;

import java.util.ArrayList;
import java.util.Arrays;

public class House {
    private String name;
    private String founder;
    private ArrayList<String> colors;

    public House() {}

    public House(String name, String founder, ArrayList<String> colors) {
        try {
            validateHouseName(name);
            this.name = name;
            this.founder = founder;
            this.colors = colors;
        } catch (RuntimeException error) {
            System.out.println("Error in House constructor: " + error.getMessage());
        }
    }

    private void validateHouseName(String name) {
        String[] allowedHouseNames = {"Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff"};

        for(String house : allowedHouseNames) {
            if(name.equals(house)) {
                return;
            }
        }
        throw new RuntimeException("Incorrect house name. The options are:\nGryffindor, Ravenclaw, Slytherin, Hufflepuff");
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    //I am taking the varArgs from String... converting them to a List<String>
    // by using the Array method .asList() and then using the .addAll() method
    // from ArrayList to add it to the ArrayList colors.
    public void setColors(String... newColors) {
        colors.clear();
        colors.addAll(Arrays.asList(newColors));
    }

    public String getFounder() {
        return founder;
    }

    public void setFounder(String founder) {
        this.founder = founder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            validateHouseName(name);
            this.name = name;
        } catch (RuntimeException error) {
            System.out.println("Error in SetName: " + error.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Object \"House\":\n{\nName: " + this.name +
                "\nFounder: " + this.founder +
                "\nColors: " + colors.toString() + "\n}";
    }

    public static void main(String[] args) {

    }
}
