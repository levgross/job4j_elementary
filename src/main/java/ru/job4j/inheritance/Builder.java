package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String building;

    public Builder(String name, String surname, String education,
                   String birthday, String computer, String building) {
        super(name, surname, education, birthday, computer);
        this.building = building;
    }

    public Builder() {
    }

    public String getBuilding() {
        return building;
    }

    public House build(House house) {
        return house;
    }
}
