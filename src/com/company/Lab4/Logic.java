package com.company.Lab4;

public class Logic {
    public void printBackwords(int firstNumber, int secondNumber){
        for (int i = firstNumber; i>=secondNumber; i--){
            System.out.println(i);
        }
    }
    //Sum the numbers from 1 to 100;
    public int getSum ( int first, int last){
        int sum = 0;
        for (int i = first; i <= last; i++) {
            sum = i + sum;

        }
        return sum;
    }
}

