package com.company.lab2.AnimalRescue;


public class Main {
    public static void main(String[] args) {
        Dog myDog=new Dog();
        System.out.println("My dog name:"+myDog.name+ ",she is: " +myDog.age + ", her health is:" +myDog.health + "Her mood is:" +myDog.mood +"Her favorite food is:" +myDog.favoriteFood);
        Person myPerson=new Person();
        System.out.println("Brida's adoptator name is:" +myPerson.name +  "   ,She has a lot of money:" +myPerson.money);
        Vet myVet=new Vet();
        System.out.println("Brida's vet name is:" +myVet.name + " , She is a :" + myVet.specialization);
        Dogfood mydogFood= new Dogfood();
        System.out.println("Brida's favorite food is:" +mydogFood.name + " ,witch costs  " +mydogFood.price + ", Quantity is  " +mydogFood.quantity + " In stock: " +mydogFood.disponibility);
        Activities myActivities=new Activities();
        System.out.println("Brida's favourite activity is:" +myActivities.activityName );



    }

}
