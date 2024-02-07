package edu.hogwarts.application;

import edu.generic.Student;
import edu.generic.Teacher;
import edu.hogwarts.data.HogwartsPerson;
import edu.hogwarts.data.House;

import java.util.List;

public class Application {
    private InitializeApp initializeApp;
    private StudentController studentController;
    private TeacherController teacherController;
    private UserInterface userInterface;
    public Application() {
        this.initializeApp = new InitializeApp();
        this.studentController = new StudentController();
        this.teacherController = new TeacherController();
        this.userInterface = new UserInterface();
    }




    public static void main(String[] args) {
        Application application = new Application();
        StudentController studentController = application.studentController;

//        studentController.getStudent(1);
    }
}
