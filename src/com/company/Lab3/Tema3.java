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
        op.Asterix();
        op.Nrwhile(0);
        op.Nrdown(0);
        op.Countbetween2(2, 90);
        op.Countbiggest2(166, 400);
        op.Numerepare2();
        op.Numereimpare2();
        op.Numbers2();
        op.Div(1, 7);
        op.Fibonacci();
        op.wozaCozaLoza();

        float result4 =pc.sum(2,3f);
        System.out.println(result4);
        op.Array100();

        int[] Array= new int[50];
    int[] resultarray =op.Arrayeven(Array);
        System.out.println(resultarray);
        int i;
        for (i=0; i<=49; i++){
            System.out.println(resultarray[i]);
        }
       int[] ralu=new int[]{5,6,6};
        float resultarray2=op.Arrayavg(ralu);
        System.out.println(resultarray2);
    boolean results= op.Truefalse(new String[]{"Ralu", "Noemi","Cristi"}, "Brida");
        System.out.println(results);
        int position= op.Return(new int[]{1,2,3,4}, 4);
        System.out.println(position);
        int second= op.secondsmallest(new int[]{3,1,8,2});
        System.out.println(second);
        int[]a ={4,5,6,7}; int[]b=new int[a.length];
        b=op.copyarray(a,b);
        for (i=0; i<b.length; i++){
            System.out.println(b[i]);
}




    }}