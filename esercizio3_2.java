public class esercizio3_2 {
    public static void main(String[] args) {
        // crivere un frammento di codice che cambi il valore intero memorizzato nella
        // variabile x nel seguente mod: se x e pari, deve essere diviso per 2 se
        // dispari deve essere moltipliucato pewr 3 e gli deve essere sottratto 1

        int x = 7;

        if (x % 2 == 0) {
            x = x / 2;
        } else {
            x = x * 3 - 1;
        }

        System.out.println("Il nuovo valore di x è: " + x);
    }
}
