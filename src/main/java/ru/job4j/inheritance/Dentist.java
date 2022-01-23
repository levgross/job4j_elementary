package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String teeth;

    public Dentist(String name, String surname, String education, String birthday, String hospital, String teeth) {
        super(name, surname, education, birthday, hospital);
        this.teeth = teeth;
    }

    public Dentist() {
    }

    public String getTeeth() {
        return teeth;
    }

    public Tooth drill(Patient patient, Tooth tooth) {
        return tooth;
    }
}
