package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsPerson;

import java.util.*;

public class StudentController {
    private List<HogwartsPerson> hogwartsStudents;
    private int nextStudentId;
    private Map<Integer, HogwartsPerson> idAndStudentMap;
    private List<HogwartsPerson> students;

    public StudentController() {
        this.hogwartsStudents = new ArrayList<>();
        this.nextStudentId = 1;
        this.idAndStudentMap = new HashMap<>();
        this.students = new ArrayList<>();
    }

    public void createStudent(HogwartsPerson student) {

        students.add(student);

//        System.out.println("Student: " + student + " was added to the HashMap with ID: " + nextStudentId);

//        nextStudentId++;
    }

    public void getStudent(int id) {
        System.out.println(students.get(id));
    }

    public List<HogwartsPerson> getHogwartsStudents(List<HogwartsPerson> hogwartsStudents) {
        return hogwartsStudents;
    }

    public void setHogwartsStudents(List<HogwartsPerson> hogwartsStudents) {
        this.hogwartsStudents = hogwartsStudents;
    }

    public Map<Integer, HogwartsPerson> getIdAndStudentMap() {
        return idAndStudentMap;
    }

    public void setIdAndStudentMap(Map<Integer, HogwartsPerson> idAndStudentMap) {
        this.idAndStudentMap = idAndStudentMap;
    }
}
