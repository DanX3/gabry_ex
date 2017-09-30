// Complete X-Mas tree
//
// Estendi il programma precedente in modo che stampi un albero di Natale
// completo, considerando anche lo spazio iniziale
// Per input 4, l'output dovrebbe essere
//
//       * *
//     * * * *
//   * * * * * *
// * * * * * * * *
//
// Gia' noti che devi fare delle considerazioni prima di cominciare a stampare
// la prima riga
//
// java Esercizio5 int

public class Esercizio5 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        if (size <= 0)
            return;

        int currentsize = 1;
        for (int i=0; i<size; i++) {
            // Initial gap
            for (int j=1; j<size-i; j++) {
                System.out.print("  ");
            }

            // Actual branches
            for (int j=0; j<currentsize*2; j++) {
                System.out.print("* ");
            }
            System.out.println();
            currentsize++;
        }
    }
}
