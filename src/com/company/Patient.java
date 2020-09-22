package com.company;

public class Patient {
    String name;
    String sickness;
    boolean sick = true;
    Patient(String name, String sickness){
        this.name = name;
        this.sickness = sickness;
        if(sickness == null) {
            sick = false;
        }
    }
    Patient(String name) {
        this.name=name;
        this.sick=false;
    }
    public String getName(String name){
        return name;
    }
    public boolean isSick() {
        return sick;
    }
    public String getSickness(String sickness){
        return sickness;
    }
    public void takeMedication(Medicine medicine) {
        medicine.g
    }

}
