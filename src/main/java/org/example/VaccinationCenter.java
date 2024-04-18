package org.example;

import java.util.ArrayList;

public class VaccinationCenter {
    private String code;
    private String address;
    private ArrayList<Timeslot> Timeslots;

    public VaccinationCenter(String code,String address){
        this.code = code;
        this.address = address;
        Timeslots = new ArrayList<>();

    }

    public VaccinationCenter(String code, String address, ArrayList<Timeslot> timeslots) {
        this.code = code;
        this.address = address;
        Timeslots = timeslots;
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

    /*public void addTimeslot(Timeslot timeslot){
        Timeslots.add(timeslot);
    }*/
    public ArrayList<Timeslot> freeTimeslots(){
        ArrayList<Timeslot> freeTimeslots = new ArrayList<>();
        for(Timeslot timeslot:Timeslots){
            if(timeslot.isFree()){
                freeTimeslots.add(timeslot);

            }

        }
        return freeTimeslots;
    }

    public boolean equals(VaccinationCenter vac){
        return (code.equals(vac.code)&&
                address.equals(vac.address));
    }

}
