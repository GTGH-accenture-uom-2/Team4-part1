package org.example;

public class Person {
    private String name;
    private String surname;
    private String amka;
    public Person () { }
    public Person(String name, String surname, String amka) {
        this.name = name;
        this.surname = surname;
        this.amka = amka;
    }
    public String getName () {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getAmka() {
        return amka;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAmka(String amka) {
        this.amka = amka;
    }
    public void printInfo() {
        System.out.println("Name:" + name+ ", "+ "Surname:"+ surname + ", " + "Amka:" + amka);
    }
}
