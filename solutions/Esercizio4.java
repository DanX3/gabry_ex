// Half X-mas tree
//
// Dato un intero stampa cio' che assomiglia a un albero di Natale
// Ad esempio per input '5' genera il seguente output
// 
// *
// * *
// * * *
// * * * *
// * * * * *
//
// java Esercizio4 int

public class Esercizio4 {
    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        if (size <= 0)
            return;

        int currentsize = 1;
        for (int i=0; i<size; i++) {
            for (int j=0; j<currentsize; j++) {
                System.out.print("* ");
            }
            System.out.println();
            currentsize += 1;
        }
    }
}
