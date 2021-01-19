package com.company.lab2.AnimalRescue;

public class Duck extends Animal{
    private String Type;
    private String Quack;

    @Override
    public void speak() {
        System.out.println("i am hungry most of the time");

    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getQuack() {
        return Quack;
    }

    public void setQuack(String quack) {
        Quack = quack;
    }
    public void pooping (){
        System.out.println("i poop once a week");
    }

}
