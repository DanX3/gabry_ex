// Condition checking
// 
// Ricevuto un intero stampa il resto tra il numero in input e 3
// Controlla che sia effettivamente un intero e non altro
// Non faro' altri esercizi di questo tipo ma e' importante che tu lo sappia
// fare
//
// java Esercizio2 int

public class Esercizio2 {
    public static void main(String[] args) {
        for(int i=0; i<args[0].length(); i++) {
            if ((int) args[0].charAt(i) < (int)'0' || (int)args[0].charAt(i) > (int)'9') {
                return;
            }
        }

        System.out.println(Integer.parseInt(args[0]) % 3);
    }
}
