package com.company.lab2.AnimalRescue;


public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.setName("Brida");
        myDog.setAge(2);
        myDog.setDogHealth(9);
        myDog.setDogHungry(10);
        myDog.setFavoriteSport("Jump");
        myDog.setFavoriteFood("Friskies");
        System.out.println("My dog name:" + myDog.getName()
                +
                ",she is: " + myDog.getAge() + "," +
                " her health is:" + myDog.getDogHealth() +
                "Her mood is:" + myDog.getDogMood() +
                "Her favorite food is:" + myDog.getFavoriteFood()
        );

//        Person myPerson = new Person();
//        myPerson.setPersonName("Ralu");
//        myPerson.setPersonMoney(1234d);
//        System.out.println("Brida's adoptator name is:" + myPerson.getPersonName() + "   ,She has a lot of money:" + myPerson.getPersonMoney());

        Vet myVet = new Vet();
        myVet.setVetName("Anna");
        myVet.setVetSpecialization("Doctor");

        System.out.println("Brida's vet name is:" + myVet.getVetName() + " , She is a :" + myVet.getVetSpecialization());

        Dogfood mydogFood = new Dogfood();
        mydogFood.setDogfoodName("Friskies");
        mydogFood.setDogfoodPrice(2);
        mydogFood.setDogfoodQuantity(15);
        mydogFood.setDogfoodDisponibility(true);
        System.out.println("Brida's favorite food is:" + mydogFood.getDogfoodName() +
                " ,witch costs  " + mydogFood.getDogfoodPrice() + ", Quantity is  " + mydogFood.getDogfoodQuantity() + " In stock: " + mydogFood.getDogfoodDisponibility());

        Activities myActivities = new Activities();
        myActivities.setActivityName("sleeping");
        System.out.println("Brida's favourite activity is:" + myActivities.getActivityName());


        Cat myCat = new Cat();
        myCat.setBreed("BritishShortHair");
        myCat.setPurr(true);
        myCat.setLaziness(10);
        myCat.setAge(4);
        myCat.setName("Miji");
        myCat.setSleeping(true);
        myCat.setWeight(1.4f);
        System.out.println("My cat name:" + myCat.getName()
                +
                ",she is: " + myCat.getAge() + "," +
                " her sleeping is:" + myCat.getSleeping() +
                "Her laziness is:" + myCat.getLaziness() +
                "Her weight is:" + myCat.getWeight()
                + "Her breed is:" + myCat.getBreed());

        Duck myDuck = new Duck();
        myDuck.setType("Divingduck");
        myDuck.setQuack("quackkkkQuackk");
        System.out.println("My duck type is :" + myDuck.getType()
        + " her quack is: " + myDuck.getQuack());

    myCat.pooping();
    myDog.pooping();
    myDog.speak();
    myCat.speak();
    myDuck.speak();
    myVet.sings();

    }

}
