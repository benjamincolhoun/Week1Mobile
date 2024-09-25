package com.example.practical1;

public class Question1 {
    // Initialize variables
    char initial = 'J';
    String surname = "Smith";
    int age = 25;
    double salary = 21000;
    boolean isEmployed = true;

    public void displayInfo() {
        System.out.println(initial + " " + surname + " is " + age + " years old, is currently " +
                (isEmployed ? "employed" : "unemployed") + " and has a salary of £" + salary + " per year.");
    }

    public static void main(String[] args) {
        Question1 person = new Question1();
        person.displayInfo();
    }
}
