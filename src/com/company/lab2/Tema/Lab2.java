package com.company.lab2.Tema;

public class Lab2 {
    public static void main(String[] args) {
        float result = sum(2, 3);
        System.out.println(result);

        result = sub(2, 3);
        System.out.println(result);

        result = divide(2, 3, 4);
        System.out.println(result);
        design();
        design2();
        System.out.println(" Average is:"+average(3,4,5));
        System.out.println(modulo(5,2));
        System.out.println(celsius(200));
        System.out.println(inch(300));
        distance(2000, 5, 35, 14);


    }

    static int sum(int firstNumber, int secondNumber) {
        return (firstNumber + secondNumber);
    }

    static int sub(int firstNumber, int secondNumber) {
        return (firstNumber - secondNumber);
    }

    static float divide(float firstNumber, float secondNumber) {
        return (firstNumber / secondNumber);

    }


    static float divide(float firstNumber, float secondNumber, float thirdNumber) {

        return (firstNumber / secondNumber / thirdNumber);
    }


    static void design() {
        System.out.println("     J    a      v     v   a");
        System.out.println("     J   a  a     v   v   a a");
        System.out.println(" J   J   aaaaa     V V   aaaaa");
        System.out.println("   JJ    a     a    V   a     a");




    }
    static void design2() {
        System.out.println("  +\" \" \" \" \"+ ");
        System.out.println("[ |  o   o  | ]");
        System.out.println("  |    ^    |");
        System.out.println("  |   '_'   |");
        System.out.println("  +---------+ ");
    }

    static float average(float firstNumber, float secondNumber, float thirdNumber) {

        return ((firstNumber + secondNumber + thirdNumber)/3);
    }

    static int modulo(int firstNumber, int secondNumber) {

        return (firstNumber%secondNumber);
    }
    static float celsius (float F ) {// here convert to celsiusu
        float C = 5.0f/9.0f * (F -32);

        return C;
    }
    static float inch (float I) {// here convert to celsiusu
        float m = I * 0.0254f;

        return m;
    }

    static void distance (float m, int h, int min, int sec) {// here convert to celsiusu
        float v = m / sec;
        System.out.println(v + "m/s");
        float km = m / 1000;
        float v2 = km / h;
        System.out.println(v2 + "km/h");
        float mile = m/1609;
        float v3 = mile/h;
        System.out.println("Distance is:" + v3 +"mile/h");

    }




    }

