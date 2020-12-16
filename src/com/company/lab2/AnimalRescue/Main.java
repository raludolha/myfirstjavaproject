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
        myPerson.setPersonName("Ralu");
        myPerson.setPersonMoney(1234d);
        System.out.println("Brida's adoptator name is:" +myPerson.getPersonName() +  "   ,She has a lot of money:" +myPerson.getPersonMoney());

        Vet myVet=new Vet();
        myVet.setVetName("Anna");
        myVet.setVetSpecialization("Doctor");

        System.out.println("Brida's vet name is:" +myVet.getVetName() + " , She is a :" + myVet.getVetSpecialization());

        Dogfood mydogFood= new Dogfood();
        mydogFood.setDogfoodName("Friskies");
        mydogFood.setDogfoodPrice(2);
        mydogFood.setDogfoodQuantity(15);
        mydogFood.setDogfoodDisponibility(true);
        System.out.println("Brida's favorite food is:" +mydogFood.getDogfoodName() +
                " ,witch costs  " +mydogFood.getDogfoodPrice() + ", Quantity is  " +mydogFood.getDogfoodQuantity() + " In stock: " +mydogFood.getDogfoodDisponibility());

        Activities myActivities=new Activities();
        myActivities.setActivityName("sleeping");
        System.out.println("Brida's favourite activity is:" +myActivities.getActivityName());



    }

}
