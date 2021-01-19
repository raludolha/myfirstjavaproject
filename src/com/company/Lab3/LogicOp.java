package com.company.Lab3;

public class LogicOp {
    public int checkBiggerNumber(int first, int second) {

        if (first > second) {

            return first;

        } else {

            return second;

        }


    }
//   . Creati o metoda de tip String, care sa primeasca un parametru de tip String,
//    si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”,
//    si numarul primit ca si parametru este mai mic sau egal cu 3, returnati textul si numarul,
//    in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
//    returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.


    public String Compare(String text, int a) {
        if (text.equals("FastTrackIT") && a <= 3) {
            return text + a;
        } else return a + text;


    }

    //    6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
//    Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
//        “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “
//    The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.
    public String Compareint(int b) {
        if (b > 8 || b == 6) {
            return "The amount of snow this winter was(cm)" + b;

        } else return "The forecast snow is(cm):" + b;

    }

    //    Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//    Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
//    unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:"
//    cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.
    public void CompareSwitch(int c) {

        //Switch expression
        switch (c) {
            //Case statements
            case 10:
                System.out.println("The number is 10");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            //Default case statement
            default:
                System.out.println("Not in 10, 20 or 30");
        }

    }
//    7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
//    Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
//    Daca numarul este egal cu 4, returnati “The number is equal to 4”,
//    iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

    public String Compare7(int y) {
        if (y > 3 && y != 4) {
            return ("The number is greater than 3 and not equal to 4");

        } else if (y == 4) {
            return ("The number is equal to 4");

        } else if (y < 3) {
            return ("The number is lower than 3");
        }


        return ("The number does not meet any of the requirements");
    }
//    Creati o metoda care sa primeasca 3 numere ca si parametrii
//    si sa returneze cel mai mare numar. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String Compare8(int a, int b, int c) {
        if (a > b && a > c) {
            return ("The biggest number is a");


        } else if (b > a && b > c) {
            return ("The biggest number is b");

        } else if (c > a && c > b) {
            return ("The biggest number is c");
        }

        return ("The number does not meet any of the requirements");

    }
    //   Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    //  Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.


    public void Count100(int s) {
        if (s < 100) ;
        for (int i = s; i <= 100; i++) {
            System.out.print(i + " ");

        }
        System.out.println();

    }
    //2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
    // deoarece metoda afiseaza, nu returneaza.

    public void Countdown(int d) {
        if (d > (-100))
            for (int i = d; i >= (-100); i--) {
                System.out.print(i + " ");

            }
        System.out.println();

    }
    //3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
    //
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void Countbetween(int a, int b) {

        for (int i = a; i <= b; i++) {
            System.out.println(i + " ");
        }
    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare
    // de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    //
    //
    //Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public void Countbiggest(int z, int x) {
        if (z > x)
            for (int i = x; i <= z; i++) {
                System.out.print(i + " ");
            }
        else for (int i = z; i <= x; i++) {
            System.out.print(i + " ");
        }
    }
    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void Numerepare() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.println(i);
        }

    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void Numereimpare() {
        for (int i = 1; i <= 100; i = i + 2) {
            System.out.println(i);
        }
    }

    //7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // iar la final sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int Numbers(int a) {
        int sum = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;

        }

        return sum;
    }

    //8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media. Apelati metoda in clasa Main,
    // metoda main() pentru a verifica daca functioneaza.
    public float Numbersmedia(int a) {
        float sum = 0;
        for (int i = a; i <= 100; i++) {
            sum = sum + i;

        }
        float avg = sum / (100 - a + 1);

        return avg;
    }
    //9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //
    //
    //*******
    //
    //******
    //
    //*****
    //
    //****
    //
    //***
    //
    //**
    //
    //*
    //
    //Cateva mentiuni:
    //- pentru a putea rezolva problema, trebuie folosite doua bucle for. O bucla se va construi in alta bucla.
    //
    //- prima bucla for se va ocupa de afisarea pe orizontala, si cealalta pe verticala
    //
    //- semnul asterisk (*) se poate afisa sub forma de string
    //
    //Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.

    public void Asterix() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void Nrwhile(int a) {
        int i = a;
        while (i <= 100) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
    }

    //2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru.
// Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
// Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.
    public void Nrdown(int b) {
        int i = b;
        while (i >= (-100)) {
            System.out.print(i + " ");
            i--;
        }
        System.out.println();
    }

    //3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.

    public void Countbetween2(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

    }
    //4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    // (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).

    public void Countbiggest2(int z, int x) {

        if (x < z) {
            int i = x;
            while (i <= z) {
                System.out.print(i + " ");
                i++;
            }
        } else {
            int i = z;
            while (i <= x) {
                System.out.print(i + " ");
                i++;
            }
        }
        System.out.println();

    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void Numerepare2() {
        int i = 2;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }


    }
    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void Numereimpare2() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i = i + 2;
        }
    }
