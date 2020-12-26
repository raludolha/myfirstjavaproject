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


        String result2 = op.Compare7(10);
        System.out.println(result2);


        String result3 = op.Compare8(2,3,4);
        System.out.println(result3);

        op.Count100(6);
    op.Countdown(-4);
    op.Countbetween(3,90);
    op.Countbiggest(90, 9);
    op.Numerepare();
    op.Numereimpare();

    int sum = op.Numbers(1);
        System.out.println(sum );
        float avg = op.Numbersmedia(99);
        System.out.println(avg);


}

    }