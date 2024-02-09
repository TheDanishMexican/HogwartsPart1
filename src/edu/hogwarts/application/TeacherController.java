package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.*;

public class TeacherController {
    private Map<Integer, HogwartsPerson> idAndTeacherMap;
    private int nextCount = 1;

    public TeacherController() {
        this.idAndTeacherMap = new HashMap<>();
    }

    public void createTeacher(HogwartsPerson teacher) {
        idAndTeacherMap.put(nextCount, teacher);
//        System.out.println(teacher.getName() + " was added to the Teacher HashMap with ID: " + nextCount);
        nextCount++;
    }

    public HogwartsPerson getTeacher(int id) {
        try {
            HogwartsPerson teacher = idAndTeacherMap.get(id);

            if (teacher != null) {
                System.out.println("Retrieved " + teacher.getName() + " from the HashMap");
                return teacher;
            } else throw new IllegalArgumentException();
        } catch (IllegalArgumentException error) {
            System.out.println("Teacher with ID: " + id + " does not exist.");
            return null;
        }
    }

    public List<HogwartsPerson> getAllTeachers() {
        List<HogwartsPerson> allTeachers = new ArrayList<>();

        for (HogwartsPerson teacher : idAndTeacherMap.values()) {
            allTeachers.add(teacher);
        }

        return allTeachers;
    }

    public void updateTeacher(int id, HogwartsPerson newTeacher) {
        idAndTeacherMap.put(id, newTeacher);
    }

    public void deleteTeacher(int id) {
        System.out.println("Teacher " + getTeacher(id).getName() + " was deleted");
        idAndTeacherMap.remove(id);
    }
}

