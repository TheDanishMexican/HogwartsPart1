package edu.hogwarts.application;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.House;

import java.util.List;

public class Application {
    static void start() {
        InitializeApp.initializeApp();
    }




    public static void main(String[] args) {
        start();
        List<House> hogwartsHouses = InitializeApp.getHogwartsHouses();
        List<HogwartsPerson> hogwartsPeople = InitializeApp.getHogwartsPeople();

        System.out.println(hogwartsPeople);
    }
}
