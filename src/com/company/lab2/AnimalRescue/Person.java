package com.company.lab2.AnimalRescue;

public abstract class Person {
        public abstract void sings();


        private String name ;
        private double money ;

        public String getPersonName() {
                return this.name;
        }

        public void setPersonName(String ralu) {
                this.name = ralu;
        }
        public double getPersonMoney(){
                return this.money;

        }
        public void setPersonMoney(double a){
                this.money =a;

        }
}
