package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataUtility {
    private List<HogwartsPerson> namesDescending;
    private List<HogwartsPerson> namesAscending;
    private List<HogwartsPerson> allStudents;

    public DataUtility(List<HogwartsPerson> students) {
        this.allStudents = new ArrayList<>(students);
        this.namesDescending = sortStudentNamesDescending(getAllStudents());
        this.namesAscending =  sortStudentNamesAscending(getAllStudents());
    }
    public List<HogwartsPerson> sortStudentNamesAscending(List<HogwartsPerson> students) {
        students.sort(Comparator.comparing(HogwartsPerson::getName));

        return new ArrayList<>(students);
    }

    public List<HogwartsPerson> sortStudentNamesDescending(List<HogwartsPerson> students) {
        students.sort(Comparator.comparing(HogwartsPerson::getName).reversed());

        return new ArrayList<>(students);
    }

//    public List<HogwartsPerson> generalizedSort(Comparator comparator) {
//        List<HogwartsPerson> sortedList = new ArrayList<>(allStudents);
//
//        sortedList.sort(comparator);
//
//        return sortedList;
//    }

    public List<HogwartsPerson> sortStudentAgesAscending(List<HogwartsPerson> students) {
        students.sort(Comparator.comparing(HogwartsPerson::getHouseName));

        return students;
    }

    public List<HogwartsPerson> getNamesDescending() {
        return namesDescending;
    }

    public void setNamesDescending(List<HogwartsPerson> namesDescending) {
        this.namesDescending = namesDescending;
    }

    public List<HogwartsPerson> getNamesAscending() {
        return namesAscending;
    }

    public void setNamesAscending(List<HogwartsPerson> namesAscending) {
        this.namesAscending = namesAscending;
    }

    public List<HogwartsPerson> getAllStudents() {
        return allStudents;
    }

    public void setAllStudents(List<HogwartsPerson> allStudents) {
        this.allStudents = allStudents;
    }
}
