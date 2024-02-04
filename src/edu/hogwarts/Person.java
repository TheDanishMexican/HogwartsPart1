package edu.hogwarts;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person() {}

    public Person(String fullName) {
        setFullName(fullName);
    }

    public Person(String firstName, String lastName) {
        this(firstName, null, lastName);
    }

    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFullName() {
        if(middleName == null) {
            return firstName + " " + lastName;
        } else {
            return firstName + middleName + lastName;
        }
    }

    public void setFullName(String fullName) {
        String[] names = fullName.split(" ");

        this.firstName = names[0];
        this.lastName = names[names.length - 1];

        if(names.length > 2) {
            this.middleName = names[1];
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Object \"Person\":\n{\nAge: " + "\nFirstname: " + this.firstName + "\nLastname: " + this.lastName + "\n}";
    }



    public static void main(String[] args) {

    }
}