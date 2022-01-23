package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, String education,
                      String birthday, String computer, String programmingLanguage) {
        super(name, surname, education, birthday, computer);
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer() {
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Program code(Program program) {
        return program;
    }
}
