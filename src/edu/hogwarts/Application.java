package edu.hogwarts;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

public class Application {

    static void initApp() {
        House Slytherin = new House("Slytherin", "Salazar Slytherin",
                new ArrayList<>(Arrays.asList("green", "silver")));

        House Gryffindor = new House("Gryffindor", "Godric Gryffindor",
                new ArrayList<>(Arrays.asList("red", "gold")));

        House Hufflepuff = new House("Hufflepuff", "Helga Hufflepuff",
                new ArrayList<>(Arrays.asList("yellow", "black")));

        House Ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw",
                new ArrayList<>(Arrays.asList("blue", "silver")));


        HogwartsStudent harryPotter = new HogwartsStudent("Harry Potter", 1991, Gryffindor, true, new ArrayList<>(Arrays.asList("Quidditch", "Dumbledore's Army")), 1998, true);
        HogwartsStudent hermioneGranger = new HogwartsStudent("Hermione Granger", 1991, Gryffindor, false, new ArrayList<>(Arrays.asList("S.P.E.W.", "Dumbledore's Army")), 1998, true);
        HogwartsStudent ronWeasley = new HogwartsStudent("Ron Weasley", 1991, Gryffindor, false, new ArrayList<>(Arrays.asList("Quidditch", "Wizard Chess")), 1998, true);
        HogwartsStudent dracoMalfoy = new HogwartsStudent("Draco Malfoy", 1991, Slytherin, false, new ArrayList<>(Arrays.asList("Slytherin Quidditch Team","Club")), 1998, true);
        HogwartsStudent lunaLovegood = new HogwartsStudent("Luna Lovegood", 1992, Ravenclaw, false, new ArrayList<>(Arrays.asList("The Quibbler Club", "Club")), 1999, true);
        HogwartsStudent nevilleLongbottom = new HogwartsStudent("Neville Longbottom", 1991, Gryffindor, false, new ArrayList<>(Arrays.asList("Herbology Club","Club")), 1998, true);
        HogwartsStudent ginnyWeasley = new HogwartsStudent("Ginny Weasley", 1992, Gryffindor, true, new ArrayList<>(Arrays.asList("Gryffindor Quidditch Team", "Dumbledore's Army")), 1999, true);
        HogwartsStudent fredWeasley = new HogwartsStudent("Fred Weasley", 1989, Gryffindor, false, new ArrayList<>(Arrays.asList("Gryffindor Quidditch Team", "Weasleys' Wizard Wheezes")), 1996, true);
        HogwartsStudent choChang = new HogwartsStudent("Cho Chang", 1990, Ravenclaw, true, new ArrayList<>(Arrays.asList("Ravenclaw Quidditch Team", "Club")), 1997, true);
        HogwartsStudent cedricDiggory = new HogwartsStudent("Cedric Diggory", 1989, Hufflepuff, true, new ArrayList<>(Arrays.asList("Hufflepuff Quidditch Team", "Club")), 1995, true);

        ArrayList<Student> listOfHogwartsStudents = new ArrayList<>(Arrays.asList(harryPotter, hermioneGranger, ronWeasley,
                dracoMalfoy, lunaLovegood, nevilleLongbottom, ginnyWeasley, fredWeasley, choChang, cedricDiggory));

        HogwartsTeacher horaceSlughorn = new HogwartsTeacher(
                "Horace Slughorn",                          // Name
                Slytherin,                                        // House
                true,                                             // Head of House
                EmploymentType.FULL_TIME,                         // Employment Type
                LocalDate.of(1980, 9, 1),  // Employment Start
                LocalDate.of(2022, 6, 30)  // Employment End
        );

        HogwartsTeacher severusSnape = new HogwartsTeacher(
                "Severus Snape",                              // Name
                Slytherin,                                          // House
                false,                                              // Head of House
                EmploymentType.FULL_TIME,                           // Employment Type
                LocalDate.of(1981, 9, 1),    // Employment Start
                LocalDate.of(1998, 5, 2)     // Employment End
        );

        Wand wand1 = new Wand("Good wand", true, true, false,
                "remember to try your wand first", 2, "good wood", "good core");
        TextBook textBook1 = new TextBook("Good textbook", true, true, false,
                "read the textbook", "Potions textbook", "Potion guy", "Potion publisher", 1901);

        ArrayList<TeachingMaterial> materialsForPotions= new ArrayList<>(Arrays.asList(wand1, textBook1));

        Subject potions = new Subject("Potions", 6, false);

        Course potionsSixthYear = new Course(potions, horaceSlughorn, listOfHogwartsStudents, materialsForPotions);

        System.out.println(potionsSixthYear);

    }



    public static void main(String[] args) {
        initApp();
    }
}
