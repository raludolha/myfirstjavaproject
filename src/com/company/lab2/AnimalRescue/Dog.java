package com.company.lab2.AnimalRescue;

public class Dog {
    private String name = "Brida";
    private int age = 1;
    private int health = 10;
    private int mood = 9;
    private int hungry = 9;
    private String favoriteFood = "Friskies";
    private String favoriteSport = "Running";

    public String getDogname() {
        return this.name;
    }

    public void setDogName(String dogName) {
        this.name = dogName;
    }

    public int getDogAge() {
        return this.age;
    }

    public void setDogAge(int age) {
        this.age = age;

    }

    public int getDogHealth() {
        return this.health;
    }

    public void setDogHealth(int good) {
        this.health = good;
    }

    public int getDogHungry() {
        return this.hungry;
    }

    public void setDogHungry(int not) {
        this.hungry = not;
    }

    public String getFavoriteFood() {
        return this.favoriteFood;
    }

    public void setFavoriteFood(String papa) {
        this.favoriteFood = papa;
    }

    public String getFavoriteSport() {
        return this.favoriteSport;
    }
    public void setFavoriteSport(String jump){
        this.favoriteFood =jump;
    }
    public int getDogMood(){
        return this.mood;
    }
    public void setDogMood(int mood){
        this.mood = mood;

    }
}
