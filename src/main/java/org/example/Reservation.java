package org.example;

import java.util.ArrayList;

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

    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
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

    //in order to find from reservation the doctor that has the insured
    public Doctor findDoctor(ArrayList<Doctor> doctors){
        for(Doctor doctor:doctors){
            if (vaccinationCenter.equals(doctor.getVaccinationCenter())){
                for(Timeslot doc_timeslot:doctor.getTimeslots()){
                    if (timeslot.equals(doc_timeslot))
                        return doctor;
                }
            }
        }
        return null;
    }


}