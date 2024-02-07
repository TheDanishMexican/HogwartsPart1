package edu.hogwarts.data;

import edu.generic.Student;
import edu.generic.Teacher;

import java.util.ArrayList;

public class Course {
    Subject subject;
    Teacher teacher;
    ArrayList<Student> students;
    ArrayList<TeachingMaterial> materials;

    public Course() {}

    public Course(Subject subject, Teacher teacher, ArrayList<Student> students, ArrayList<TeachingMaterial> materials) {
        this.subject = subject;
        this.teacher = teacher;
        this.students = students;
        this.materials = materials;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<TeachingMaterial> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<TeachingMaterial> materials) {
        this.materials = materials;
    }

    @Override
    public String toString() {
        String studentNames = "";
        String materialNames = "";

        for(TeachingMaterial material : materials) {
            String materialName = material.getName();
            materialNames += materialName + ", ";
        }

        for(Student student : students) {
            String studName = student.getFullName();
            studentNames += studName + ", ";
        }

        return "Course {" +
                "\n  Subject: " + subject.getName() +
                "\n  Teacher: " + teacher.getFullName() +
                "\n  Students: " +  studentNames +
                "\n  Materials: " + materialNames +
                "\n}";
    }



    public static void main(String[] args) {

    }
}
