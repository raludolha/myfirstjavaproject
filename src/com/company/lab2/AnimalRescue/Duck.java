package com.company.lab2.AnimalRescue;

public class Duck extends Animal{
    private String Type;
    private String Quack;

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
