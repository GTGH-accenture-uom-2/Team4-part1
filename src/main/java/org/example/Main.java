package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //Create arraylist of doctors
        ArrayList<Doctor> doctors = new ArrayList<>();
        Doctor doc1 = new Doctor("maria", "k", "8754");
        Doctor doc2 = new Doctor("kwstas", "k", "8753");
        Doctor doc3 = new Doctor("dimitra", "k", "98674");
        Doctor doc4 = new Doctor("giwrgos", "k", "8764");

        //create arraylist of timeslots for VacCenter1
        ArrayList<Timeslot> timeslots1 = new ArrayList<>();
        timeslots1.add(new Timeslot(10, 4, 2024, 9, 0,
                9, 30, doc1));
        timeslots1.add(new Timeslot(10, 4, 2024, 10, 0,
                10, 30, doc2));
        timeslots1.add(new Timeslot(10, 4, 2024, 11, 0,
                9, 30, doc1));
        timeslots1.add(new Timeslot(10, 4, 2024, 12, 0,
                10, 30, doc2));
        timeslots1.add(new Timeslot(10, 4, 2024, 13, 0,
                9, 30, doc1));
        timeslots1.add(new Timeslot(10, 4, 2024, 14, 0,
                10, 30, doc2));
        timeslots1.add(new Timeslot(10, 4, 2024, 15, 0,
                9, 30, doc1));
        timeslots1.add(new Timeslot(10, 4, 2024, 16, 0,
                10, 30, doc2));
        timeslots1.add(new Timeslot(10, 4, 2024, 17, 0,
                9, 30, doc1));
        timeslots1.add(new Timeslot(10, 4, 2024, 18, 0,
                10, 30, doc2));

        //create arraylist of timeslots for VacCenter2
        ArrayList<Timeslot> timeslots2 = new ArrayList<>();
        timeslots2.add(new Timeslot(10, 4, 2024, 9, 0,
                9, 30, doc3));
        timeslots2.add(new Timeslot(10, 4, 2024, 10, 0,
                10, 30, doc4));
        timeslots2.add(new Timeslot(10, 4, 2024, 11, 0,
                9, 30, doc3));
        timeslots2.add(new Timeslot(10, 4, 2024, 12, 0,
                10, 30, doc4));
        timeslots2.add(new Timeslot(10, 4, 2024, 13, 0,
                9, 30, doc3));
        timeslots2.add(new Timeslot(10, 4, 2024, 14, 0,
                10, 30, doc4));
        timeslots2.add(new Timeslot(10, 4, 2024, 15, 0,
                9, 30, doc3));
        timeslots2.add(new Timeslot(10, 4, 2024, 16, 0,
                10, 30, doc4));
        timeslots2.add(new Timeslot(10, 4, 2024, 17, 0,
                9, 30, doc3));
        timeslots2.add(new Timeslot(10, 4, 2024, 18, 0,
                10, 30, doc4));

        //create arraylist of VacCenters
        ArrayList<VaccinationCenter> vaccinationCenters = new ArrayList<>();
        vaccinationCenters.add(new VaccinationCenter("123", "casterly rock", timeslots1));
        vaccinationCenters.add(new VaccinationCenter("456", "storm's end", timeslots2));

        //create arraylist of insures people
        ArrayList<Insured> insuredpeople = new ArrayList<>();
        insuredpeople.add(new Insured("Petyr", "Baelish", "128975439", "petyr@gmail.com",
                "673537", "11/03/1975"));
        insuredpeople.add(new Insured("Lord", "Varys", "373598", "lord@gmail.com",
                "846338", "17/03/1972"));
        insuredpeople.add(new Insured("Theon", "Greyjoy", "83635", "theon@gmail.com",
                "83625", "7/08/1973"));
        insuredpeople.add(new Insured("Sandor", "Clegane", "823627", "sandor@gmail.com",
                "927156", "5/12/1976"));
        insuredpeople.add(new Insured("Brienne", "of Tarth", "987534", "brienne@gmail.com",
                "82615", "15/12/1972"));
        insuredpeople.add(new Insured("Arya", "Stark", "765439", "arya@gmail.com",
                "76754", "10/1/1978"));
        insuredpeople.add(new Insured("Sansa", "Stark", "6535978", "sansa@gmail.com",
                "787530", "8/11/1973"));
        insuredpeople.add(new Insured("Jon", "Snow", "898674", "jon@gmail.com",
                "876430", "18/4/1972"));
        insuredpeople.add(new Insured("Daenerys", "Targaryen", "875643", "daeneys@gmail.com",
                "998764", "1/5/1974"));
        insuredpeople.add(new Insured("Tyrion", "Lannister", "7635234", "tyrion@gmail.com",
                "926254", "10/7/1970"));
        insuredpeople.add(new Insured("Cersei", "Lannister", "87632", "cersei@gmail.com",
                "9864309", "1/4/1979"));
        insuredpeople.add(new Insured("Ned", "Stark", "875318", "ned@gmail.com",
                "986752", "19/9/1976"));

        // Shuffle the list to get random ordering
        Collections.shuffle(insuredpeople);

        //make reservation for 8 insured people
        //prepei na ftiaxtei o elegxos gia to an apo randoms select vaccCenter na min dialegete panta 1.
        for (int i = 0; i < 8; i++){
        //make reservation
        Reservation reservation = insuredpeople.get(i).makeReservation(vaccinationCenters);
        Doctor doctor = reservation.findDoctor(doctors);
        doctor.addReservation(reservation);
        }

        //Make vaccination
        //Na min 3exaso avrio na valo oti emvoliazontai oi 6 apo tous 8
        for (Doctor doctor:doctors){
            for (Reservation res:doctor.getReservations()){
                //den xreiazetai mallon na epistrefei
                Vaccination VaccObj =res.getInsured().getVaccinated(res,doctor);
            }

        }

        //vaccinate 6 insured people, perimenw na apofasisoume methodous stin getvaccinated
        /*insuredpeople.get(0).getVaccinated(reservation1,doc1);
        insuredpeople.get(3).getVaccinated();
        insuredpeople.get(4).getVaccinated();
        insuredpeople.get(8).getVaccinated();
        insuredpeople.get(9).getVaccinated();
        insuredpeople.get(11).getVaccinated(); */

        //print next reservation
        //afou ginei o emvoliasmos na eleftherwnwtai i xroniki thirida opote emfanizw apla ta timeslots me
        // pedio is free false

        //print free timeslots
        //afou ginei o emvoliasmos na eleftherwnwtai i xroniki thirida opote emfanizw apla ta timeslots me
        // pedio is free true

        //print vaccination for each doctor

        ////print people up to 60 that has not made reservation




    }
}
