package com.company.lab2.lab5.Lab7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadfromKeybord {
    public int readInt() {
        int x = 0;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextInt();
                read = false;

            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public float readFloat() {
        float x = 0.0f;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextFloat();
                read = false;

            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public double readDouble() {
        double x = 0.0d;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextDouble();
                read = false;

            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    public long readLong() {
        long x = 0l;
        boolean read = true;
        while (read) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introdu o valoare");
            try {
                x = scanner.nextLong();
                read = false;

            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return x;
    }

    //3. In clasa Read, creati o metoda care sa returneze un array de numere populat de la tastatura.
// Metoda sa primeasca ca si parametru un numar, care reprezinta cate pozitii are.
    public int[] Exercices3() {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Dimensiunea arrayul-ui:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Introduceti elementele:");
        for (int i = 0; i < n; i++) {
            try {
                a[i] = s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
            }
        }
        return a;
    }

    //    4. In clasa Read, creati o metoda care sa returneze o lista de numere populate de la tastatura.
//    Metoda nu v-a primii parametru lungimea. In rezolvarea ei trebuie folosit try-catch.
//    (Hint: a se citi de la tastatura atata timp cat valoarea primita e numar, cand nu mai e numar, sa se intrerupa citirea)
    public ArrayList Exercices4() {
        Scanner s = new Scanner(System.in);
        ArrayList a = new ArrayList();
        System.out.println("Introduceti elementele array-ului:");
        for (int i = 0; ; i++) {
            try {
                a.add(s.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Tipul valorii introduse nu este corect");
                return a;
            }
        }
//        return a;

    }
}
