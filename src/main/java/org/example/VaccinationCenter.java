package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VaccinationCenter {
    private String code;
    private String address;
    private ArrayList<Timeslot> Timeslots;
    private ArrayList<Reservation> reservations;
    //private Map<Timeslot, Boolean> timeslots2 = new HashMap<>();//για την δευτερη υλοποιηση με hasmap


    public VaccinationCenter(String code, String address, ArrayList<Timeslot> timeslots) {
        this.code = code;
        this.address = address;
        Timeslots = timeslots;
        reservations = new ArrayList<>();
    }


    public void setAddress(String address) {
        this.address = address;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public String getCode() {
        return code;
    }

    public ArrayList<Timeslot> getTimeslots() {
        return Timeslots;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }


    public ArrayList<Timeslot> notFreeTimeslots(){
        ArrayList<Timeslot> notFreeTimeslots = new ArrayList<>();
        for(Timeslot timeslot:Timeslots){
            if(!timeslot.isFree()){
                notFreeTimeslots.add(timeslot);

            }

        }
        return notFreeTimeslots;
    }


    public boolean equals(VaccinationCenter vac){
        return (code.equals(vac.code)&&
                address.equals(vac.address));
    }

    public void printUpcomingReservations(){
        System.out.println("-----Upcoming date----");
        System.out.println("");
        for(Reservation reservation:reservations){
            System.out.println(reservation);
            System.out.println("");
        }
    }

    public void printFreeTimeslot(ArrayList<Timeslot> timeslots) {
        System.out.println("-----Upcoming date----");
        timeslots.stream().filter(x -> x.isFree()).forEach(System.out::println);
    }

    public ArrayList<Timeslot> getFreeTimeslots(ArrayList<Timeslot> timeslots){
        return (ArrayList<Timeslot>) timeslots.stream().filter(x -> x.isFree()).toList();
    }


    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void printInsuredWithNoReservation(ArrayList<Insured>insureds){
        insureds.stream().filter(x->x.birthdateToAge(x.getBirthdate())>60).
                filter(x->reservations.stream()
                        .noneMatch(reservation -> reservation.getInsured().equals(x)))
                .forEach(System.out::println);

    }


    /*
    public ArrayList<Insured> findInsuredWithoutReservation(ArrayList<Insured> insuredNoRes){
        ArrayList <Insured> notReservationInsured = new ArrayList<>();
        for(Insured insured:insuredNoRes){
            for(Reservation reservation:reservations){
                if (insured.equals(reservation.getInsured())){
                    break;
                }
                else{
                    notReservationInsured.add(insured);
                }

            }
        }
        return notReservationInsured;
    }

    public void printInsuredWithoutReservation(ArrayList<Insured> insuredNoRes){
        ArrayList <Insured> notReservationInsured = this.findInsuredWithoutReservation(insuredNoRes);
        System.out.println("Insured over 60 without reservation");
        System.out.println("");
        System.out.println("");
        for(Insured insured:notReservationInsured){
            if(Integer.parseInt(insured.getBirthdate())>60){
                System.out.println("------------");
                insured.print();
                System.out.println("");
            }
        }
    }

     */
    /* για την δευτερη υλοποιηση με hasmap
    public Map<Timeslot, Boolean> getTimeslots2() {
        return timeslots2;
    }*/


}
