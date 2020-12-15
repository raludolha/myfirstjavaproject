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



    public String Compare (String text ,int a){
        if (text.equals("FastTrackIT")&& a<=3){
            return text + a;
        }
        else return a +text;


    }
//    6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
//    Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
//        “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze “
//    The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.
   public String Compareint (int b){
        if (b>8||b==6){
            return "The amount of snow this winter was(cm)" + b;

        }
        else return "The forecast snow is(cm):" + b;

    }
//    Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
//    Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
//    unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului "The number is:"
//    cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.
    public void CompareSwitch (int c){

        //Switch expression
        switch(c){
            //Case statements
            case 10: System.out.println("The number is 10");
                break;
            case 20: System.out.println("The number is 20");
                break;
            case 30: System.out.println("The number is 30");
                break;
            //Default case statement
            default:System.out.println("Not in 10, 20 or 30");
        }

    }
}
