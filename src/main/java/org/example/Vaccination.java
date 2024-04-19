package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vaccination {

    private Insured insured;
    private Doctor doctor;
    private String vaccinationDate;
    private String expirationDate;


    public Vaccination(Insured insured, Doctor doctor, String vaccinationDate) {
        this.insured = insured;
        this.doctor = doctor;
        this.vaccinationDate = vaccinationDate;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }



    public String getVaccinationDate() {
        return vaccinationDate;
    }

    public String setVaccinationDate(String vaccinationDate) {
        this.vaccinationDate = vaccinationDate;
        return vaccinationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    //υποθετω οτι ο εμβολιασμος ληγει 9 μηνες μετα
    //και το format της ημερομηνιας ειναι dd/mm/yyyy
    public void setExpirationDate(String vaccinationDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate vaccinationDatetolocalDate = LocalDate.parse(vaccinationDate, formatter);
        LocalDate expirationDateNotFormatted = vaccinationDatetolocalDate.plusMonths(9);
        expirationDate =  expirationDateNotFormatted.format(formatter);
    }

    public String toString() {
        return "Vaccination{" +
                "insured=" + insured +
                ", doctor=" + doctor +
                ", vaccinationDate='" + vaccinationDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }




    //εαν το vaccinationDate το παιρνω απο την Timeslot θα αλλαξω το get
    //και θα σβησω το set

    //checkReservation?


    //προσθηκη boolean vaccinationComplete? ωστε να πραγματοποιεται ο εμβολιασμος
    //και να περναμε στον insured οτι εχει κανει εμβολιο? σαν καινουριο attribute? isVaccined?
}
