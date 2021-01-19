package com.company.Lab6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args)
    {
        Lists Exercices = new Lists();
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Exercices.PrintList(list);

        Exercices.PrintList(Exercices.AddLists2(list, 10));
        Exercices.Number(list, 2);
        Exercices.Invers(list);
        List<String> list2 = new ArrayList<>(Arrays.asList("eu", "tu", "noi"));
        Exercices.ThreeParameters(list2, 2, "acesta");
        Exercices.Second(list, 9);
        Exercices.PrintList(list);
        Exercices.Afiseaza(list2);

    Exercices.LastExercice(list);

    }

    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    // si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.

    public void PrintList (List<Integer> Newlist){
        int i;
        for (i=0; i< Newlist.size(); i++)
        System.out.println(Newlist.get(i));

    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public List AddLists2 (List<Integer> TwoparametersList, int a){
        TwoparametersList.add(a);
        return TwoparametersList;

    }
   // Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
    // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void Number (List<Integer> Orice, int b){
        Orice.add (0,b);
        int i;
        for (i=0; i< Orice.size(); i++)
            System.out.println(Orice.get(i));
    }
    //Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
    // toate valorile din lista, dar invers(de la capat la inceput).
    public void Invers (List<Integer> Revers){
        int i;
        for (i= Revers.size()-1; i>=0; i--)
            System.out.println(Revers.get(i));

    }
    //Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
    // unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
    // iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
    public void ThreeParameters (List<String> StringList, int c, String Added){
        StringList.add(c, Added);
        int i;
        for (i=0; i<StringList.size(); i++)
            System.out.println(StringList.get(i));
    }
    //Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public void Second (List<Integer> Firstnumber, int x){
        Firstnumber.add(0, x);
    }
    //Scrieti o metoda Java care sa primeasca parametru o Lista,
    // si sa afiseze ce valori are lista, si ce pe ce pozitie. (Ex: “Pe pozitia 1 valoare este 4”).
    public void Afiseaza (List<String> AfiseazaValori){
        int i;
        for (i=0; i<AfiseazaValori.size(); i++)
        System.out.println("Pe pozitia "+i +", valoarea este "+ AfiseazaValori.get(i));

    }
//Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
    public int LastExercice (List<Integer> Showbiggestnumber){
        int i;
        int max= Showbiggestnumber.get(0);
        for (i=0; i< Showbiggestnumber.size(); i++)
            if (max< Showbiggestnumber.get(i))
                max=Showbiggestnumber.get(i);
        System.out.println(max);
            return max;

    }




}
