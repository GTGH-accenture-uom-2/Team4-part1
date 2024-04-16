package org.example;

public class Timeslot {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minutes;
    private int startMinute;
    private int endMinute;
    private Doctor doc;

    public Timeslot(int day, int month, int year, int hour, int minutes, int startMinute, int endMinute, Doctor doc) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minutes = minutes;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.doc = doc;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }
}
