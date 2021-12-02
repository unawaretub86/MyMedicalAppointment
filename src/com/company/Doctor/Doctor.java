package com.company.Doctor;

public class Doctor {
    static private int id = 0;
    private String name;
    private String speciality;

    public void showName(){
        System.out.println("Doctor's name is: " + name);
    }
    public void showId(){
        System.out.println("Your id is: " + id);
    }

    public Doctor(String name) {
        this.name = name;
        id++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
