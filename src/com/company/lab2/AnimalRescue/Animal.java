package com.company.lab2.AnimalRescue;

public abstract class Animal {
    private String name;
    private int age;
    private float weight;
    private String color;

    private boolean sleeping;
    private String eating;

    public abstract void speak();
    public boolean getSleeping() {
        return sleeping;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEating(String eating) {
        this.eating = eating;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getEating() {
        return eating;
    }
    public void pooping (){
        System.out.println("i poop");
    }

}
