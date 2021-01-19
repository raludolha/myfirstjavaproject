package com.company.lab2.AnimalRescue;

public class Cat extends Animal{
    private boolean Purr;
    private String Breed;
    private int Laziness;

    @Override
    public void speak() {
        System.out.println("I am crying all the time");
    }

    public boolean isPurr() {
        return Purr;
    }

    public void setPurr(boolean purr) {
        Purr = purr;
    }

    public String getBreed() {
        return Breed;
    }

    public void setBreed(String breed) {
        Breed = breed;
    }

    public int getLaziness() {
        return Laziness;
    }

    public void setLaziness(int laziness) {
        Laziness = laziness;
    }
}
