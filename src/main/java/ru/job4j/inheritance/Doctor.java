package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String hospital;

    public Doctor(String name, String surname, String education, String birthday, String hospital) {
        super(name, surname, education, birthday);
        this.hospital = hospital;
    }

    public Doctor() {
    }

    public String getHospital() {
        return hospital;
    }

    public Diagnosis heal(Patient patient, Diagnosis diagnosis) {
        return diagnosis;
    }
}
