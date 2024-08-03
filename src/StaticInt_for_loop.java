public class staticInt_for_loop {
    static int x = 10;

    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {

            System.out.println(x);

        }
    }

    }

    /*
    static int x = 10;
Deklariert eine statische Variable x vom Typ int und initialisiert sie mit dem Wert 10.
Da sie static ist, gehört sie zur Klasse selbst und nicht zu einer Instanz der Klasse.
public static void main(String[] args) {
Definiert die main-Methode, der Einstiegspunkt eines Java-Programms.
for (int x = 0; x < 5; x++) {
Beginnt eine for-Schleife:
Deklariert eine lokale Variable x vom Typ int innerhalb der Schleife und initialisiert sie mit 0.
Die Schleife wird ausgeführt, solange x kleiner als 5 ist.
Nach jeder Iteration wird x um 1 erhöht.
System.out.println(x);
Gibt den aktuellen Wert von x innerhalb der Schleife auf der Konsole aus.
Zusammenfassung
Der Code definiert eine Klasse mit einer statischen Variablen x und einer main-Methode. Innerhalb der main-Methode wird eine for-Schleife ausgeführt, die die Werte von 0 bis 4 ausgibt. Die statische Variable x außerhalb der Schleife wird in diesem Beispiel nicht verwendet.

Wichtiger Punkt:
Die lokale Variable x innerhalb der for-Schleife "überschattet" die statische Variable x innerhalb des gleichen Blocks. Das bedeutet, dass innerhalb der Schleife der Wert der lokalen Variable x verwendet wird, nicht der der statischen Variable.
     */
