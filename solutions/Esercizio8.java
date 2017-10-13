// vectors sum
// 
// Dato il seme dell'oggetto Random da input, e dati 2 vettori di interi, 
// popolare entrambi con 100 numeri casuali a testa.
// Stampare rispettivamente 1 o 2 se il primo ha la somma totale piu' alta o
// viceversa
//
// java Esercizio8 int

import java.util.Random;

public class Esercizio8 {
    public static void main(String[] args) {
        int seed = Integer.parseInt(args[0]);
        int[] firstVector = new int[100];
        int[] secondVector = new int[100];
        Random r = new Random(seed);
        for (int i=0; i<100; i++) {
            firstVector[i] = r.nextInt();
            secondVector[i] = r.nextInt();
        }

        long sumFirst = 0;
        long sumSecond = 0;
        for (int i=0; i<100; i++) {
            sumFirst += firstVector[i];
            sumSecond  += secondVector[i];
        }
        if (sumFirst <= sumSecond) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }

    }
}
