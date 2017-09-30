// Slot Machine
//
// Simula le possibilita' di vittoria in una slot Machine
// La macchina ha 7 simboli e 3 slot. Per fare jackpot devono uscire 3 simboli
// uguali. Il comportamento deve essere casuale ma per verificarne la
// correttezza usa come seme il valore 13
// Stampa il numero di volte che e' uscito jackpot su un milione di tentativi
//
// java Esercizio6

import java.util.Random;

public class Esercizio6 {
    public static void main(String[] args) {
        Random random = new Random(13);
        int winCount = 0;
        for (int i=0; i<1000000; i++) {
            int x = random.nextInt(7);
            int y = random.nextInt(7);
            int z = random.nextInt(7);
            if (x == y && x == z) {
                winCount++;
            }
        }

        System.out.println(winCount);
    }
}
