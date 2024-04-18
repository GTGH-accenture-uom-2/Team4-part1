package org.example;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Doctor> doctors = new ArrayList<>();
        Doctor doc1 = new Doctor("maria", "k", "8754");
        Doctor doc2 = new Doctor("kwstas", "k", "8753");
        Doctor doc3 = new Doctor("dimitra", "k", "98674");
        Doctor doc4 = new Doctor("giwrgos", "k", "8764");

        ArrayList<Timeslot> timeslots1 = new ArrayList<>();
        timeslots1.add(new Timeslot(10, 4, 2024, 9, 0,
                9, 30, doc1);
        timeslots1.add(new Timeslot(10, 4, 2024, 10, 0,
                10, 30, doc2);


        ArrayList<Timeslot> timeslots2 = new ArrayList<>();
        timeslots2.add(new Timeslot(11, 4, 2024, 9, 30,
                10, 0, doc3);
        timeslots2.add(new Timeslot(11, 4, 2024, 11, 0,
                11, 30, doc4);

        ArrayList<VaccinationCenter> vaccinationCenters = new ArrayList<>();
        vaccinationCenters.add(new VaccinationCenter("123", "casterly rock"), timeslots1);
        vaccinationCenters.add(new VaccinationCenter("456", "storm's end"), timeslots2);


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














    }
}
