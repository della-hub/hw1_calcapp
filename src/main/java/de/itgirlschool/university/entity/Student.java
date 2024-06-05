package de.itgirlschool.university.entity;

import de.itgirlschool.university.util.EnteringAuditorium;
import de.itgirlschool.university.util.ParticipatingInClass;

public class Student implements EnteringAuditorium, ParticipatingInClass {

    String teacher = "professor";
    String school = "university";

    @Override
    public void enter() {
        freeSeat();
        System.out.println("I am a Student and I am entering auditorium of the " + school + " for a class");

    }
    private void freeSeat() {
        System.out.println("I am a student and to enter class there should be a free seat for me");
    }

    @Override
    public void participate() {
        question();
        System.out.println("I am raising my hand to participate in discussion with " + teacher);
    }
    private void question() {
        System.out.println("To raise my hand I need to hear a question from the "+ teacher);
    }
}
