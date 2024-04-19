package org.example;

import java.util.ArrayList;

public class VaccinationCenter {
    private String code;
    private String address;
    private ArrayList<Timeslot> Timeslots;
    private ArrayList<Reservation> reservations;



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

    public ArrayList<Timeslot> freeTimeslots(){
        ArrayList<Timeslot> freeTimeslots = new ArrayList<>();
        for(Timeslot timeslot:Timeslots){
            if(timeslot.isFree()){
                freeTimeslots.add(timeslot);

            }

        }
        return freeTimeslots;
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

    public void printFreeTimeslots(){
        ArrayList<Timeslot> freeTimeslots = this.freeTimeslots();
        System.out.println("-----Upcoming date----");
        System.out.println("");
        for(Timeslot tmslt:freeTimeslots){
            System.out.println(tmslt);
            System.out.println("");
        }
    }
    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

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


}