//7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala,
// iar dupa aceea sa se calculeze si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda,
// pentru a numara toate numerele din interval.


    public void Numbers2() {
        float sum = 0;
        float i = 111;
        float count = 0;
        while (i <= 8899) {
            sum = sum + i;
            i++;
            count++;

        }
        float avg = sum / count;
        System.out.println(sum + " " + avg);
    }

    //8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7, din acel interval.

    public void Div(int a, int b) {
        float i = 0;
        float sum = 0;
        float count = 0;
        while (i <= b) {
            if (i % 7 == 0) {
                sum = sum + i;
                count++;
            }
            i++;
        }
        float avg = sum / count;
        System.out.println(avg);
    }


//9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void Fibonacci() {
        int n = 20;
        int first = 0;
        int next = 1;
        int sum = 0;
        System.out.println("The first  " + 20 + " Fibonacci numbers are:  ");
        System.out.print(first + " " + next);

        int i = 1;
        while (i < n - 1) {
            sum = first + next;
            first = next;
            next = sum;
            System.out.print(" " + sum);
            i++;
        }

    }


    //10. Creati o metoda numita CozaLozaWoza.
//
//        Metoda va afisa:
//
//        - numerele de la 1 la 110
//
//        - 11 numere pe linie
//
//        - se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
//
//        - se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
//
//        - se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)
//
//        - se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
//
//        - se va afisa CozaWoza pentru multiplu de 3 SI 7
//
//        - se va afisa WozaLoza pentru multiplu de 5 SI 7
//
//        - se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7
//
//        Ar trebui sa arate similar:
//
//        1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11
//
//        Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22
//
//        23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
//
//
//        ......
    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;

        }

    }
    ////2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
    //// Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public void Array100(){
        int[] Array100= new int[100];
        int i;
        for (i=0; i<100; i++){
            Array100[i]=i+1;
            System.out.println((i+1) + "inserted");
        }


    }
    //3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol,
    // si sa il returneze populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.
    // Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla.


    public int[] Arrayeven (int[] blind){
        int i;
        int j=0;
        for (i=2; i<=100; i=i+2){
            blind[j]= i;
            j++;


        }
        return blind;

    }
    //4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    // Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica daca functioneaza.
    public float Arrayavg (int[] avg){
        int i;
        float sum = 0;
        for (i=0; i<avg.length; i++){
            sum=sum +avg[i];

        }
        return sum/ avg.length;
    }
    //5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori, si un parametru de tip String.
    // Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit, iar daca da sa returneze true iar daca nu, sa returneze false.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean Truefalse (String[] names , String someone){
        boolean exists= false;
        int i;
        for(i=0; i< names.length; i++ ){
            if(names[i]==someone)
                exists=true;


        }
        return exists;
    }
    //6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
    // Metoda sa verifice daca numarul primit se afla in array-ul primit, si daca da, atunci sa returneze pozitia pe care se afla numarul.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int Return (int[] a, int b){
        int i;
        for (i=0; i< a.length; i++){
            if(a[i]==b){
                return i;
            }
        }
        return -1;
    }
//8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori, si un parametru de tip numar.
// Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul primit, fara acel numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    //9. Creati o metoda care sa primeasca un array, si sa returneze al doilea cel mai mic numar din array.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public  int secondsmallest (int[]a){
        int c;
        int i;
        int j;
        for (i=0; i<a.length; i++){
            for(j=i+1; j<a.length; j++){
                if (a[i]>a[j]){
                    c= a[i];
                    a[i]=a[j];
                    a[j]=c;
                }
            }
        }
        return a[1];
    }
    //10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.
    // Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.
    // Apelati metoda in main() pentru a verifica daca functioneaza.
    public int[] copyarray (int[]a, int[]b) {
        int i;
        for (i=0; i<a.length; i++){
            b[i]=a[i];
        }
        return b;
    }{
    }


//5. In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
////    Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
////    iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul:
////    "Inside catch, number too large".

    public void findOutOfBounds(int[] array, int position){
        try {
            System.out.println(array[position]);
        }
        catch(ArrayIndexOutOfBoundsException exception) {
            System.out.println("Pozitia e mai mare decat lungimea array-ului");
        }
    }
//    6. In clasa LogicalOp, creati o metoda  'wait()'. Metoda sa nu returneze nimic,
//    dar sa primeasca un parametru de tip int. In interiorul ei, tratati metoda Thread.sleep(),
//    astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte. Ex: wait(5) -> asteapta 5 secunde.

}
