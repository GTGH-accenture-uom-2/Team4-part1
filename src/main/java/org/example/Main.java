package org.example;


public class Main {
    public static void main(String[] args) {
        //examples
        System.out.println("hi");
        Person person = new Person("Louiza", "Kositzidou", "1234567891011");
        Insured insured = new Insured("Maria", "Aaaa", "1234567891011", "kkk@gmail.com", "123456789", "21/03/2002");
        person.printInfo();
        insured.print();


    }
}
