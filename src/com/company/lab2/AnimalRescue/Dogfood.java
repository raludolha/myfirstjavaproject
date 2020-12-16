package com.company.lab2.AnimalRescue;

public class Dogfood {

        private String name ;
       private float price ;
        private int quantity ;
       private boolean disponibility ;

                public String getDogfoodName(){
                return this.name;
        }

                public void setDogfoodName (String foodname){
                this.name = foodname;
        }
        public float getDogfoodPrice() {
            return this.price;
        }
        public void setDogfoodPrice( float c){
                    this.price =c;

                }
    public int getDogfoodQuantity() {
                    return this.quantity;

    }
    public void setDogfoodQuantity(int t){
                    this.quantity =t;

                }
    public boolean getDogfoodDisponibility(){
                    return this.disponibility;

                }
    public void setDogfoodDisponibility(boolean da){
                    this.disponibility =da;
    }

        }
