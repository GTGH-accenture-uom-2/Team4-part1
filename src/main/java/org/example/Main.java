package org.example;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        VaccinationCenter vacCenter1 = new VaccinationCenter("123", "egnatia 10");
        VaccinationCenter vacCenter2 = new VaccinationCenter("456", "tsimiski 10");
        ArrayList<VaccinationCenter> vaccinationCenters = new ArrayList<>();
        vaccinationCenters.add(vacCenter1);
        vaccinationCenters.add(vacCenter2);


        //examples
        System.out.println("hi");
        Person person = new Person("Louiza", "Kositzidou", "1234567891011");
        Insured insured = new Insured("Maria", "Aaaa", "1234567891011", "kkk@gmail.com", "123456789", "21/03/2002");
        person.printInfo();
        insured.print();


    }
}
