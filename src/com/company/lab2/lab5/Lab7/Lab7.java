package com.company.lab2.lab5.Lab7;

public class Lab7 {

        public static void main (String[] args){
            int[] myArray = {10, 20,30,40};
            ReadfromKeybord read = new ReadfromKeybord();
            int myInt = read.readInt();
            System.out.println(myArray[myInt]);
        }
    }

