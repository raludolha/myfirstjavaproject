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
//    7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
//    Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
//    Daca numarul este egal cu 4, returnati “The number is equal to 4”,
//    iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
//    Apelati metoda in main() pentru a verifica daca functioneaza.

    public String Compare7 (int y){
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

        public String Compare8 (int a, int b, int c){
        if (a>b&& a>c){
            return ("The biggest number is a");


    } else if (b>a&&b>c){
            return ("The biggest number is b");

        }else if (c>a&&c>b){
            return ("The biggest number is c");
        }

return ("The number does not meet any of the requirements");

    }
}
