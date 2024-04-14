package org.example;

public class Insured extends Person{
    private String email;
    private String afm;
    private String birthdate;

    public Insured () { }
    public Insured(String name, String surname, String amka, String email, String afm, String birthdate) {
        super(name, surname, amka);
        this.email = email;
        this.afm = afm;
        this.birthdate = birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getAfm() {
        return afm;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setEmail (String email) {
        this.email = email;
    }
    public void setAfm (String afm) {
        this.afm = afm;
    }
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    public void print() {
        System.out.println("name: "+ getName() + ", "+ "surname:" + getSurname() + ", " + "amka:" + getAmka() + ","+
                "email:" + email + ", " + "afm:" + afm + "," + "birthdate:" + birthdate);
    }
}
