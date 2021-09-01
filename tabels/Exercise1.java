package tabels;

/*
Napisz program w którym:
 - zadeklarujesz tablicę typu liczbowego
 - przypiszesz wybrane przez Ciebie wartości w danej tablicy
 - wyświetlisz stan tablicy w konsoli przed sortowaniem
 - posortujesz tablicę rosnąco
 - wyświetlisz stan tablicy po sortowaniu
 */

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
       int []tab = new int[]{1, 2, 3, 4, 3, 7,5};
        int temp;
        boolean myFlag = true;
        while(myFlag){
            myFlag = true;
            for(int i=0; i<tab.length-1; i++){
                if(tab[i]>tab[i+1]){
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    myFlag = false;
                }
            }
        }
        for(int i=0; i<tab.length; i++){
            System.out.print(tab[i]+" ");
        }

    }
}