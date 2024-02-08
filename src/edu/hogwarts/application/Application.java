package edu.hogwarts.application;

public class Application {
    private InitializeData initializeData;
    private StudentController studentController;
    private TeacherController teacherController;
    private UserInterface userInterface;
    public Application() {
        this.studentController = new StudentController();
        this.teacherController = new TeacherController();
        this.userInterface = new UserInterface(studentController, teacherController);
        this.initializeData = new InitializeData(studentController, teacherController);
    }




    public static void main(String[] args) {
        Application application = new Application();

        application.userInterface.start();
    }
}
