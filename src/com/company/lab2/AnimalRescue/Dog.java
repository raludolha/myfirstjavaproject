package com.company.lab2.AnimalRescue;

public class Dog extends Animal{
//    private String name ;
//    private int age ;
    private int health ;
    private int mood ;
    private int hungry ;
    private String favoriteFood ;
    private String favoriteSport ;


    @Override
    public void speak() {
        System.out.println("i am barking all day");
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
    public void pooping (){
        System.out.println("i poop twice a day");
    }
}
