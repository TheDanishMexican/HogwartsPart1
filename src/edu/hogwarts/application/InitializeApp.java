package edu.hogwarts.application;

import edu.hogwarts.data.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InitializeApp {
    private StudentController studentController;
    private TeacherController teacherController;

    public InitializeApp(StudentController studentController, TeacherController teacherController) {
        this.studentController = studentController;
        this.teacherController = teacherController;

        House Slytherin = new House("Slytherin", "Salazar Slytherin",
                new ArrayList<>(Arrays.asList("green", "silver")));
        House Gryffindor = new House("Gryffindor", "Godric Gryffindor",
                new ArrayList<>(Arrays.asList("red", "gold")));
        House Hufflepuff = new House("Hufflepuff", "Helga Hufflepuff",
                new ArrayList<>(Arrays.asList("yellow", "black")));
        House Ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw",
                new ArrayList<>(Arrays.asList("blue", "silver")));

        HogwartsStudent harryPotter = new HogwartsStudent("Harry Potter", 1991, Gryffindor,
                true, new ArrayList<>(Arrays.asList("Quidditch", "Dumbledore's Army")), 1998, true);
        HogwartsStudent hermioneGranger = new HogwartsStudent("Hermione Granger", 1991, Gryffindor,
                false, new ArrayList<>(Arrays.asList("S.P.E.W.", "Dumbledore's Army")), 1998, true);
        HogwartsStudent ronWeasley = new HogwartsStudent("Ron Weasley", 1991, Gryffindor,
                false, new ArrayList<>(Arrays.asList("Quidditch", "Wizard Chess")), 1998, true);
        HogwartsStudent dracoMalfoy = new HogwartsStudent("Draco Malfoy", 1991, Slytherin,
                false, new ArrayList<>(Arrays.asList("Slytherin Quidditch Team", "Club")), 1998, true);
        HogwartsStudent lunaLovegood = new HogwartsStudent("Luna Lovegood", 1992, Ravenclaw,
                false, new ArrayList<>(Arrays.asList("The Quibbler Club", "Club")), 1999, true);
        HogwartsStudent nevilleLongbottom = new HogwartsStudent("Neville Longbottom", 1991, Gryffindor,
                false, new ArrayList<>(Arrays.asList("Herbology Club", "Club")), 1998, true);
        HogwartsStudent ginnyWeasley = new HogwartsStudent("Ginny Weasley", 1992, Gryffindor,
                true, new ArrayList<>(Arrays.asList("Gryffindor Quidditch Team", "Dumbledore's Army")), 1999, true);

        HogwartsTeacher albusDumbledore = new HogwartsTeacher("Albus Dumbledore", Gryffindor, false,
                EmploymentType.FULL_TIME, LocalDate.of(1900, 1, 1), LocalDate.of(1999, 1, 1)
        );
        HogwartsTeacher minervaMcGonagall = new HogwartsTeacher(
                "Minerva McGonagall", Gryffindor, true,
                EmploymentType.FULL_TIME, LocalDate.of(1956, 1, 1), LocalDate.of(1999, 1, 1)
        );
        HogwartsTeacher pomonaSprout = new HogwartsTeacher(
                "Pomona Sprout", Hufflepuff, true,
                EmploymentType.FULL_TIME, LocalDate.of(1967, 1, 1), LocalDate.of(1999, 1, 1)
        );
        HogwartsTeacher filiusFlitwick = new HogwartsTeacher(
                "Filius Flitwick", Ravenclaw, true,
                EmploymentType.FULL_TIME, LocalDate.of(1974, 1, 1), LocalDate.of(1999, 1, 1)
        );

        studentController.createStudent(harryPotter);
        studentController.createStudent(ronWeasley);
        studentController.createStudent(hermioneGranger);
        studentController.createStudent(ginnyWeasley);
        studentController.createStudent(dracoMalfoy);
        studentController.createStudent(lunaLovegood);
        studentController.createStudent(nevilleLongbottom);
    }
}


