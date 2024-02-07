package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.List;

public class TeacherController {
    private List<HogwartsPerson> hogwartsTeachers;

    public TeacherController() {}

    public List<HogwartsPerson> getHogwartsTeachers(List<HogwartsPerson> hogwartsTeachers) {
        return hogwartsTeachers;
    }

    public void setHogwartsTeachers(List<HogwartsPerson> hogwartsTeachers) {
        this.hogwartsTeachers = hogwartsTeachers;
    }
}
