package edu.hogwarts.application;

import edu.generic.Student;
import edu.hogwarts.data.HogwartsPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private StudentController studentController;
    private TeacherController teacherController;
    private Scanner scanner = new Scanner(System.in);
    private DataUtility dataUtility;
    private List<HogwartsPerson> allStudents;

    public UserInterface(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;
        this.allStudents = new ArrayList<>(studentController.getAllStudents());

        this.dataUtility = new DataUtility(allStudents);
    }

    public void displayMenu() {
        System.out.println("\n\n\nWelcome to the Hogwarts Information System!");
        System.out.println("1. View Student options");
        System.out.println("2. View Teacher options");
        System.out.println("3. Exit");
    }

    public void start() {

        while (true) {
            displayMenu();
            System.out.print("Enter your choice: \n\n\n");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    studentsMenu();
                    break;
                case 2:
                    teachersMenu();
                    break;
                case 3:
                    System.out.println("Exiting the Hogwarts Information System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public void displayStudents(List<HogwartsPerson> students) {

        System.out.println(String.format("%20s \t\t\t\t| %-17s | %-15s | %-10s | %-46s | %-15s | %-20s\n",
                "NAME",
                "ENROLLMENT YEAR",
                "HOUSE",
                "PREFECT",
                "TEAMS",
                "GRADUATION YEAR",
                "GRADUATED"
        ));
        for (HogwartsPerson student : students) {
            System.out.println(student.toString());
        }
        System.out.println();
    }

    private void displayTeachers() {
        List<HogwartsPerson> teachers = teacherController.getAllTeachers();

        System.out.println(String.format("%20s \t\t\t\t| %-17s | %-20s | %-20s | %-20s | %-20s\n",
                "NAME",
                "EMPLOYMENT TYPE",
                "EMPLOYMENT START",
                "EMPLOYMENT END",
                "HEAD OF HOUSE",
                "HOUSE"
        ));
        for (HogwartsPerson teacher : teachers) {
            System.out.println(teacher.toString());
        }
        System.out.println();
    }

    private void displayTeachersMenu() {
        System.out.println("\n\n\nWelcome to the teachers view menu!");
        System.out.println("1. View Teachers");
        System.out.println("2. Sort Teachers");
        System.out.println("3. Filter Teachers");
        System.out.println("4. Go back");
        System.out.println("5. Exit system");
    }

    private void displayStudentsMenu() {
        System.out.println("\n\n\nWelcome to the students view menu!");
        System.out.println("1. View Students");
        System.out.println("2. Sort Students");
        System.out.println("3. Filter Students");
        System.out.println("4. Go back");
        System.out.println("5. Exit system");
    }

    private void teachersMenu() {
        while (true) {
            displayTeachersMenu();
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayTeachers();
                    break;
                case 2:
                    //code to sort teachers
                    break;
                case 3:
                    //code to filter teachers
                    break;
                case 4:
                    start();
                    break;
                case 5:
                    System.out.println("Exiting the Hogwarts Information System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void studentsMenu() {
        while (true) {
            displayStudentsMenu();
            System.out.println("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayStudents(allStudents);
                    break;
                case 2:
                    displayStudents(dataUtility.getNamesAscending());
//                    displayStudents(dataUtility.getNamesDescending());
                    break;
                case 3:
                    //code to filter students
                    break;
                case 4:
                    start();
                    break;
                case 5:
                    System.out.println("Exiting the Hogwarts Information System. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private void sortStudents() {

    }

}


