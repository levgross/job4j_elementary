package ru.job4j.inheritance;

public class Engineer extends Profession {
    private String computer;

    public Engineer(String name, String surname, String education, String birthday, String computer) {
        super(name, surname, education, birthday);
        this.computer = computer;
    }

    public String getComputer() {
        return computer;
    }

    public Design calculate(Design design) {
        return design;
    }
}