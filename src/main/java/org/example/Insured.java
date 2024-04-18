package org.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

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

    public VaccinationCenter selectVacCenter (ArrayList<VaccinationCenter> vaccinationCenters){
        //ebala kai pedio VacCenter sta attributes
        //code goes here
        System.out.println("Select Vaccination Center:");

        Random random = new Random();
        int randomIndex = random.nextInt(vaccinationCenters.size());
        VaccinationCenter selectedVaccinationCenter = vaccinationCenters.get(randomIndex);
        return selectedVaccinationCenter;

    }

    public void print() {
        System.out.println("name: "+ getName() + ", "+ "surname:" + getSurname() + ", " + "amka:" + getAmka() + ","+
                "email:" + email + ", " + "afm:" + afm + "," + "birthdate:" + birthdate);
    }

    public Timeslot selectTimeslot(VaccinationCenter vacCenter){
        ArrayList<Timeslot> timeslotList = new ArrayList<Timeslot>(vacCenter.freeTimeslots());

        Random random = new Random();
        int randomIndex = random.nextInt(timeslotList.size());
        Timeslot selectedTimeslot = timeslotList.get(randomIndex);
        return selectedTimeslot;
        }





       // return selectedTimeslot;
        /*int choice = scanner.nextInt();

        if (choice < 1 || choice > vacCenter.getTimeslot().size()) {
            System.out.println("Μη έγκυρη επιλογή.");
            return null;
        }
        */
         */

        //εκτυπωση πληροφοριων του timeslot που επελεξε, πλιζ χελπ!
    }
}
