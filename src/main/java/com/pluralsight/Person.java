package com.pluralsight;

public class Person implements Comparable <Person> {
    // Data fields
    private String firstName, lastName;
    private int age;

    // Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // Comparator
    @Override
    public int compareTo(Person o) {
        // Sort based on last name of a person
        int last = this.lastName.compareTo(o.lastName);
        // If same last name, then sort based on first name of person
        return last == 0 ? this.firstName.compareTo(o.firstName) : last;
    }

    @Override
    public String toString(){
        return this.lastName + ", " + this.firstName;
    }

    // Getters and Setters
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
