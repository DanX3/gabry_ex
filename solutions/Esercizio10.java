// Human Readability
//
// Spesso cio' che e' facile da leggere per una macchina, non lo e' per l'uomo
// Esistono opzioni che convertono un numero con tanti zeri secondo un'altra
// unita' di misura
//
// esempio
//
//     100 -> 100
//    1000 -> 1K
//   10000 -> 10K
// 1000000 -> 1M
//
// dato in input una stringa come nell'esempio. Considerare una stringa per non
// avere errori di overflow e considerare le unita' K, M, G, T
//
// java Esercizio10 str

public class Esercizio10 {

    static char getMagnitudeChar(int m) {
        switch(m) {
            case 0: return ' ';
            case 1: return 'K';
            case 2: return 'M';
            case 3: return 'G';
            case 4: return 'T';
        }
        return 'T';
    }

    public static void main(String[] args) {
        int zeros = args[0].lastIndexOf('0');
        int magnitude = zeros / 3;
        System.out.println("1" + "00".substring(0, (zeros % 3)) + getMagnitudeChar(magnitude));
    }
}
