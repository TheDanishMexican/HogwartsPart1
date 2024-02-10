package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private StudentController studentController;
    private TeacherController teacherController;
    private Scanner scanner = new Scanner(System.in);
    private DataUtility dataUtility;
    private List<HogwartsPerson> allStudents;
    private List<HogwartsPerson> allTeachers;
    private List<HogwartsPerson> hogwartsPeople;
    private String studentType = "student";
    private String teacherType = "teacher";

    public UserInterface(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
        this.allTeachers = new ArrayList<>(teacherController.getAllTeachers());
        this.allStudents = new ArrayList<>(studentController.getAllStudents());
        this.hogwartsPeople = new ArrayList<>();
        this.hogwartsPeople.addAll(allStudents);
        this.hogwartsPeople.addAll(allTeachers);
        this.dataUtility = new DataUtility(hogwartsPeople);
    }

    public void displayMenu() {
        System.out.println("\n\n\nWelcome to the Hogwarts Information System!");
        System.out.println("1. View Hogwarts people");
        System.out.println("2. Sort view");
        System.out.println("3. Filter view");
        System.out.println("4. Exit");
    }

    public void start() {

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: \n\n\n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayHogwartsPerson(hogwartsPeople);
                    break;
                case 2:
                    sortMenu();
                    break;
                case 3:
                    filterMenu();
                    break;
                case 4:
                    System.out.println("Exiting the Hogwarts Information System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public void displayHouseOptions() {
        System.out.println("FILTER BY:");
        System.out.println("1. Gryffindor");
        System.out.println("2. Ravenclaw");
        System.out.println("3. Slytherin");
        System.out.println("4. Hufflepuff");
        System.out.println("5. Return to start");
        System.out.println("Enter your choice:\n\n\n");
    }

    public void displayRoleOptions() {
        System.out.println("FILTER BY:");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        System.out.println("3. Return to start");
        System.out.println("Enter your choice:\n\n\n");
    }

    public void displayHogwartsPerson(List<HogwartsPerson> people) {
        System.out.println(String.format("%20s \t\t\t\t| %-17s | %-15s | %-10s | %-46s | %-15s |\n",
                "FIRST NAME",
                "MIDDLE NAME",
                "LAST NAME",
                "AGE",
                "HOUSE",
                "ROLE"
        ));

        for (HogwartsPerson person : people) {
            System.out.println(person.toString());
        }
    }

    public void displaySortMenu() {
        System.out.println("SORT BY:");
        System.out.println("1. Name");
        System.out.println("2. Age");
        System.out.println("3. House");
        System.out.println("4. Role");
        System.out.println("5. Return to start");
        System.out.print("Enter your choice: \n\n\n");
    }

    public void displayFilterMenu() {
        System.out.println("FILTER BY:");
        System.out.println("1. House");
        System.out.println("2. Role");
        System.out.println("3. Return to start");
        System.out.print("Enter your choice: \n\n\n");
    }

    public void displayAscDescMenu() {
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.println("3. Return to start");
        System.out.print("Enter your choice: \n\n\n");
    }

    public void ascDescMenu(String sortType) {
        while (true) {
            displayAscDescMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayHogwartsPerson(dataUtility.getAscSortingMethodBySortingType(sortType));
                    break;
                case 2:
                    displayHogwartsPerson(dataUtility.getDescSortingMethodBySortingType(sortType));
                    break;
                case 3:
                    start();
                    return;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }

    public void sortMenu() {
        while (true) {
            displaySortMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    ascDescMenu("name");
                    break;
                case 2:
                    ascDescMenu("age");
                    break;
                case 3:
                    ascDescMenu("house");
                    break;
                case 4:
                    ascDescMenu("role");
                    break;
                case 5:
                    start();
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        }
    }

    public void roleMenu() {
        while (true) {
            displayRoleOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 1:
                    displayHogwartsPerson();
                    dataUtility.filterRoleBy("teacher");
                    break;
                case 2:
//                    dataUtility.filterRoleBy("student");
                    break;
                case 3:
                    start();
                    return;
            }
        }
    }

    public void houseMenu() {
        while (true) {
            displayHouseOptions();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    dataUtility.filterHouseBy("gryffindor");
                    break;
                case 2:
                    dataUtility.filterHouseBy("ravenclaw");
                    break;
                case 3:
                    dataUtility.filterHouseBy("slytherin");
                    break;
                case 4:
                    dataUtility.filterHouseBy("hufflepuff");
                    break;
                case 5:
                    start();
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        }
    }

    public void filterMenu() {
        while (true) {
            displayFilterMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    houseMenu();
                    break;
                case 2:
                    roleMenu();
                    break;
                case 3:
                    start();
                    return;
                default:
                    System.out.println("Invalid input. Try again");
            }
        }
    }





}


