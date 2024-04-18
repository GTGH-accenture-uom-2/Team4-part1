package org.example;

import java.util.Map;

public class Insured extends Person{
    private String email;
    private String afm;
    private String birthdate;
    private VaccinationCenter vacCenter;

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

    public VaccinationCenter selectVacCenter{
        //ebala kai pedio VacCenter sta attributes
        //code goes here
    }

    public void print() {
        System.out.println("name: "+ getName() + ", "+ "surname:" + getSurname() + ", " + "amka:" + getAmka() + ","+
                "email:" + email + ", " + "afm:" + afm + "," + "birthdate:" + birthdate);
    }

    public Timeslot selectTimeslot(VaccinationCenter vacCenter){
        //na ginei mia getTimeslot stin vaccenter??
        //την προσεγγισα με τετοιον τροπο ωστε να ειναι HasMap τα timeslots με boolen
        // που δειχνει αν ειναι κατηλλειμενο το timeslot

        System.out.println("Παρακαλώ επιλέξτε έναν αριθμό από τον παρακάτω κατάλογο:");

        int index = 1;
        for (Map.Entry<Timeslot, Boolean> entry : vacCenter.getTimeslot().entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            index++;
        }

        int choice = scanner.nextInt();

        if (choice < 1 || choice > vacCenter.getTimeslot().size()) {
            System.out.println("Μη έγκυρη επιλογή.");
            return null;
        }

        //εκτυπωση πληροφοριων του timeslot που επελεξε, πλιζ χελπ!
    }
}
