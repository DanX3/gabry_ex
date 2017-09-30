// Hash function
//
// Voglio estrarre un intero da una stringa, ad esempio un nome
// Il programma deve stampare il modulo di 32 della somma del valore ASCII di ogni
// carattere della stringa
//
// java Esercizio3 string

public class Esercizio3 {
    public static void main(String[] args) {
        long amount = 0l;
        for (int i=0; i<args[0].length(); i++) {
            amount += (int)args[0].charAt(i);
        }
        System.out.println(amount % 32);
    }
}
