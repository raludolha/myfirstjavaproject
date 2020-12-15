package com.company.lab2.AnimalRescue;


public class Main {
    public static void main(String[] args) {
        Dog myDog=new Dog();
        myDog.setDogName("Brida");
        myDog.setDogAge(2);
        myDog.setDogHealth(9);
        myDog.setDogHungry(10);
        myDog.setFavoriteSport("Jump");
        myDog.setFavoriteFood("Friskies");
        System.out.println("My dog name:"+myDog.getDogname()
                       +
                ",she is: " +myDog.getDogAge() + "," +
               " her health is:" +myDog.getDogHealth() +
                "Her mood is:" +myDog.getDogMood() +
               "Her favorite food is:" +myDog.getFavoriteFood()
        );

        Person myPerson=new Person();
        System.out.println("Brida's adoptator name is:" +myPerson.name +  "   ,She has a lot of money:" +myPerson.money);

        Vet myVet=new Vet();
        System.out.println("Brida's vet name is:" +myVet.name + " , She is a :" + myVet.specialization);

        Dogfood mydogFood= new Dogfood();
        System.out.println("Brida's favorite food is:" +mydogFood.name +
                " ,witch costs  " +mydogFood.price + ", Quantity is  " +mydogFood.quantity + " In stock: " +mydogFood.disponibility);

        Activities myActivities=new Activities();
        myActivities.setActivityName("sleeping");
        System.out.println("Brida's favourite activity is:" +myActivities.getActivityName());



    }

}
