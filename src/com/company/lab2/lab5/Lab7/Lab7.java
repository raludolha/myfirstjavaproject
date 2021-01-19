package com.company.lab2.lab5.Lab7;

import java.util.ArrayList;

public class Lab7 {

        public static void main (String[] args){
            int[] myArray = {10, 20,30,40};
            ReadfromKeybord read = new ReadfromKeybord();
//            int myInt = read.readInt();
////            System.out.println(myArray[myInt]);
//            System.out.println(myInt);
//            float myFloat= read.readFloat();
//            System.out.println(myFloat);
//            double myDouble = read.readDouble();
//            System.out.println(myDouble);
//            long myLong = read.readLong();
//            System.out.println(myLong);
            int[] result=read.Exercices3();
            int i;
            for  (i=0; i<result.length; i++)
            System.out.println(result[i]);

            ArrayList result2=read.Exercices4();
            for  (i=0; i<result2.size(); i++)
                System.out.println(result2.get(i));
        }
//        4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
//        Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
//        (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
//
    }

