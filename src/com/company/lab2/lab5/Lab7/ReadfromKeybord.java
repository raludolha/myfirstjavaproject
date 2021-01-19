package com.company.lab2.lab5.Lab7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadfromKeybord {
    public int readInt(){
        int x = 0;
        boolean read = true;
        while (read){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try{
                x = scanner.nextInt();
                read = false;

            }catch (InputMismatchException e){
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }
}
