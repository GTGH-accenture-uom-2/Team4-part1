package org.example;
import java.util.ArrayList;


public class Doctor extends Person {
    private ArrayList<Timeslot> timeslots;
    private ArrayList<Reservation> reservations;
    private VaccinationCenter vaccinationCenter;
    public ArrayList<Vaccination> vaccinations;

    public Doctor(String name, String surname, String amka) {
        super(name, surname, amka);
        timeslots = new ArrayList<>();
    }

    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

    public ArrayList<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public void add_timeslot(timeslotObj) {
        timeslots.add(timeslotObj);
    }

    public void printArrayList() {
        System.out.println("Printing ArrayList:");
        for (timeslotObj obj : timeslots) {
            System.out.println(obj); // Assuming MyObject has a meaningful toString() method


        }
    }

    public boolean equals(Doctor doc){
        return this.getAmka().equals(doc.getAmka());

    }
}
