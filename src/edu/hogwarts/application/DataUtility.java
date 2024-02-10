package edu.hogwarts.application;

import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.HogwartsStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DataUtility {
    List<HogwartsPerson> namesDescending;
    List<HogwartsPerson> namesAscending;
    List<HogwartsPerson> agesAscending;
    List<HogwartsPerson> agesDescending;
    List<HogwartsPerson> houseAscending;
    List<HogwartsPerson> houseDescending;
    List<HogwartsPerson> roleAscending;
    List<HogwartsPerson> roleDescending;
    private List<HogwartsPerson> filteredTeachers;
    private List<HogwartsPerson> filteredStudents;

    private List<HogwartsPerson> filteredGryffindor;
    private List<HogwartsPerson> filteredRavenclaw;
    private List<HogwartsPerson> filteredSlytherin;
    private List<HogwartsPerson> filteredHufflepuff;


    public DataUtility(List<HogwartsPerson> hogwartsPeople) {
        ArrayList<HogwartsPerson> people = new ArrayList<>(hogwartsPeople);
        this.namesAscending = new ArrayList<>(sortNamesAscending(people));
        this.namesDescending = new ArrayList<>(sortNamesDescending(people));
        this.agesAscending = new ArrayList<>(sortAgesAscending(people));
        this.agesDescending = new ArrayList<>(sortAgesDescending(people));
        this.houseAscending = new ArrayList<>(sortHouseAscending(people));
        this.houseDescending = new ArrayList<>(sortHouseDescending(people));
        this.roleAscending = new ArrayList<>(sortRoleAscending(people));
        this.roleDescending = new ArrayList<>(sortRoleDescending(people));
        this.filteredTeachers = filterRoleBy(people, "Teacher");
        this.filteredStudents = filterRoleBy(people, "Student");
        this.filteredGryffindor = filterHouseBy(people, "Gryffindor");
        this.filteredHufflepuff = filterHouseBy(people, "Hufflepuff");
        this.filteredRavenclaw = filterHouseBy(people, "Ravenclaw");
        this.filteredSlytherin = filterHouseBy(people, "Slytherin");
    }

    public List<HogwartsPerson> filterHouseBy(List<HogwartsPerson> hogwartsPeople, String house) {
        List<HogwartsPerson> copy = new ArrayList<>(hogwartsPeople);

        switch (house) {
            case "Gryffindor":
                return copy.stream()
                        .filter(person -> "Gryffindor".equals(person.getHouseName()))
                        .collect(Collectors.toList());
            case "Hufflepuff":
                return copy.stream()
                        .filter(person -> "Hufflepuff".equals(person.getHouseName()))
                        .collect(Collectors.toList());
            case "Slytherin":
                return copy.stream()
                        .filter(person -> "Slytherin".equals(person.getHouseName()))
                        .collect(Collectors.toList());
            case "Ravenclaw":
                return copy.stream()
                        .filter(person -> "Ravenclaw".equals(person.getHouseName()))
                        .collect(Collectors.toList());
            default:
                System.out.println("Something went wrong");
                break;
        }
        return null;
    }


    public List<HogwartsPerson> filterRoleBy(List<HogwartsPerson> hogwartsPeople, String filterType) {
        List<HogwartsPerson> copy = new ArrayList<>(hogwartsPeople);
        switch (filterType) {
            case "teacher":
                return copy.stream()
                        .filter(person -> "Teacher".equals(person.getRole()))
                        .collect(Collectors.toList());
            case "student":
                return copy.stream()
                        .filter(person -> "Student".equals(person.getRole()))
                        .collect(Collectors.toList());
            default:
                System.out.println("Something went wrong");
                break;
        }
        return null;
    }
    public List<HogwartsPerson> getAscSortingMethodBySortingType(String sortType) {
        switch(sortType) {
            case "name":
                return getNamesAscending();
            case "age":
                return getAgesAscending();
            case "house":
                return getHouseAscending();
            case "role":
                return getRoleAscending();
            default:
                System.out.println("something went wrong");
                break;
        }
        return null;
    }
    public List<HogwartsPerson> getDescSortingMethodBySortingType(String sortType) {
        switch(sortType) {
            case "name":
                return getNamesDescending();
            case "age":
                return getAgesDescending();
            case "house":
                return getHouseDescending();
            case "role":
                return getRoleDescending();
            default:
                System.out.println("something went wrong");
                break;
        }
        return null;
    }
    public List<HogwartsPerson> sortRoleAscending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getRole));

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortRoleDescending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getRole).reversed());

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortHouseAscending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getHouseName));

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortHouseDescending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getHouseName).reversed());

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortNamesAscending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getName));

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortNamesDescending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getName).reversed());

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortAgesAscending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getAge));

        return new ArrayList<>(hogwartsPeople);
    }
    public List<HogwartsPerson> sortAgesDescending(List<HogwartsPerson> hogwartsPeople) {
        hogwartsPeople.sort(Comparator.comparing(HogwartsPerson::getAge).reversed());

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

    public List<HogwartsPerson> getAgesAscending() {
        return agesAscending;
    }

    public void setAgesAscending(List<HogwartsPerson> agesAscending) {
        this.agesAscending = agesAscending;
    }

    public List<HogwartsPerson> getAgesDescending() {
        return agesDescending;
    }

    public void setAgesDescending(List<HogwartsPerson> agesDescending) {
        this.agesDescending = agesDescending;
    }

    public List<HogwartsPerson> getHouseAscending() {
        return houseAscending;
    }

    public void setHouseAscending(List<HogwartsPerson> houseAscending) {
        this.houseAscending = houseAscending;
    }

    public List<HogwartsPerson> getHouseDescending() {
        return houseDescending;
    }

    public void setHouseDescending(List<HogwartsPerson> houseDescending) {
        this.houseDescending = houseDescending;
    }

    public List<HogwartsPerson> getRoleAscending() {
        return roleAscending;
    }

    public void setRoleAscending(List<HogwartsPerson> roleAscending) {
        this.roleAscending = roleAscending;
    }

    public List<HogwartsPerson> getRoleDescending() {
        return roleDescending;
    }

    public void setRoleDescending(List<HogwartsPerson> roleDescending) {
        this.roleDescending = roleDescending;
    }

    public List<HogwartsPerson> getFilteredTeachers() {
        return filteredTeachers;
    }

    public void setFilteredTeachers(List<HogwartsPerson> filteredTeachers) {
        this.filteredTeachers = filteredTeachers;
    }

    public List<HogwartsPerson> getFilteredStudents() {
        return filteredStudents;
    }

    public void setFilteredStudents(List<HogwartsPerson> filteredStudents) {
        this.filteredStudents = filteredStudents;
    }

    public List<HogwartsPerson> getFilteredGryffindor() {
        return filteredGryffindor;
    }

    public void setFilteredGryffindor(List<HogwartsPerson> filteredGryffindor) {
        this.filteredGryffindor = filteredGryffindor;
    }

    public List<HogwartsPerson> getFilteredRavenclaw() {
        return filteredRavenclaw;
    }

    public void setFilteredRavenclaw(List<HogwartsPerson> filteredRavenclaw) {
        this.filteredRavenclaw = filteredRavenclaw;
    }

    public List<HogwartsPerson> getFilteredSlytherin() {
        return filteredSlytherin;
    }

    public void setFilteredSlytherin(List<HogwartsPerson> filteredSlytherin) {
        this.filteredSlytherin = filteredSlytherin;
    }

    public List<HogwartsPerson> getFilteredHufflepuff() {
        return filteredHufflepuff;
    }

    public void setFilteredHufflepuff(List<HogwartsPerson> filteredHufflepuff) {
        this.filteredHufflepuff = filteredHufflepuff;
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
