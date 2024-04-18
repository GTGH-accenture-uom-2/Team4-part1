package org.example;
import java.util.ArrayList;

public class Doctor extends Person {
    private ArrayList<Timeslot> timeslots;
    private ArrayList<Reservation> reservations;
    private VaccinationCenter vaccinationCenter;
    private ArrayList<Vaccination> vaccinations;

    public Doctor(String name, String surname, String amka) {
        super(name, surname, amka);
        timeslots = new ArrayList<>();
        reservations = new ArrayList<>();
        vaccinations = new ArrayList<>();
    }

    public VaccinationCenter getVaccinationCenter() {
        return vaccinationCenter;
    }

    public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
        this.vaccinationCenter = vaccinationCenter;
    }

    public void getInformed(ArrayList<Reservation> reservations) {
        for (Reservation rsv : reservations) {
            System.out.println(rsv.toString());
        }
    }

    //ana imera???


public ArrayList<Vaccination> getVaccinations() {
    return vaccinations;
}

public void setVaccinations(ArrayList<Vaccination> vaccinations) {
    this.vaccinations = vaccinations;
}

public void addTimeslot(Timeslot timeslot) {
    timeslots.add(timeslot);
}
public void addReservation(Reservation reservation) {
    reservations.add(reservation);
}

public void addVaccination(Vaccination vaccination) {
    vaccinations.add(vaccination);
}

public boolean equals(Doctor doc){
    return this.getAmka().equals(doc.getAmka());

}


}
