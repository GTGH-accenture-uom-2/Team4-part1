package org.example;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Insured extends Person{
    private String email;
    private String afm;
    private String birthdate;
    private Vaccination vaccination;
    //private VaccinationCenter vacCenter;

    public Insured () { }
    public Insured(String name, String surname, String amka, String email, String afm, String birthdate) {
        super(name, surname, amka);
        this.email = email;
        this.afm = afm;
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getAfm() {
        return afm;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setEmail (String email) {
        this.email = email;
    }
    public void setAfm (String afm) {
        this.afm = afm;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public VaccinationCenter selectVacCenter (ArrayList<VaccinationCenter> vaccinationCenters){
        //ebala kai pedio VacCenter sta attributes
        //code goes here
        System.out.println("Select Vaccination Center:");

        Random random = new Random();
        int randomIndex = random.nextInt(vaccinationCenters.size());
        return vaccinationCenters.get(randomIndex);

    }

    public void print() {
        System.out.println("name: "+ getName() + ", "+ "surname:" + getSurname() + ", " + "amka:" + getAmka() + ","+
                "email:" + email + ", " + "afm:" + afm + "," + "birthdate:" + birthdate);
    }

    public Timeslot selectTimeslot(VaccinationCenter vacCenter){
        ArrayList<Timeslot> timeslotList = new ArrayList<Timeslot>(vacCenter.getFreeTimeslots(vacCenter.getTimeslots()));

        Random random = new Random();
        int randomIndex = random.nextInt(timeslotList.size());
        Timeslot selectedTimeslot = timeslotList.get(randomIndex);
        selectedTimeslot.setFree(false);
        return selectedTimeslot;
    }

    public Reservation makeReservation(ArrayList<VaccinationCenter> vaccinationCenters){
        VaccinationCenter selectedVaccCenter = this.selectVacCenter(vaccinationCenters);
        Timeslot selectedTimeslot = this.selectTimeslot(selectedVaccCenter);

        return new Reservation(this,selectedTimeslot,selectedVaccCenter);
    }

    public void deleteReservation(Reservation reservation) {

        // Delete the initial reservation
        Timeslot initTimeslot = reservation.getTimeslot(); //arxiko Timeslot
        ArrayList<Timeslot> timeslots = reservation.getVaccinationCenter().getTimeslots();
        for (Timeslot timeslot : timeslots)
            if (timeslot.equals(initTimeslot))
                timeslot.setFree(true);
    }

    public Reservation changeReservation(Reservation reservation,ArrayList<VaccinationCenter> vaccinationCenters){
        this.deleteReservation(reservation);
        return (this.makeReservation(vaccinationCenters));
    }

    public Vaccination getVaccinated(Reservation reservation, Doctor doctor) {
        int day = reservation.getTimeslot().getDay();
        int month = reservation.getTimeslot().getMonth();
        int year = reservation.getTimeslot().getYear();
        String vaccinationDate = IntStream.of(day, month, year).mapToObj(String::valueOf).collect(Collectors.joining("/"));

        Vaccination completedVaccination = new Vaccination(this,doctor,vaccinationDate);

        return completedVaccination;
    }

    public void hasVaccinationCoverage(){
        LocalDate currentDate = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate expirationDate = LocalDate.parse(vaccination.getExpirationDate(), formatter);

        if(currentDate.isAfter(expirationDate))
            System.out.println("Your vaccination has expired!");
        else
            System.out.println("You have an active vaccination");

    }

    public int birthdateToAge(String birthdate){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDate = LocalDate.parse(birthdate, formatter);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);

        int age = period.getYears();
        return age;
    }

    public boolean equals (Insured insured){
        return this.getAmka().equals(insured.getAmka());
    }



        /*2η υλοποιηση με hasmap(δεν υλοποιηθηκε σε όλη την εφαρμογη αλλα σε καποια κομματια μονο, πιθανως λειπουν διαφορα
    public Timeslot selectTimeslot2(VaccinationCenter vacCenter){
        System.out.println("Παρακαλώ επιλέξτε έναν αριθμό από τον παρακάτω κατάλογο:");
        int index = 1;
        for (Map.Entry<Timeslot, Boolean> entry : vacCenter.getTimeslots2().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            index++;
        }
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();

        if (choice < 1 || choice > vacCenter.getTimeslots().size()) {
            System.out.println("Μη έγκυρη επιλογή.");
            return null;
        }

        Timeslot selectedTimeslot = null;
        int count = 1;
        for (Map.Entry<Timeslot, Boolean> entry : vacCenter.getTimeslots2().entrySet()) {
            if (count == choice)
                selectedTimeslot = entry.getKey();
            count++;
        }
        System.out.println("Επιλέχθηκε το Timeslot: " + selectedTimeslot);

        return selectedTimeslot;
    }


    public Reservation makeReservation2(ArrayList<VaccinationCenter> vaccinationCenters) {
        VaccinationCenter selectedVaccCenter = this.selectVacCenter(vaccinationCenters);
        Timeslot selectedTimeslot = this.selectTimeslot(selectedVaccCenter);

        // ειναι διαθεσιμο?
        if (selectedVaccCenter.getTimeslots2().get(selectedTimeslot) != null &&
                selectedVaccCenter.getTimeslots2().get(selectedTimeslot)) {
            // το κανουμε μη διαθεσιμο
            selectedVaccCenter.getTimeslots2().put(selectedTimeslot, false);

            // Κανω reservation
            Reservation reservation = new Reservation(this, selectedTimeslot, selectedVaccCenter);
            return reservation;
        } else {
            System.out.println("Το επιλεγμένο Timeslot δεν είναι διαθέσιμο.");
            return null;
        }
    }*/


}
