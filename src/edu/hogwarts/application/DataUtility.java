package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataUtility {
    List<HogwartsPerson> namesDescending;
    List<HogwartsPerson> namesAscending;
    public DataUtility(List<HogwartsPerson> hogwartsPeople) {
        ArrayList<HogwartsPerson> people = new ArrayList<>(hogwartsPeople);
        this.namesAscending = new ArrayList<>(sortNamesAscending(people));
        this.namesDescending = new ArrayList<>(sortNamesDescending(people));
    }
    public List<HogwartsPerson> sortNamesAscending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getName));

        return new ArrayList<>(hogwartsPeople);
    }

    public List<HogwartsPerson> sortNamesDescending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getName).reversed());

        return new ArrayList<>(hogwartsPeople);
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

    //Generalized Sort below - IF NEEDED

//    public List<HogwartsPerson> generalizedSort(Comparator comparator) {
//        List<HogwartsPerson> sortedList = new ArrayList<>(allStudents);
//
//        sortedList.sort(comparator);
//
//        return sortedList;
//    }

}
