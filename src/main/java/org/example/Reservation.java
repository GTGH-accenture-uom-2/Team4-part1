package org.example;
public class Reservation {
    private Insured insured;
    private Timeslot timeslot;
    private VaccinationCenter vaccinationCenter;

    public Reservation(Insured insured, Timeslot timeslot) {
        this.insured = insured;
        this.timeslot = timeslot;
    }

    public Reservation(Insured insured, Timeslot timeslot, VaccinationCenter vaccinationCenter){
        this.insured = insured;
        this.timeslot = timeslot;
        this.vaccinationCenter = vaccinationCenter;
    }

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Timeslot getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(Timeslot timeslot) {
        this.timeslot = timeslot;
    }

    public String toString(){
        return "Reservation: " + "insured: " +insured.getName() + " " +insured.getSurname()
                +" ,timeslot: " +timeslot + " ,vaccinationCenter: " + vaccinationCenter.getCode();
    }
}