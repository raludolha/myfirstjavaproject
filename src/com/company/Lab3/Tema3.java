package com.company.Lab3;

public class Tema3 {
    public static void main(String[] args) {
    Calculator pc=new Calculator();
    int result =pc.sum(2,3);
    System.out.println(result);

     result =pc.sub(10,5);
     System.out.println(result);

     float result1 =pc.divide(6f,3f);
        System.out.println(result1);

       LogicOp op = new LogicOp();

        int biggest = op.checkBiggerNumber(2,3);
        System.out.println("The bigger number is: " + biggest);

        System.out.println("The result is:  " + op.Compare("FastTrackIT" , 3));
        System.out.println("The result is:  " + op.Compare("Ralu" , 3));
        System.out.println("The Compareint result is: " + op.Compareint(4));
        op.CompareSwitch(15);



}

    }