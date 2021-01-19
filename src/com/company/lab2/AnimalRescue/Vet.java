package com.company.lab2.AnimalRescue;

public class Vet extends Person{
    public void sings(){
        System.out.println("lalalalalal");

    }

       private String name ;
        private String specialization ;

        public String getVetName() {
                return this.name;
        }

        public void setVetName(String ralu) {
                this.name = ralu;
        }
        public String getVetSpecialization(){
                return this.specialization;

        }
        public void setVetSpecialization(String doctor){
                this.specialization =doctor;

        }
}
