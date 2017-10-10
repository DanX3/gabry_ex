// Sorting
//
// Crea un vettore di 10 interi con i primi 10 numeri naturali disordinati
// Con qualsiasi algoritmo di ordinamento, ordina il vettore
//
// java Esercizio9
import java.util.Random;

public class Esercizio9 {

    static void selectionSort(int[] v) {
        int temp;
        for (int i=0; i<v.length; i++) {
            int lowestValIdx = i;
            for (int j=i; j<v.length; j++) {
                if (v[j] < v[lowestValIdx]) {
                    lowestValIdx = j;
                }
            }
            // swap current with minimum
            temp = v[i];
            v[i] = v[lowestValIdx];
            v[lowestValIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int[] v = new int[10];
        for (int i=0; i<10; i++) { v[i] = i; }
        
        Random random = new Random(10);
        for (int i=0; i<10; i++) {
            int idxToSwap = random.nextInt(10);
            int temp = v[i];
            v[i] = v[idxToSwap];
            v[idxToSwap] = temp;
        }

        for (int i=0; i<10; i++) { System.out.print(v[i] + " "); } System.out.println();
        selectionSort(v);
        for (int i=0; i<10; i++) { System.out.print(v[i] + " "); } System.out.println();

    }
}
