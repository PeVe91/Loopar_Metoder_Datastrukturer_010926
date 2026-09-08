package org.example;
/*
Programmet skriver ut:

#....
.#...
..#..
...#.
....#

Varje gång y-loopen körs så körs *hela* x-loopen
och därför skriver varje y-loop ut 5 tecken och gör därefter en radbrytning.

När x-loopens inleds första gången är if-villkoret uppfyllt.
Då skrivs "#" ut. I resterande fyra fall uppfylls else if-villkoret
och varje loop skriver ut "." tills x-loopen är klar.

Därefter uppfylls if-villkoret i x-loopen ett steg senare
för varje gång y-loopen körs.


*/
public class Uppg6 {
    static void main() {
        /*
        Vad skriver följande program ut:
        for(int y=0; y<5; y++) {
   		    for(int x=0; x<5; x++) {
       		    if( x == y )
           		    System.out.print("#");
       		    else
           		    System.out.print(".");
   		    }
   		System.out.println("");
        }

        */

        for(int y = 0; y <5 ; y++) {

            for(int x = 0; x < 5; x++) {
                if( x == y )
                    System.out.print("#");
                else
                    System.out.print(".");
            }

            System.out.println("");

        }

    }
}
