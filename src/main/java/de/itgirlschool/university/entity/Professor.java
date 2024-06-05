package de.itgirlschool.university.entity;

import de.itgirlschool.university.util.EnteringAuditorium;
import de.itgirlschool.university.util.Teaching;

public class Professor implements EnteringAuditorium, Teaching {
    @Override
    public void enter() {
        System.out.println("I am a professor and I am entering auditorium");
    }

    @Override
    public void teach() {
        assignment();
        System.out.println("I am a professor and I teach this class");

    }
    private void assignment() {
        System.out.println("To teach a class I have to be assigned");
    }
}
