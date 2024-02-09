package edu.hogwarts.application;

import edu.hogwarts.data.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class InitializeData {
    private StudentController studentController;
    private TeacherController teacherController;

    public InitializeData(StudentController studentController, TeacherController teacherController) {
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

        HogwartsStudent harryPotter = new HogwartsStudent(LocalDate.of(1996, 12, 12),"Harry Potter", 1923, Gryffindor,
                true, new ArrayList<>(Arrays.asList("Quidditch", "Dumbledore's Army")), 1998, true);
        HogwartsStudent hermioneGranger = new HogwartsStudent(LocalDate.of(1996, 4, 4),"Hermione Granger", 1991, Gryffindor,
                false, new ArrayList<>(Arrays.asList("S.P.E.W.", "Dumbledore's Army")), 1998, true);
        HogwartsStudent ronWeasley = new HogwartsStudent(LocalDate.of(1994, 3, 19),"Ron Weasley", 1956, Gryffindor,
                false, new ArrayList<>(Arrays.asList("Quidditch", "Wizard Chess")), 1998, true);
        HogwartsStudent dracoMalfoy = new HogwartsStudent(LocalDate.of(1995, 8, 21),"Draco Malfoy", 1987, Slytherin,
                false, new ArrayList<>(Arrays.asList("Slytherin Quidditch Team", "Club")), 1998, true);
        HogwartsStudent lunaLovegood = new HogwartsStudent(LocalDate.of(1994, 10, 30),"Luna Lovegood", 1912, Ravenclaw,
                false, new ArrayList<>(Arrays.asList("The Quibbler Club", "Club")), 1999, true);
        HogwartsStudent nevilleLongbottom = new HogwartsStudent(LocalDate.of(1998, 3, 9),"Neville Longbottom", 1991, Gryffindor,
                false, new ArrayList<>(Arrays.asList("Herbology Club", "Club")), 1953, true);
        HogwartsStudent ginnyWeasley = new HogwartsStudent(LocalDate.of(1999, 2, 12),"Ginny Weasley", 1992, Gryffindor,
                true, new ArrayList<>(Arrays.asList("Gryffindor Quidditch Team", "Dumbledore's Army")), 1999, true);

        HogwartsTeacher albusDumbledore = new HogwartsTeacher(LocalDate.of(1890, 4, 4),"Albus Dumbledore", Gryffindor, false,
                EmploymentType.FULL_TIME, LocalDate.of(1900, 1, 1), LocalDate.of(1999, 1, 1)
        );
        HogwartsTeacher minervaMcGonagall = new HogwartsTeacher(
                LocalDate.of(1933, 11, 2),"Minerva McGonagall", Gryffindor, true,
                EmploymentType.FULL_TIME, LocalDate.of(1956, 1, 1), LocalDate.of(1999, 1, 1)
        );
        HogwartsTeacher pomonaSprout = new HogwartsTeacher(
                LocalDate.of(1944, 10, 10),"Pomona Sprout", Hufflepuff, true,
                EmploymentType.FULL_TIME, LocalDate.of(1967, 1, 1), LocalDate.of(1999, 1, 1)
        );
        HogwartsTeacher filiusFlitwick = new HogwartsTeacher(
                LocalDate.of(1939, 6, 29),"Filius Flitwick", Ravenclaw, true,
                EmploymentType.FULL_TIME, LocalDate.of(1974, 1, 1), LocalDate.of(1999, 1, 1)
        );

        studentController.createStudent(harryPotter);
        studentController.createStudent(ronWeasley);
        studentController.createStudent(hermioneGranger);
        studentController.createStudent(ginnyWeasley);
        studentController.createStudent(dracoMalfoy);
        studentController.createStudent(lunaLovegood);
        studentController.createStudent(nevilleLongbottom);

        teacherController.createTeacher(albusDumbledore);
        teacherController.createTeacher(pomonaSprout);
        teacherController.createTeacher(filiusFlitwick);
        teacherController.createTeacher(minervaMcGonagall);
        //test
    }
}


