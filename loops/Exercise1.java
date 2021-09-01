package sda.loops;

/*
Napisz program, który
- Wyświetla w konsoli liczby od 0 do 4 przy użyciu pętli while
- Wyświetla w konsoli liczby od 0 do 4 przy użyciu pętli for.
 */

public class Exercise1 {
    public static void main(String[] args) {
        int loop=0;
        boolean status = true;
        while (status) {
            System.out.println(loop);
            loop++;
            if(loop==5)
                status=false;
        }
        loop=0;
        while (loop<=4){
            System.out.print(loop);
            loop++;
        }
        System.out.println();
        for(loop=0; loop<=4; loop++) {
            System.out.println(loop);
        }
    }
}


