package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String cut;

    public Surgeon(String name, String surname, String education, String birthday, String hospital, String teeth) {
        super(name, surname, education, birthday, hospital);
        this.cut = cut;
    }

    public String getCut() {
        return cut;
    }

    public Wound stitch(Patient patient, Wound wound) {
        return wound;
    }
}