package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Grossevich Lev");
        student.setGroup("Trainee");
        student.setEntered(new Date());

        System.out.println(student.getName() + " is a student of the group " + student.getGroup()
                + " since " + student.getEntered() + ".");
    }
}
