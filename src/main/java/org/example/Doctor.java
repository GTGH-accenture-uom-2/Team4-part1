package org.example;
import java.util.ArrayList;
import java.util.Comparator;

public class Doctor extends Person {
    private ArrayList<Timeslot> timeslots;
    private ArrayList<Reservation> reservations;
    private VaccinationCenter vaccinationCenter;
    private ArrayList<Vaccination> vaccinations;

    public Doctor(String name, String surname, String amka) {
        super(name, surname, amka);
        timeslots = new ArrayList<>();
        reservations = new ArrayList<>();
        vaccinations = new ArrayList<>();
    }

    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

    public void getInformed(VaccinationCenter vaccCenter) {
        reservations.stream()
                .filter(x ->x.getVaccinationCenter().getCode().equals(vaccCenter.getCode()))
                .sorted(Comparator.comparingInt(r -> r.getTimeslot().getDay()))
                .forEach(System.out::println);
    }



    public ArrayList<Timeslot> getTimeslots() {
        return timeslots;
    }

    public ArrayList<Vaccination> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(ArrayList<Vaccination> vaccinations) {
        this.vaccinations = vaccinations;
    }

    public void addTimeslot(Timeslot timeslot) {
        timeslots.add(timeslot);
    }
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void addVaccination(Vaccination vaccination) {
        vaccinations.add(vaccination);
    }

    public boolean equals(Doctor doc){
        return this.getAmka().equals(doc.getAmka());

    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void printVaccinations(){
        System.out.println("-------------");
        System.out.println("");
        for(Reservation reservation:reservations){
            System.out.println(reservation);
            System.out.println("");
        }
    }
}
