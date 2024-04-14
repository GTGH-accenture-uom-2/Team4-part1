package org.example;
import java.util.ArrayList;


public class Doctor extends Person {
    private ArrayList<Timeslot> Timeslots;

    public Doctor(String name, String surname, String amka) {
        super(name, surname, amka);
        Timeslots = new ArrayList<>();
    }

    public void add_timeslot(timeslotObj) {
        Timeslots.add(timeslotObj);
    }

    public void printArrayList() {
        System.out.println("Printing ArrayList:");
        for (timeslotObj obj : Timeslots) {
            System.out.println(obj); // Assuming MyObject has a meaningful toString() method


        }
    }
}