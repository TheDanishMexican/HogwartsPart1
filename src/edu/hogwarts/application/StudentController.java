package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;

import java.util.*;

public class StudentController {
    private Map<Integer, HogwartsPerson> idAndStudentMap;
    private int nextCount = 1;

    public StudentController() {
        this.idAndStudentMap = new HashMap<>();
    }

    public void createStudent(HogwartsPerson student) {

        idAndStudentMap.put(nextCount, student);

        System.out.println(student.getName() + " was added to the HashMap with ID: " + nextCount);

        nextCount++;
    }

    public HogwartsPerson getStudent(int id) {
        try {
            HogwartsPerson student = idAndStudentMap.get(id);

            if (student != null) {
                System.out.println("Retrieved " + student.getName() + " from the HashMap");

                return student;
            } else throw new IllegalArgumentException();
        } catch (IllegalArgumentException error) {
            System.out.println("Student with ID: " + id + " does not exist.");
            return null;
        }
    }

    public List<HogwartsPerson> getAllStudents() {
        List<HogwartsPerson> allStudents = new ArrayList<>();

        for (HogwartsPerson student : idAndStudentMap.values()) {
            allStudents.add(student);
        }

        return allStudents;
    }

    public void updateStudent(int id, HogwartsPerson newStudent) {
        idAndStudentMap.put(id, newStudent);
    }

    public void deleteStudent(int id) {
        idAndStudentMap.remove(id);
    }
}
