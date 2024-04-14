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
}
